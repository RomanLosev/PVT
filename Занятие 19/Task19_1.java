package automationFramework;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task19_1 {

	@Test
	public void test() throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.get(
				"https://www.booking.com/searchresults.ru.html?label=gen173nr-1FCAEoggI46AdIM1gEaCWIAQGYAQm4AQbIAQzYAQHoAQH4AQuIAgGoAgO4AsGr0uQFwAIB&sid=8bd1883f87ca3e66d85c21e53f4fe4e3&sb=1&src=index&src_elem=sb&error_url=https%3A%2F%2Fwww.booking.com%2Findex.ru.html%3Flabel%3Dgen173nr-1FCAEoggI46AdIM1gEaCWIAQGYAQm4AQbIAQzYAQHoAQH4AQuIAgGoAgO4AsGr0uQFwAIB%3Bsid%3D8bd1883f87ca3e66d85c21e53f4fe4e3%3Bsb_price_type%3Dtotal%26%3B&ss=%D0%9F%D0%B0%D1%80%D0%B8%D0%B6%2C+%D0%98%D0%BB%D1%8C-%D0%B4%D0%B5-%D0%A4%D1%80%D0%B0%D0%BD%D1%81%2C+%D0%A4%D1%80%D0%B0%D0%BD%D1%86%D0%B8%D1%8F&is_ski_area=0&ssne=%D0%9C%D0%B8%D0%BB%D0%B0%D0%BD&ssne_untouched=%D0%9C%D0%B8%D0%BB%D0%B0%D0%BD&checkin_year=&checkin_month=&checkout_year=&checkout_month=&no_rooms=1&group_adults=2&group_children=0&b_h4u_keep_filters=&from_sf=1&ss_raw=%D0%BF%D0%B0%D1%80%D0%B8%D0%B6&ac_position=0&ac_langcode=ru&ac_click_type=b&dest_id=-1456928&dest_type=city&iata=PAR&place_id_lat=48.856682&place_id_lon=2.351476&search_pageview_id=4c6c382738630021&search_selected=true");
		driver.manage().window().maximize();

		WebElement element = driver.findElement(By.xpath("(.//span[@class=\"c2-day-inner\"])[25]"));

		element.click();

		WebElement element1 = driver
				.findElement(By.xpath("(.//select[@class=\"sb-date-field__select-field js-date-field__select\"])[4]"));

		Select dataOutDropdown = new Select(element1);
		dataOutDropdown.selectByValue("31");

		WebElement element2 = driver.findElement(By.xpath(".//button[@data-sb-id=\"main\"]"));

		element2.click();

		WebElement element3 = driver.findElement(By.xpath("(.//a[@class=\"sort_option \"])[2]"));

		element3.click();

		WebElement linkToHotel = driver.findElement(By.xpath("(.//a[@class =\"hotel_name_link url\"])[1]"));
		Assert.assertTrue(linkToHotel.isDisplayed());

		Thread.sleep(10000);

		WebElement element4 = driver.findElement(By.xpath(".//button[@id=\"sortbar_dropdown_button\"]"));

		element4.click();

		WebElement element5 = driver.findElement(By.xpath("(.//a[@class=\"sort_option \"])[7]"));

		element5.click();

		Thread.sleep(5000);

		WebElement element6 = driver.findElement(By.xpath("(.//img[@class=\"hotel_image\"])[1]"));

		element6.click();

		ArrayList tabs2 = new ArrayList(driver.getWindowHandles());
		driver.switchTo().window((String) tabs2.get(1));

		WebElement exitLink = driver.findElement(By.xpath("(.//button[@id=\"hp_book_now_button\"])[1]"));

		exitLink.click();

		WebElement price = driver.findElement(

				By.xpath("(.//div[@class=\"hprt-price-price \"])[1]"));

		Thread.sleep(2000);
		String priceWithCurrency = price.getText();

		System.out.println(priceWithCurrency);

		int price1 = Integer.parseInt(priceWithCurrency.replaceAll("[^0-9]", ""));

		System.out.println(price1);

		Assert.assertTrue(price1 < 20000);

	}

}
