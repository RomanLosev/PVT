package project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class YandexPage {
	private static final int LINK_PRESENSE_TIMEOUT = 10;

	private WebDriver driver;

	@FindBy(xpath = "//a[text()='Пробки']")
	private WebElement trafficLink;

	@FindBy(xpath = "//*[@id='sidebar-container']/div[1]/div/div[1]/div/div/div[2]/div/div[1]/div[1]/div/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]")
	WebElement trafficValue;

	public YandexPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	public int getTrafficValue() {
		String actualText = trafficValue.getText();
		return Integer.parseInt(actualText.substring(7, 8));

	}

	public void clickTrafficLink() {
		trafficLink.click();
	}
}
