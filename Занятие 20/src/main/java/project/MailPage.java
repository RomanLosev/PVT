package project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MailPage {


    @FindBy(xpath = ".//input[@id=\"mailbox:login\"]")
	WebElement loginField;

	@FindBy(xpath = ".//input[@id=\"mailbox:password\"]")
	WebElement passwordField;

	@FindBy(xpath = ".//input[@class=\"o-control\"]")
	WebElement enterButton;

	@FindBy(xpath = "(.//span[@class=\"b-toolbar__btn__text b-toolbar__btn__text_pad\"])[1]")
        WebElement writeMailButton;

	@FindBy(xpath = ".//textarea[@tabindex=\"4\"]")
	WebElement adressMail;

	@FindBy(xpath = ".//span[@id=\"toolkit-155475240811541composeEditor_parent\"]")
	WebElement textMail;

	@FindBy(xpath = "(.//span[@class=\"b-toolbar__btn__text\"])[1]")
	WebElement sentMail;

    @FindBy(xpath = "(//*[contains(text(), \"Ваше\")])[1]")
	WebElement sentedMail;
    
    @FindBy(xpath = ".//iframe[@id=\"toolkit-155492255042142composeEditor_ifr\"]")
	WebElement frame;

    @FindBy(xpath = "(.//button[@class=\"btn btn_stylish btn_main confirm-ok\"])[2]")
	WebElement continueButton;

    
    
    
	private WebDriver driver;
	private WebDriverWait wait;

	public MailPage(WebDriver driver) {
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

	public void writeMail(String adress,String text) {

		
             
                writeMailButton.click();
                adressMail.sendKeys(adress);
             //   driver.switchTo().frame(frame);
              //  continueButton.click();
             //   textMail.click();
             //   textMail.sendKeys(text);
                sentMail.click();
                wait.until(ExpectedConditions.visibilityOfAllElements(continueButton));
                continueButton.click();
                wait.until(ExpectedConditions.visibilityOfAllElements(sentedMail));

	}


	public boolean isSentedMailElementPresent() {

		return sentedMail.isDisplayed();
	}

}
