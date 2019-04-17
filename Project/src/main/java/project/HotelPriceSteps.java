package project;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HotelPriceSteps {
	private WebDriver webDriver;
	private HotelPricePage hotelPricePage;

	public HotelPriceSteps() {
		webDriver = WebDriverSingleton.getInstance();
		hotelPricePage = new HotelPricePage(webDriver);
	}

	@Given("^I am on a page with url$")
	public void loadPageWithUrl() {
		webDriver.get(
				"https://www.booking.com/searchresults.ru.html?label=gen173nr-1FCAEoggI46AdIM1gEaCWIAQGYAQm4AQbIAQzYAQHoAQH4AQuIAgGoAgO4AsGr0uQFwAIB&sid=8bd1883f87ca3e66d85c21e53f4fe4e3&sb=1&src=index&src_elem=sb&error_url=https%3A%2F%2Fwww.booking.com%2Findex.ru.html%3Flabel%3Dgen173nr-1FCAEoggI46AdIM1gEaCWIAQGYAQm4AQbIAQzYAQHoAQH4AQuIAgGoAgO4AsGr0uQFwAIB%3Bsid%3D8bd1883f87ca3e66d85c21e53f4fe4e3%3Bsb_price_type%3Dtotal%26%3B&ss=%D0%9F%D0%B0%D1%80%D0%B8%D0%B6%2C+%D0%98%D0%BB%D1%8C-%D0%B4%D0%B5-%D0%A4%D1%80%D0%B0%D0%BD%D1%81%2C+%D0%A4%D1%80%D0%B0%D0%BD%D1%86%D0%B8%D1%8F&is_ski_area=0&ssne=%D0%9C%D0%B8%D0%BB%D0%B0%D0%BD&ssne_untouched=%D0%9C%D0%B8%D0%BB%D0%B0%D0%BD&checkin_year=&checkin_month=&checkout_year=&checkout_month=&no_rooms=1&group_adults=2&group_children=0&b_h4u_keep_filters=&from_sf=1&ss_raw=%D0%BF%D0%B0%D1%80%D0%B8%D0%B6&ac_position=0&ac_langcode=ru&ac_click_type=b&dest_id=-1456928&dest_type=city&iata=PAR&place_id_lat=48.856682&place_id_lon=2.351476&search_pageview_id=4c6c382738630021&search_selected=true");
	}

	@When("^I enter data$")
	public void enterData() {
		hotelPricePage.enterData();
	}

	@And("^I find cheapest hotels$")
	public void findCheapestHotels() {
		hotelPricePage.findCheapestHotels();

	}

	@Then("^I see cheapest hotels$")
	public void seeCheapestHotels() {

		Assert.assertTrue(hotelPricePage.isCheapestHotelsPresents());
	}

	@And("^I find max rating hotels$")
	public void maxRatingHotel() throws InterruptedException {
		hotelPricePage.findMaxRatingHotels();

	}

	@Then("^I see hotel price is less than \"([^\"]*)\"$")
	public void isHotelPriceLessThanValue(String value) {
		int actualPrice = hotelPricePage.getPriceHotel();
		int expectedPrice = Integer.parseInt(value);
		Assert.assertTrue(actualPrice <= expectedPrice);
	}

	@After
	public void afterClass() {
		WebDriverSingleton.quit();
	}
}
