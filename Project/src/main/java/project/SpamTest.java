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

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SpamTest {

	private WebDriver webDriver;
	private SpamPage spamPage;

	public SpamTest() {
		webDriver = WebDriverSingleton.getInstance();
		spamPage = new SpamPage(webDriver);

	}

	@Given("^I am on main application page1$")
	public void loadPage() {
		webDriver.get("https://www.mail.ru");
	}

	@When("^I login as correct user with \"([^\"]*)\" and \"([^\"]*)\"$")
	public void enterLoginAndPassword(String login, String password) {
		spamPage.enterLoginAndPassword(login, password);
	}

	@And("^I send email to spam$")
	public void clickSpamButton() {
		spamPage.clickSpamButton();
	}

	@Then("^I see send message$")
	public void isSendMessagePresent() {
		Assert.assertTrue(spamPage.isSpamElementPresent());
	}

	@After
	public void afterClass() {
		WebDriverSingleton.quit();
	}

}