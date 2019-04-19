package project;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class YandexTrafficSteps {

	private WebDriver webDriver;
	private YandexPage yandexPage;

	public YandexTrafficSteps() {
		// String exePath = "D:\\AUTOMATION\\lesson_18\\chromedriver_win32
		// (1)\\chromedriver.exe";
		// System.setProperty("webdriver.chrome.driver", exePath);
		webDriver = new ChromeDriver();
		yandexPage = new YandexPage(webDriver);

	}

	@Given("^I am on a page with url \"([^\"]*)\" 1$")
	public void loadPageWithUrl(String url) {
		webDriver.get(url);
	}

	@When("^I click on button traffic jams$")
	public void clickOnButtonTrafficJams() {
		yandexPage.clickTrafficLink();
	}

	@Then("^I see traffic is less than \"([^\"]*)\"$")
	public void isTrafficLessThanValue(String value) {

		int actualTraffic = yandexPage.getTrafficValue();
		int expectedTraffic = Integer.parseInt(value);
		Assert.assertTrue(actualTraffic < expectedTraffic);
	}

	@When("^I make screenshot$")
	public void makeScreenshot() {
		// Take screenshot and store as a file format
		File src = ((TakesScreenshot) webDriver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(src, new File("D:\\AUTOMATION\\error.png"));
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

	@After
	public void afterClass() {
		webDriver.quit();
	}
}