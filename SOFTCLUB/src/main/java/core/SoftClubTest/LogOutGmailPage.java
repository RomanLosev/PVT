package core.SoftClubTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LogOutGmailPage {

	@FindBy(xpath = ".//input[@type=\"email\"]")
	WebElement loginField;

	@FindBy(xpath = ".//span[@class=\"RveJvd snByac\"]")
	WebElement enterButtonLogin;

	@FindBy(xpath = ".//input[@type=\"password\"]")
	WebElement passwordField;

	@FindBy(xpath = "(.//span[@class=\"RveJvd snByac\"])[1]")
	WebElement enterButtonPassword;

	@FindBy(xpath = ".//span[@class=\"gb_xa gbii\"]")
	WebElement userButton;

	@FindBy(xpath = ".//a[contains(text(), \"Выйти\")]")
	WebElement logOutButton;

	private WebDriver driver;
	private WebDriverWait wait;

	public LogOutGmailPage(WebDriver webDriver) {
		this.driver = webDriver;
		wait = new WebDriverWait(driver, 10);
		PageFactory.initElements(driver, this);
	}

	public void enterLoginAndPassword(String login, String password) {
		loginField.clear();
		loginField.sendKeys(login);
		enterButtonLogin.click();
		wait.until(ExpectedConditions.visibilityOf(passwordField));
		passwordField.clear();
		passwordField.sendKeys(password);
		enterButtonPassword.click();
		wait.until(ExpectedConditions.titleContains("Входящие"));
	}

	public void logOut() {
		userButton.click();
		logOutButton.click();
	}

	public boolean iSeeLogInPage() {
		return (wait.until(ExpectedConditions.visibilityOf(passwordField)).isDisplayed());
	}
}
