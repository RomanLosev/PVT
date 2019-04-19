package project;

import static org.junit.Assert.*;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.concurrent.TimeUnit;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class VKPage {

	@FindBy(xpath = ".//input[@name=\"email\"]")
	WebElement loginField;

	@FindBy(xpath = ".//input[@name=\"pass\"]")
	WebElement passwordField;

	@FindBy(xpath = ".//button[@class=\"quick_login_button flat_button button_wide\"]")
	WebElement enterButton;

	@FindBy(xpath = ".//div[contains(text(), \"test message111\")]")
	WebElement text;

	@FindBy(xpath = ".//div[contains(text(), \"new message\")]")
	WebElement text1;

	private WebDriver driver;
	private WebDriverWait wait;

	public VKPage(WebDriver driver) {
		this.driver = driver;
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		wait = new WebDriverWait(driver, 10);
		PageFactory.initElements(driver, this);
		// HttpClient client = HttpClientBuilder.create().build();
	}

	HttpClient client = HttpClientBuilder.create().build();

	public void enterLoginAndPassword(String login, String password) {

		loginField.clear();
		loginField.sendKeys(login);
		passwordField.clear();
		passwordField.sendKeys(password);
		enterButton.click();

	}

	public void enterMessage() throws URISyntaxException, ClientProtocolException, IOException, InterruptedException {

		HttpClient client = HttpClientBuilder.create().build();
		URIBuilder builder = new URIBuilder("https://api.vk.com/method/wall.post?");
		builder.setParameter("access_token",
				"ef71438e6b674a9bb9dd6d75e73fb2377334ae06ec01beb00e5291d378d821beae5835d15cb53c05cb46a")
				.setParameter("owner_id", "45354786").setParameter("message", "test message111")
				.setParameter("v", "5.92");
		HttpGet request = new HttpGet(builder.build());
		HttpResponse response = client.execute(request);
		String result = EntityUtils.toString(response.getEntity());
		String id = result.replaceAll("[^0-9]", "");

		
		wait.until(ExpectedConditions.visibilityOfAllElements(text));
		Assert.assertTrue(text.isDisplayed());

		URIBuilder builder1 = new URIBuilder("https://api.vk.com/method/wall.edit?");
		builder1.setParameter("access_token",
				"ef71438e6b674a9bb9dd6d75e73fb2377334ae06ec01beb00e5291d378d821beae5835d15cb53c05cb46a")
				.setParameter("owner_id", "45354786").setParameter("post_id", id).setParameter("message", "new message")
				.setParameter("v", "5.92");
		HttpGet request1 = new HttpGet(builder1.build());
		HttpResponse response1 = client.execute(request1);

		Assert.assertTrue(text1.isDisplayed());

		URIBuilder builder2 = new URIBuilder("https://api.vk.com/method/wall.delete?");
		builder2.setParameter("access_token",
				"ef71438e6b674a9bb9dd6d75e73fb2377334ae06ec01beb00e5291d378d821beae5835d15cb53c05cb46a")
				.setParameter("owner_id", "45354786").setParameter("post_id", id).setParameter("v", "5.92");
		HttpGet request2 = new HttpGet(builder2.build());
		HttpResponse response2 = client.execute(request2);

	}
}