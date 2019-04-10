package project;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SpamTest1 {

	private WebDriver driver;
	private SpamPage1 spamPage;

	@Before
	public void before() {
		driver = new ChromeDriver();
		spamPage = new SpamPage1(driver);
		driver.get("https://www.mail.ru");

	}

	@Test
	public void test() {

		spamPage.enterLoginAndPassword("roma3784", "OUIYphyai44)");

		spamPage.clickSpamButton();
		Assert.assertTrue(spamPage.isSpamElementPresent());

	}

	@After
	public void tearDown() {

		driver.quit();
	}

}
