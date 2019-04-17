package project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverSingleton {

	public static WebDriver driver;

	private WebDriverSingleton() {

	}

	public static WebDriver getInstance() {

		if (driver == null) {
			driver = new ChromeDriver();

		}
		return driver;
	}

	public static void quit() {
		if (null != driver) {
			driver.quit();
		}

		driver = null;
	}
}
