package core.SoftClubTest;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LogInGmailSteps {

	private WebDriver webDriver;
	private LogInGmailPage logInGmailPage;

	public LogInGmailSteps() {
		webDriver = new ChromeDriver();
		logInGmailPage = new LogInGmailPage(webDriver);
	}

	@BeforeTest
	public void loadPage() {
		webDriver.get("https://www.gmail.com");
	}

	@Test
	public void test() {
		logInGmailPage.enterLoginAndPassword("romalosev3784", "qwer1234)");
		Assert.assertTrue(logInGmailPage.iSeeMainPage());
	}

	@AfterTest
	public void afterClass() {
		webDriver.quit();
	}
}