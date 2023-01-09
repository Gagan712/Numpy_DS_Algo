package stepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverManager {

	public static WebDriver driver;

	public static void initializeDriver() {
		WebDriverManager.chromedriver().browserVersion("108.0.5359.125").setup();
		driver = new ChromeDriver();
	}

	public static WebDriver getChromedriver() {
		return driver;
	}

	public static void closeDriver() {
		driver.close();
	}

}
