package pageObjectModel;

import java.time.Duration;
//import java.util.List;

import org.openqa.selenium.By;

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
	@FindBy (xpath="//div[@class=\"col\"][\"2\"]//a") WebElement GSbutton;
	@FindBy (linkText="Sign in" ) WebElement signinlink;
	@FindBy (linkText="Register" ) WebElement registerlink;
	@FindBy (xpath="//div[@class=\"dropdown-menu show\"]//a[3]" ) WebElement stacklinkinDD;
	
	
	
	
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
	public int getItemsinDD() {
		//datastrulink.click();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		int items =  driver.findElements(By.xpath("//div[@class=\"dropdown-menu show\"]/a")).size();
		logger.info("no of items in dropdown " + items);
		return items;
		
	}
	public String verifyErrorMsg(String errormsg) {
		logger.info("verify the error message");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String mes1=errorMsg.getText();
		logger.warn(mes1);
		return mes1;
	}

	public void ClickAnyGSlink() {
		int cards = driver.findElements(By.xpath("//div[@class=\"col\"]")).size();
		logger.info("no of get started buttons " + cards);
		for(int i=1;i<=cards;i++) {
			driver.findElement(By.xpath("//div[@class=\"col\"]["+i+"]//a")).click();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			String mes1=errorMsg.getText();
			logger.warn(mes1);
		}
	}
		public void ClickAnyDDlink() {
			int items =  driver.findElements(By.xpath("//div[@class=\"dropdown-menu show\"]/a")).size();
			logger.info("no of items in dropdown " + items);
			for(int i=1;i<=items;i++) {
				driver.findElement(By.xpath("//div[@class=\"col\"]["+i+"]//a")).click();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				String mes1=errorMsg.getText();
				logger.warn(mes1);
			}
			
		
	}
	
	 public void ClickGS() {
		 logger.info("Click on any get started button");
		 GSbutton.click();
	 }
	 public void ClickSignin() {
		 logger.info("Click on Sign in link");
		 signinlink.click();
	 }
	 public void ClickRegister() {
		 logger.info("User go back on Home Page");
		driver.get("https://dsportalapp.herokuapp.com/home");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 logger.info("Click on Register link");
		 registerlink.click();
	 }
	 public void ClickStackLink() {
		 logger.info("Click on stack link in dropdown");
		 stacklinkinDD.click();
	 }
}


