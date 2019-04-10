package project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SpamPage1 {

	@FindBy(xpath = ".//input[@id=\"mailbox:login\"]")
	WebElement loginField;

	@FindBy(xpath = ".//input[@id=\"mailbox:password\"]")
	WebElement passwordField;

	@FindBy(xpath = ".//input[@class=\"o-control\"]")
	WebElement enterButton;

	@FindBy(xpath = "(.//span[@class=\"b-nav__item__text\"])[6]")
	WebElement spamButton1;

	@FindBy(xpath = "(.//span[@class=\"btn__text\"])[5]")
	WebElement checkButton;

	@FindBy(xpath = "(.//div[@data-bem=\"b-checkbox\"])[30]")
	WebElement checkMail;

	@FindBy(xpath = "(.//span[@class=\"b-toolbar__btn__text b-toolbar__btn__text_pad\"])[11]")
	WebElement spamButton;

	@FindBy(xpath = "//*[contains(text(),\"Письмо перемещено в папку\")]")
	WebElement SpamElement;

	private WebDriver driver;
	private WebDriverWait wait;

	public SpamPage1(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver, 10);
		PageFactory.initElements(driver, this);

	}

	public void enterLoginAndPassword(String login, String password) {

		loginField.clear();
		loginField.sendKeys(login);
		passwordField.clear();
		passwordField.sendKeys(password);
		enterButton.click();
		wait.until(ExpectedConditions.titleContains("Входящие"));
	}

	public void clickSpamButton() {

		spamButton1.click();
		wait.until(ExpectedConditions.visibilityOfAllElements(checkButton));
		checkMail.click();
		spamButton.click();
		wait.until(ExpectedConditions.visibilityOfAllElements(SpamElement));

	}

	public boolean isSpamElementPresent() {

		return SpamElement.isDisplayed();
	}

}