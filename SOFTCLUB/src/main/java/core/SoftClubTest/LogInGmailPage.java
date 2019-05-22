package core.SoftClubTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LogInGmailPage {

	@FindBy(xpath = ".//input[@type=\"email\"]")
	WebElement loginField;

	@FindBy(xpath = ".//span[@class=\"RveJvd snByac\"]")
	WebElement enterButtonLogin;

	@FindBy(xpath = ".//input[@type=\"password\"]")
	WebElement passwordField;

	@FindBy(xpath = "(.//span[@class=\"RveJvd snByac\"])[1]")
	WebElement enterButtonPassword;

	private WebDriver driver;
	private WebDriverWait wait;

	public LogInGmailPage(WebDriver webDriver) {
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
	}

	public boolean iSeeMainPage() {
		return (wait.until(ExpectedConditions.titleContains("Входящие")));
	}
}
