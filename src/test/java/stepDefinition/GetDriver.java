package stepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetDriver {
	public static WebDriver driver ;
	@Test
	@Parameters ("browsers")
	public void intializeWebDriver( String browsername) {
		if (browsername.equalsIgnoreCase("firefox")) {
		WebDriverManager.firefoxdriver().browserVersion("7.5").setup();
		driver= new FirefoxDriver();
		}
	    else if(browsername.equalsIgnoreCase("chromedriver")) {
		   System.setProperty("webdriver.chrome.driver", "C:\\Users\\kaurg\\eclipse-workspace\\hi-selenium\\src\\test\\resources\\driver2\\chromedriver.exe");
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if(browsername.equalsIgnoreCase("internet explorer")) {
			WebDriverManager.iedriver().setup();
		}
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		driver.close();
	}
      

}