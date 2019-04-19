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

public class FlagTest {

	private WebDriver webDriver;
	private FlagPage flagPage;

	public FlagTest() {
		webDriver = new ChromeDriver();
		flagPage = new FlagPage(webDriver);

	}

	@Given("^I am on main application page5$")
	public void loadPage() {
		webDriver.get("https://www.mail.ru");
	}

	@When("^I login as correct user with \"([^\"]*)\" and \"([^\"]*)\" 3$")
	public void enterLoginAndPassword(String login, String password) {
		flagPage.enterLoginAndPassword(login, password);
	}

	@And("^I flagging emails$")
	public void addFlags() {
		flagPage.addFlags();
	}

	@Then("^I see flagging emails$")
	public void isFlafEmailsPresent() {
		Assert.assertTrue(flagPage.isAddFlagsPresent1());
		Assert.assertTrue(flagPage.isAddFlagsPresent2());
		Assert.assertTrue(flagPage.isAddFlagsPresent3());

	}

	@And("^I delete flagging emails$")
	public void deleteFlags() {
		flagPage.deleteFlags();
	}

	@Then("^I see delete flagging emails$")
	public void isDeleteFlafEmailsPresent() {
		Assert.assertTrue(flagPage.isDeleteFlagsPresent1());
		Assert.assertTrue(flagPage.isDeleteFlagsPresent2());
		Assert.assertTrue(flagPage.isDeleteFlagsPresent3());
	}

	@After
	public void afterClass() {
		webDriver.quit();
	}

}