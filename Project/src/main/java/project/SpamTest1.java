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

public class SpamTest1 {

	private WebDriver webDriver;
	private SpamPage1 spamPage1;

	public SpamTest1() {
		webDriver = WebDriverSingleton.getInstance();
		spamPage1 = new SpamPage1(webDriver);

	}

	@Given("^I am on main application page2$")
	public void loadPage() {
		webDriver.get("https://www.mail.ru");
	}

	@When("^I login as correct user with \"([^\"]*)\" and \"([^\"]*)\" 1$")
	public void enterLoginAndPassword(String login, String password) {
		spamPage1.enterLoginAndPassword(login, password);
	}

	@And("^I extract email from spam$")
	public void clickSpamButton() {
		spamPage1.clickSpamButton();
	}

	@Then("^I see send message1$")
	public void isSendMessagePresent() {
		Assert.assertTrue(spamPage1.isSpamElementPresent());
	}

	@After
	public void afterClass() {
		WebDriverSingleton.quit();
	}

}
