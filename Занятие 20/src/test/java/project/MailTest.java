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

public class MailTest {

	private WebDriver driver;
	private MailPage mailPage;

	@Before
	public void before() {
		driver = new ChromeDriver();
		mailPage = new MailPage(driver);
		driver.get("https://www.mail.ru");

	}

	@Test
	public void test() {

		mailPage.enterLoginAndPassword("roma3784", "OUIYphyai44)");
		mailPage.writeMail("roma3784@mail.ru  losev@bvgroup.by", "aaaaaaa");
		Assert.assertTrue(mailPage.isSentedMailElementPresent());

	}

	@After
	public void tearDown() {

		driver.quit();
	}

}
