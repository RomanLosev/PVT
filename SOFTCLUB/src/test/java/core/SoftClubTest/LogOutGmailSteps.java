package core.SoftClubTest;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LogOutGmailSteps {

	private WebDriver webDriver;
	private LogOutGmailPage logOutGmailPage;

	public LogOutGmailSteps() {
		webDriver = new ChromeDriver();
		logOutGmailPage = new LogOutGmailPage(webDriver);
	}

	@BeforeTest
	public void loadPage() {
		webDriver.get("https://www.gmail.com");
		logOutGmailPage.enterLoginAndPassword("romalosev3784", "qwer1234)");
	}

	@Test
	public void test() {
		logOutGmailPage.logOut();
		Assert.assertTrue(logOutGmailPage.iSeeLogInPage());
	}

	@AfterTest
	public void afterClass() {
		 webDriver.quit();
	}
}
