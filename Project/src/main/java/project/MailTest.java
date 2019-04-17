package project;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.stream.XMLStreamException;

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
import org.xml.sax.SAXException;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import model.Users;
import runner.Run;

public class MailTest {

	private WebDriver webDriver;
	private MailPage mailPage;
	Run run = new Run();

	public MailTest() {

		webDriver = WebDriverSingleton.getInstance();
		mailPage = new MailPage(webDriver);

	}

	@Given("^I am on main application page3$")
	public void loadPage() {
		webDriver.get("https://www.mail.ru");
	}

	@When("^I login as correct user with \"([^\"]*)\" and \"([^\"]*)\" 2$")
	public void enterLoginAndPassword(String login, String password) {
		mailPage.enterLoginAndPassword(login, password);
	}

	@And("^I write and send email$")
	public void writeMail() throws ParserConfigurationException, SAXException, IOException, XMLStreamException {
		mailPage.writeMail(run.getEmail());
	}

	@Then("^I see send message2$")
	public void isSendMessagePresent() {
		Assert.assertTrue(mailPage.isSentedMailElementPresent());
	}

	@After
	public void afterClass() {
		WebDriverSingleton.quit();
	}

}