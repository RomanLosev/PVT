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
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import ru.yandex.qatools.allure.annotations.Attachment;

public class VKTest {

	private static final Logger logger = Logger.getLogger(VKTest.class);
	private WebDriver webDriver;
	private VKPage vkpage;

	public VKTest() {
		webDriver = WebDriverSingleton.getInstance();
		vkpage = new VKPage(webDriver);

	}

	@Given("^I am on main application page4$")
	public void loadPage() {
		webDriver.get("https://vk.com/id45354786");
	}

	@When("^I login as correct user1$")
	public void enterLoginAndPassword() {
		logger.info("¬водим логин и пароль");
		vkpage.enterLoginAndPassword("roma3784@mail.ru", "romalosev2722037");
	}

	@Then("^I enter message$")
	public void enterMessage() throws ClientProtocolException, URISyntaxException, IOException, InterruptedException {
		vkpage.enterMessage();
	}

	@After
	public void afterClass() {
		WebDriverSingleton.quit();
	}

}
