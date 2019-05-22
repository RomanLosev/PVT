package core.SoftClubTest;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MailGmailSteps {

	private WebDriver webDriver;
	private MailGmailPage mailGmailPage;

	public MailGmailSteps() {
		webDriver = new ChromeDriver();
		mailGmailPage = new MailGmailPage(webDriver);
	}

	@BeforeTest
	public void loadPage() {
		webDriver.get("https://www.gmail.com");
		mailGmailPage.enterLoginAndPassword("romalosev3784", "qwer1234)");
	}

	@Test
	public void test() {
		mailGmailPage.sendEmail("romalosev3784@gmail.com", "testEmail", "Hellow");
		Assert.assertTrue(mailGmailPage.isSentEmailPresent());
	}

	@AfterTest
	public void afterClass() {
		mailGmailPage.logOut();
	    webDriver.quit();
	}
}