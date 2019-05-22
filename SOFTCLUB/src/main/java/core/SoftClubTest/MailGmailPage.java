package core.SoftClubTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MailGmailPage {

	@FindBy(xpath = ".//input[@type=\"email\"]")
	WebElement loginField;

	@FindBy(xpath = ".//span[@class=\"RveJvd snByac\"]")
	WebElement enterButtonLogin;

	@FindBy(xpath = ".//input[@type=\"password\"]")
	WebElement passwordField;

	@FindBy(xpath = "(.//span[@class=\"RveJvd snByac\"])[1]")
	WebElement enterButtonPassword;

	@FindBy(xpath = ".//div[@class=\"T-I J-J5-Ji T-I-KE L3\"]")
	WebElement createMailButton;

	@FindBy(xpath = "//*[contains(text(), \"Новое сообщение\")]")
	WebElement eMailButton;

	@FindBy(xpath = ".//textarea[@aria-label=\"Кому\"]")
	WebElement emailField;

	@FindBy(xpath = ".//input[@name=\"subjectbox\"]")
	WebElement topicField;

	@FindBy(xpath = ".//div[@aria-label=\"Тело письма\"]")
	WebElement textField;

	@FindBy(xpath = ".//div[@class=\"T-I J-J5-Ji aoO v7 T-I-atl L3\"]")
	WebElement sendEmail;

	@FindBy(xpath = ".//span[contains(text(), \"Письмо отправлено\")]")
	WebElement sentEmail;

	@FindBy(xpath = "(.//span[contains(text(),\"testEmail\")])[2]")
	WebElement checkEmail;

	@FindBy(xpath = ".//span[@class=\"gb_xa gbii\"]")
	WebElement userButton;

	@FindBy(xpath = ".//a[contains(text(), \"Выйти\")]")
	WebElement logOutButton;

	private WebDriver driver;
	private WebDriverWait wait;

	public MailGmailPage(WebDriver webDriver) {
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

	public void sendEmail(String email, String topic, String text) {
		createMailButton.click();
		wait.until(ExpectedConditions.visibilityOf(eMailButton));
		emailField.sendKeys(email);
		topicField.sendKeys(topic);
		textField.sendKeys(text);
		sendEmail.click();
		wait.until(ExpectedConditions.visibilityOf(sentEmail));
	}

	public boolean isSentEmailPresent() {
		return (wait.until(ExpectedConditions.visibilityOf(checkEmail)).isDisplayed());
	}

	public void logOut() {
		userButton.click();
		logOutButton.click();
	}
}