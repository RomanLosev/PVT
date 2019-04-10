package project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SpamPage {

	@FindBy(xpath = ".//input[@id=\"mailbox:login\"]")
	WebElement loginField;

	@FindBy(xpath = ".//input[@id=\"mailbox:password\"]")
	WebElement passwordField;

	@FindBy(xpath = ".//input[@class=\"o-control\"]")
	WebElement enterButton;

	@FindBy(xpath = "(.//div[@class=\"js-item-checkbox b-datalist__item__cbx\"])[1]")
	WebElement checkMail;

	@FindBy(xpath = "(.//span[@class=\"b-toolbar__btn__text b-toolbar__btn__text_pad\"])[6]")
	WebElement spamButton;

	@FindBy(xpath = "//*[contains(text(), \"Письмо перемещено в папку\")]")
	WebElement SpamElement;

	private WebDriver driver;
	private WebDriverWait wait;

	public SpamPage(WebDriver driver) {
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

		checkMail.click();
		spamButton.click();
		wait.until(ExpectedConditions.visibilityOfAllElements(SpamElement));

	}

	public boolean isSpamElementPresent() {

		return SpamElement.isDisplayed();
	}

}
