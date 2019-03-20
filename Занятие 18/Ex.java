package automationFramework;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class Ex {

	@Test
	void test() throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.get("http://www.booking.com");
		
		WebElement searchCity = driver.findElement(By.xpath(".//input[@type=\"search\"]"));
		searchCity.sendKeys("Москва");  //ввели текст в поле
		searchCity.submit();  
		
		
//		WebElement searchData = driver.findElement(By.xpath("(.//div[@class=\"sb-date-field__display\"])[1]"));
//		searchData.click();
		
		WebElement searchData1 = driver.findElement(By.xpath("(.//span[contains(text(), \"24\")])[1]"));
		searchData1.click();
		
		searchData1.submit();  
		
		WebElement allHotels = driver.findElement(By.xpath(".//div[@class=\"hotellist sr_double_search\"]"));
	//	allHotels.getText();
		
		Assert.assertNotNull(driver.findElement(By.xpath(".//div[@class=\"hotellist sr_double_search\"]")));
	}
	
	@Test
	void test1() throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.get("http://www.booking.com");
		
		WebElement searchCity = driver.findElement(By.xpath(".//input[@type=\"search\"]"));
		searchCity.sendKeys("Москва");  //ввели текст в поле
		searchCity.submit();  
		
		
//		WebElement searchData = driver.findElement(By.xpath("(.//div[@class=\"sb-date-field__display\"])[1]"));
//		searchData.click();
		
		WebElement searchData1 = driver.findElement(By.xpath("(.//span[contains(text(), \"24\")])[1]"));
		searchData1.click();
		
		searchData1.submit();  
		
		WebElement allHotels = driver.findElement(By.xpath(".//div[@class=\"hotellist sr_double_search\"]"));
	//	allHotels.getText();
		
		
		WebElement allRating = driver.findElement(By.xpath(".//button[@id=\"sortbar_dropdown_button\"]"));
		
		allRating.click();
		
	    WebElement maxRating = driver.findElement(By.xpath(".//li[@class=\" sort_category   sort_bayesian_review_score \"]"));
		
	    maxRating.click();
	
	    Thread.sleep(10000);
	    
	    WebElement firstHotel = driver.findElement(By.xpath("(.//a[@class=\"hotel_name_link url\"])[1]"));
		
	    firstHotel.click();
	    
	    
	    WebElement raitingFirstHotel = driver.findElement(By.xpath(" .//div[@class=\"bui-review-score__badge\"]"));
	    
	    System.out.println(raitingFirstHotel.getText()); 
	    String raiting = raitingFirstHotel.getText();
	    String raiting1 = raiting.replaceAll(",", "."); 	
	    double raiting2 = Double.parseDouble(raiting1);
	    
	    Assert.assertTrue(raiting2 >= 9);
		
		
	}
	
	
	

}
