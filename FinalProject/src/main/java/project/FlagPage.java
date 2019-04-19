package project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FlagPage {

	@FindBy(xpath = ".//input[@id=\"mailbox:login\"]")
	WebElement loginField;

	@FindBy(xpath = ".//input[@id=\"mailbox:password\"]")
	WebElement passwordField;

	@FindBy(xpath = ".//input[@class=\"o-control\"]")
	WebElement enterButton;

	@FindBy(xpath = "(.//div[@data-bem=\"b-flag\"])[1]")
	WebElement addFlag1;

	@FindBy(xpath = "(.//div[@data-bem=\"b-flag\"])[2]")
	WebElement addFlag2;

	@FindBy(xpath = "(.//div[@data-bem=\"b-flag\"])[3]")
	WebElement addFlag3;

	@FindBy(xpath = "(.//div[@data-title=\"Снять флажок\"])[1]")
	WebElement checkFlag1;

	@FindBy(xpath = "(.//div[@data-title=\"Снять флажок\"])[2]")
	WebElement checkFlag2;

	@FindBy(xpath = "(.//div[@data-title=\"Снять флажок\"])[3]")
	WebElement checkFlag3;

	@FindBy(xpath = "(.//div[@class=\"b-dropdown__arrow\"])[2]")
	WebElement flagButton1;

	@FindBy(xpath = "(.//span[@class=\"b-dropdown__list__item__text\"])[15]")
	WebElement flagButton2;

	@FindBy(xpath = "(.//span[@class=\"b-dropdown__ctrl__text\"])[5]")
	WebElement flagButton3;

	@FindBy(xpath = "(.//span[@class=\"b-dropdown__list__item__text\"])[21]")
	WebElement flagButton4;

	private WebDriver driver;
	private WebDriverWait wait;

	public FlagPage(WebDriver driver) {
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

	public void addFlags() {

		addFlag1.click();
		addFlag2.click();
		addFlag3.click();

	}

	public boolean isAddFlagsPresent1() {
		wait.until(ExpectedConditions.visibilityOfAllElements(checkFlag1));
		return checkFlag1.isDisplayed();

	}

	public boolean isAddFlagsPresent2() {
		wait.until(ExpectedConditions.visibilityOfAllElements(checkFlag2));
		return checkFlag2.isDisplayed();

	}

	public boolean isAddFlagsPresent3() {
		wait.until(ExpectedConditions.visibilityOfAllElements(checkFlag3));
		return checkFlag3.isDisplayed();

	}

	public void deleteFlags() {

		wait.until(ExpectedConditions.visibilityOfAllElements(flagButton1));
		flagButton1.click();
		wait.until(ExpectedConditions.visibilityOfAllElements(flagButton2));
		flagButton2.click();
		wait.until(ExpectedConditions.visibilityOfAllElements(flagButton3));
		flagButton3.click();
		wait.until(ExpectedConditions.visibilityOfAllElements(flagButton4));
		flagButton4.click();

	}

	public boolean isDeleteFlagsPresent1() {
		wait.until(ExpectedConditions.visibilityOfAllElements(addFlag1));
		return addFlag1.isDisplayed();

	}

	public boolean isDeleteFlagsPresent2() {
		wait.until(ExpectedConditions.visibilityOfAllElements(addFlag2));
		return addFlag2.isDisplayed();

	}

	public boolean isDeleteFlagsPresent3() {
		wait.until(ExpectedConditions.visibilityOfAllElements(addFlag3));
		return addFlag3.isDisplayed();

	}

}
