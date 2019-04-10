package project;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BookingTest {

	private WebDriver driver;
	private BookingPage bookingPage;

	@Before
	public void before() {
		driver = new ChromeDriver();
		bookingPage = new BookingPage(driver);
		driver.get("http://www.booking.com");

	}

	@Test
	public void test() {

		bookingPage.enterCityAndData("Москва");

		Assert.assertTrue(bookingPage.islinkHotelPresent());

		bookingPage.clickMaxRatingkHotel();

		bookingPage.clickHotel();

		Assert.assertTrue(bookingPage.ratingButton());

	}

	@After
	public void tearDown() {

		driver.quit();
	}

}
