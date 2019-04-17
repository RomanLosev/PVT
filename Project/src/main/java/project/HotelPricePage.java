package project;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HotelPricePage {
	private static final int LINK_PRESENSE_TIMEOUT = 10;

	private WebDriver driver;

	@FindBy(xpath = "(.//span[@class=\"c2-day-inner\"])[25]")
	private WebElement enterDataIn;

	@FindBy(xpath = "(.//select[@class=\"sb-date-field__select-field js-date-field__select\"])[4]")
	WebElement enterDataOut;

	@FindBy(xpath = ".//button[@data-sb-id=\"main\"]")
	WebElement enterButton;

	@FindBy(xpath = "(.//a[@class=\"sort_option \"])[2]")
	WebElement cheapHotelButton;

	@FindBy(xpath = ".//div[@id=\"sr_notice_no_dorms\"]")
	WebElement cheapHotelButton1;

	@FindBy(xpath = "(.//img[@class=\"hotel_image\"])[1]")
	WebElement linkHotel;

	@FindBy(xpath = "(.//img[@class=\"hotel_image\"])[1]")
	WebElement linkHotel1;

	@FindBy(xpath = ".//div[@id=\"sr_notice_minimum_number_of_reviews\"]")
	WebElement linkHotel2;

	@FindBy(xpath = ".//button[@id=\"sortbar_dropdown_button\"]")
	WebElement sortButton;

	@FindBy(xpath = "(.//a[@class=\"sort_option \"])[7]")
	WebElement maxRatingHotelButton;

	@FindBy(xpath = "(.//button[@id=\"hp_book_now_button\"])[1]")
	WebElement exitLink;

	@FindBy(xpath = "(.//div[@class=\"hprt-price-price \"])[1]")
	WebElement price;

	public HotelPricePage(WebDriver webdriver) {
		PageFactory.initElements(webdriver, this);
		this.driver = webdriver;

	}

	public void enterData() {

		enterDataIn.click();
		Select dataOutDropdown = new Select(enterDataOut);
		dataOutDropdown.selectByValue("30");
		enterButton.click();
	}

	public void findCheapestHotels() {

		cheapHotelButton.click();

		new WebDriverWait(driver, LINK_PRESENSE_TIMEOUT)
				.until(ExpectedConditions.visibilityOfAllElements(cheapHotelButton1));

	}

	public boolean isCheapestHotelsPresents() {
		return linkHotel.isDisplayed();

	}

	public void findMaxRatingHotels() throws InterruptedException {

		sortButton.click();

		new WebDriverWait(driver, LINK_PRESENSE_TIMEOUT)
				.until(ExpectedConditions.visibilityOfAllElements(maxRatingHotelButton));
		maxRatingHotelButton.click();

		new WebDriverWait(driver, LINK_PRESENSE_TIMEOUT).until(ExpectedConditions.visibilityOfAllElements(linkHotel2));
		linkHotel1.click();
		ArrayList tabs2 = new ArrayList(driver.getWindowHandles());
		driver.switchTo().window((String) tabs2.get(1));

	}

	public int getPriceHotel() {

		exitLink.click();

		String priceWithCurrency = price.getText();

		int price1 = Integer.parseInt(priceWithCurrency.replaceAll("[^0-9]", ""));

		return price1;

	}

}