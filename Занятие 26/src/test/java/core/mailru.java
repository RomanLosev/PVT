package core;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class mailru {


	private WebDriver driver;
	private LoginPage loginPage;
	CorrectUser correctUser = new CorrectUser();
	
	@Before
	public void before() {
		driver = new ChromeDriver();
		loginPage = new LoginPage(driver);
		driver.get("https://www.mail.ru");
		
	}

	@Test
	public void test() {

		loginPage.enterLoginAndPassword(correctUser.getLogin(), correctUser.getPassword());
		loginPage.clickEnterButton();
		
		Assert.assertTrue(loginPage.isExitLinkPresent());

	}

	@After
	public void tearDown() {

		driver.quit();
	}

}