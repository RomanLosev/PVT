package core.Task22;

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

public class HotelRatingSteps {

	private HotelRatingPage bookingMainPage;
	private WebDriver webDriver;

	public HotelRatingSteps() {
		webDriver = new ChromeDriver();
		bookingMainPage = new HotelRatingPage(webDriver);
	}

	@Given("^I am on a page with url \"([^\"]*)\"$")
	public void loadPageWithUrl(String url) {
		webDriver.get(url);
	}

	@When("^I enter \"([^\"]*)\"$")
	public void enterCityAndData(String city) {
		bookingMainPage.enterCityAndData(city);
	}

	@Then("^I see hotels$")
	public void seeHotels() {

                 Assert.assertTrue(bookingMainPage.isHotelsPresents());
}

	@And("^I choose max rating hotel$")
        public void maxRatingHotel() {
                 bookingMainPage.clickMaxRatingHotel();

         }
 
        
	@Then("^I see hotel rating is more than \"([^\"]*)\"$")
        public void isHotelRaitingMoreThanValue(String value){
          double actualRaiting = bookingMainPage.getRatingHotelValue();          
          double expectedRaiting = Double.parseDouble(value);
          Assert.assertTrue(actualRaiting >= expectedRaiting);
}
	

	@After
	public void afterClass() {
	//	webDriver.quit();
	}
}
