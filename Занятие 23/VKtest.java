package PVT.Q;

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
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class VKtest {

	@Test

	public void test() throws URISyntaxException, ClientProtocolException, IOException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://vk.com/id45354786");

		WebElement loginField = driver.findElement(By.xpath(".//input[@name=\"email\"]"));

		WebElement passwordField = driver.findElement(By.xpath(".//input[@name=\"pass\"]"));

		WebElement enterButton = driver
				.findElement(By.xpath(".//button[@class=\"quick_login_button flat_button button_wide\"]"));

		loginField.clear();
		loginField.sendKeys("roma3784@mail.ru");
		passwordField.clear();
		passwordField.sendKeys("romalosev2722037");

		enterButton.click();

		HttpClient client = HttpClientBuilder.create().build();
		URIBuilder builder = new URIBuilder("https://api.vk.com/method/wall.post?");
		builder.setParameter("access_token",
				"4c1f81c4fc934637480c85e1922cddd5a008a0831538afbc1a8beb24c2ad344186b10fe4a88e4dfb48ce8")
				.setParameter("owner_id", "45354786").setParameter("message", "test message111")
				.setParameter("v", "5.92");
		HttpGet request = new HttpGet(builder.build());
		HttpResponse response = client.execute(request);
		String result = EntityUtils.toString(response.getEntity());
		String id = result.replaceAll("[^0-9]", "");

		WebElement text = driver.findElement(By.xpath(".//div[contains(text(), \"test message111\")]"));

		Assert.assertTrue(text.isDisplayed());

		URIBuilder builder1 = new URIBuilder("https://api.vk.com/method/wall.edit?");
		builder1.setParameter("access_token",
				"4c1f81c4fc934637480c85e1922cddd5a008a0831538afbc1a8beb24c2ad344186b10fe4a88e4dfb48ce8")
				.setParameter("owner_id", "45354786").setParameter("post_id", id).setParameter("message", "new message")
				.setParameter("v", "5.92");
		HttpGet request1 = new HttpGet(builder1.build());
		HttpResponse response1 = client.execute(request1);

		Thread.sleep(5000);

		WebElement text1 = driver.findElement(By.xpath(".//div[contains(text(), \"new message\")]"));
		Assert.assertTrue(text1.isDisplayed());

		URIBuilder builder2 = new URIBuilder("https://api.vk.com/method/wall.delete?");
		builder2.setParameter("access_token",
				"4c1f81c4fc934637480c85e1922cddd5a008a0831538afbc1a8beb24c2ad344186b10fe4a88e4dfb48ce8")
				.setParameter("owner_id", "45354786").setParameter("post_id", id).setParameter("v", "5.92");
		HttpGet request2 = new HttpGet(builder2.build());
		HttpResponse response2 = client.execute(request2);

	}

}
