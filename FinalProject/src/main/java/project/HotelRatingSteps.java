package project;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import model.Users;

public class HotelRatingSteps {
	private WebDriver webDriver;
	private HotelRatingPage hotelRatingPage;

	public HotelRatingSteps() {
		webDriver = WebDriverSingleton.getInstance();
		hotelRatingPage = new HotelRatingPage(webDriver);
	}

	@Given("^I am on a page with url \"([^\"]*)\"$")
	public void loadPageWithUrl(String url) {
		webDriver.get(url);
	}

	@When("^I enter \"([^\"]*)\"$")
	public void enterCityAndData(String city) {
		hotelRatingPage.enterCityAndData(city);
	}

	@Then("^I see hotels$")
	public void seeHotels() {

		Assert.assertTrue(hotelRatingPage.isHotelsPresents());
	}

	@And("^I choose max rating hotel$")
	public void maxRatingHotel() {
		hotelRatingPage.clickMaxRatingHotel();

	}

	@Then("^I see hotel rating is more than \"([^\"]*)\"$")
	public void isHotelRaitingMoreThanValue(String value) {
		double actualRaiting = hotelRatingPage.getRatingHotelValue();
		double expectedRaiting = Double.parseDouble(value);
		Assert.assertTrue(actualRaiting >= expectedRaiting);
	}

	@After
	public void afterClass() {
		WebDriverSingleton.quit();
	}
}
