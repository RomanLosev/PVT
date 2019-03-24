package automationFramework;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Task19_2 {

	@Test
	public void test() throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.get(
				"https://www.booking.com/searchresults.ru.html?label=gen173nr-1FCAEoggI46AdIM1gEaCWIAQGYAQm4AQbIAQzYAQHoAQH4AQuIAgGoAgO4AsGr0uQFwAIB&sid=8bd1883f87ca3e66d85c21e53f4fe4e3&sb=1&src=index&src_elem=sb&error_url=https%3A%2F%2Fwww.booking.com%2Findex.ru.html%3Flabel%3Dgen173nr-1FCAEoggI46AdIM1gEaCWIAQGYAQm4AQbIAQzYAQHoAQH4AQuIAgGoAgO4AsGr0uQFwAIB%3Bsid%3D8bd1883f87ca3e66d85c21e53f4fe4e3%3Bsb_price_type%3Dtotal%26%3B&ss=%D0%9F%D0%B0%D1%80%D0%B8%D0%B6%2C+%D0%98%D0%BB%D1%8C-%D0%B4%D0%B5-%D0%A4%D1%80%D0%B0%D0%BD%D1%81%2C+%D0%A4%D1%80%D0%B0%D0%BD%D1%86%D0%B8%D1%8F&is_ski_area=0&ssne=%D0%9C%D0%B8%D0%BB%D0%B0%D0%BD&ssne_untouched=%D0%9C%D0%B8%D0%BB%D0%B0%D0%BD&checkin_year=&checkin_month=&checkout_year=&checkout_month=&no_rooms=1&group_adults=2&group_children=0&b_h4u_keep_filters=&from_sf=1&ss_raw=%D0%BF%D0%B0%D1%80%D0%B8%D0%B6&ac_position=0&ac_langcode=ru&ac_click_type=b&dest_id=-1456928&dest_type=city&iata=PAR&place_id_lat=48.856682&place_id_lon=2.351476&search_pageview_id=4c6c382738630021&search_selected=true");
		driver.manage().window().maximize();

		WebElement element = driver.findElement(By.xpath("(.//span[@class=\"c2-day-inner\"])[29]"));

		element.click();

		WebElement element1 = driver
				.findElement(By.xpath("(.//select[@class=\"sb-date-field__select-field js-date-field__select\"])[4]"));

		Select dataOutDropdown = new Select(element1);
		dataOutDropdown.selectByValue("31");

		WebElement element2 = driver.findElement(By.xpath(".//select[@name=\"group_adults\"]"));

		Select adultsDropdown = new Select(element2);

		adultsDropdown.selectByVisibleText("4 взрослых");

		WebElement room = driver.findElement(By.xpath(".//select[@name=\"no_rooms\"]"));

		Select roomDropdown = new Select(room);
		roomDropdown.selectByVisibleText("2 номера");

		WebElement element3 = driver.findElement(By.xpath(".//button[@data-sb-id=\"main\"]"));

		element3.click();

		WebElement element4 = driver.findElement(By.xpath("(.//a[@class=\"sort_option \"])[2]"));

		element4.click();

		Thread.sleep(5000);

		WebElement element5 = driver.findElement(By.xpath("(.//img[@class=\"hotel_image\"])[1]"));

		element5.click();

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

		Assert.assertTrue(price1 >= 400);

		WebElement element26 = driver.findElement(By.xpath("(.//select[@class=\"hprt-nos-select\"])[1]"));

		Select bookRoom = new Select(element26);

		bookRoom.selectByValue("1");

		WebElement element7 = driver.findElement(By.xpath(".//div[@class=\"hprt-reservation-cta\"]"));

		element7.click();

		Thread.sleep(5000);

		WebElement element8 = driver
				.findElement(By.xpath(".//select[@class=\"bp_input_select bp_form__field__input\"]"));

		Select bookRoom1 = new Select(element8);

		bookRoom1.selectByVisibleText("Г-н.");

		WebElement element9 = driver.findElement(By.xpath("(.//input[@type=\"text\"])[1]"));

		element9.sendKeys("Roman");

		WebElement element10 = driver.findElement(By.xpath("(.//input[@type=\"text\"])[2]"));

		element10.sendKeys("Losev");

		WebElement element11 = driver.findElement(By.xpath("(.//input[@type=\"text\"])[3]"));

		element11.sendKeys("roma3784@mail.ru");

		WebElement element12 = driver.findElement(By.xpath("(.//input[@type=\"text\"])[4]"));

		element12.sendKeys("roma3784@mail.ru");

		WebElement element13 = driver.findElement(By.xpath(".//button[@name=\"book\"]"));

		element13.click();

		WebElement element14 = driver.findElement(By.xpath(".//select[@name=\"cc1\"]"));

		Select bookRoom2 = new Select(element14);

		bookRoom2.selectByVisibleText("Беларусь");

		Thread.sleep(5000);

		WebElement element15 = driver.findElement(By.xpath(".//input[@id=\"phone\"]"));

		element15.sendKeys("296333197");

		WebElement element16 = driver.findElement(By.xpath(".//select[@id=\"cc_type\"]"));

		Select bookRoom3 = new Select(element16);

		bookRoom3.selectByVisibleText("Visa");

		Thread.sleep(5000);

		WebElement element17 = driver.findElement(By.xpath("(.//input[@type=\"text\"])[4]"));

		element17.sendKeys("4242 4242 4242 4242");

		WebElement element18 = driver.findElement(By.xpath(".//select[@name=\"cc_month\"]"));

		Select bookRoom4 = new Select(element18);

		bookRoom4.selectByVisibleText("01 - Янв");

		WebElement element19 = driver.findElement(By.xpath(".//select[@name=\"cc_year\"]"));

		Select bookRoom5 = new Select(element19);

		bookRoom5.selectByVisibleText("2021");

		WebElement element20 = driver.findElement(By.xpath("(.//input[@type=\"text\"])[5]"));

		element20.sendKeys("515");

		Thread.sleep(5000);

		WebElement element21 = driver.findElement(By.xpath("(.//span[@class=\"bp_submit_button__copy\"])[2]"));

		element21.click();

		WebElement error = driver.findElement(By.xpath(".//span[@class=\"bui-alert__title\"]"));

		error.isDisplayed();

		Assert.assertTrue(error.isDisplayed());

	}

}
