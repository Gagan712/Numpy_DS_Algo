package pageObjectModel;

//import static org.testng.Assert.assertEquals;

//import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import stepDefinition.DriverManager;
import utilities.logger;

public class Home_POM {
	
	public static WebDriver driver = DriverManager.getChromedriver();
	
	
	@FindBy (linkText="Get Started" ) WebElement startlink;
	@FindBy (linkText="Data Structures" ) WebElement datastrulink;
	@FindBy (xpath="//div[@class='alert alert-primary']" ) WebElement errorMsg;
	
	
	
	public void DS_portal() {
		logger.info("User is on DS_Portal Page");
		driver.get("https://dsportalapp.herokuapp.com");
		PageFactory.initElements(driver, this);
				
	}
	public void Homepage() {
		logger.info("User is on Home Page");
		driver.get("https://dsportalapp.herokuapp.com/home");
		PageFactory.initElements(driver, this);
	}
	public void clickGetStart() {
		logger.info("User clicks on get started button");
		startlink.click();
	}
	public void clickDataStrDD() {
		logger.info("User clicks on Data Structures Dropdown");
		datastrulink.click();
	}
	public String verifyErrorMsg(String errormsg) {
		logger.info("verify the error message");
		String mes1=errorMsg.getText();
		logger.warn(mes1);
		return mes1;
	}

	public void CountitemsDD(int no) {
		
	}
}
