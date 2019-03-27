package project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BookingPage {

	@FindBy(xpath = ".//input[@type=\"search\"]")
	WebElement cityField;

	@FindBy(xpath = "(.//span[contains(text(), \"30\")])[1]")
	WebElement dataField;

	@FindBy(xpath = "(.//img[@class=\"hotel_image\"])[1]")
	WebElement linkHotel;

	@FindBy(xpath = ".//button[@id=\"sortbar_dropdown_button\"]")
	WebElement allRating;

	@FindBy(xpath = ".//li[@class=\" sort_category   sort_bayesian_review_score \"]")
	WebElement maxRating;

	@FindBy(xpath = "//*[@id=\"map-header-cta\"]")
	WebElement linkButton;

	@FindBy(xpath = "(.//a[@class=\"hotel_name_link url\"])[1]")
	WebElement firstHotel;

	@FindBy(xpath = ".//div[@class=\"bui-review-score__badge\"]")
	WebElement ratingButton;

	private WebDriver driver;
	private WebDriverWait wait;

	public BookingPage(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver, 10);
		PageFactory.initElements(driver, this);

	}

	public void enterCityAndData(String city) {

		cityField.sendKeys(city);
		cityField.submit();
		dataField.click();
		dataField.submit();

	}

	public boolean islinkHotelPresent() {

		return linkHotel.isDisplayed();
	}

	public void clickMaxRatingkHotel() {

		allRating.click();
		maxRating.click();

	}

	public void clickHotel() throws Throwable {

		Thread.sleep(10000);

		firstHotel.click();

	}

	public boolean ratingButton() {

		String raiting = ratingButton.getText();
		String raiting1 = raiting.replaceAll(",", ".");
		double raiting2 = Double.parseDouble(raiting1);

		return raiting2 >= 9;

	}

}
