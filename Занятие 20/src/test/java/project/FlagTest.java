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

public class FlagTest {

	private WebDriver driver;
	private FlagPage flagPage;

	@Before
	public void before() {
		driver = new ChromeDriver();
		flagPage = new FlagPage(driver);
		driver.get("https://www.mail.ru");

	}

	@Test
	public void test() {

		flagPage.enterLoginAndPassword("roma3784", "OUIYphyai44)");
		flagPage.addFlags();
		Assert.assertTrue(flagPage.isAddFlagsPresent1());
		Assert.assertTrue(flagPage.isAddFlagsPresent2());
		Assert.assertTrue(flagPage.isAddFlagsPresent3());
		flagPage.deleteFlags();
		Assert.assertTrue(flagPage.isDeleteFlagsPresent1());
		Assert.assertTrue(flagPage.isDeleteFlagsPresent2());
		Assert.assertTrue(flagPage.isDeleteFlagsPresent3());

	}

	@After
	public void tearDown() {

		driver.quit();
	}

}
