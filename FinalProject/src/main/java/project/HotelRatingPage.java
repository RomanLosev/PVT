package project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HotelRatingPage {
	private static final int LINK_PRESENSE_TIMEOUT = 10;

	private WebDriver driver;

	@FindBy(xpath = ".//input[@type=\"search\"]")
	private WebElement cityField;

	@FindBy(xpath = "(.//span[contains(text(), \"24\")])[1]")
	WebElement dataField;

	@FindBy(xpath = "(.//a[@class =\"hotel_name_link url\"])[1]")
	WebElement linkHotel;

	@FindBy(xpath = ".//button[@id=\"sortbar_dropdown_button\"]")
	WebElement allRating;

	@FindBy(xpath = ".//li[@class=\" sort_category   sort_bayesian_review_score \"]")
	WebElement maxRating;

	@FindBy(xpath = ".//div[@id=\"sr_notice_minimum_number_of_reviews\"]")
	WebElement linkButton;

	@FindBy(xpath = "(.//img[@class=\"hotel_image\"])[1]")
	WebElement firstHotel;

	@FindBy(xpath = ".//div[@class=\"bui-review-score__badge\"]")
	WebElement ratingButton;

	public HotelRatingPage(WebDriver webdriver) {
		PageFactory.initElements(webdriver, this);
		this.driver = webdriver;
	}

	public void enterCityAndData(String city) {

		cityField.sendKeys(city);
		cityField.submit();
		dataField.click();
		dataField.submit();

	}

	public boolean isHotelsPresents() {
		return (new WebDriverWait(driver, LINK_PRESENSE_TIMEOUT)).until(ExpectedConditions.visibilityOf(linkHotel))
				.isDisplayed();
	}

	public void clickMaxRatingHotel() {

		allRating.click();
		maxRating.click();
		new WebDriverWait(driver, LINK_PRESENSE_TIMEOUT).until(ExpectedConditions.visibilityOfAllElements(linkButton));
		firstHotel.click();

	}

	public double getRatingHotelValue() {
		String raiting = ratingButton.getText();
		String raiting1 = raiting.replaceAll(",", ".");
		double raiting2 = Double.parseDouble(raiting1);

		return raiting2;

	}

}
