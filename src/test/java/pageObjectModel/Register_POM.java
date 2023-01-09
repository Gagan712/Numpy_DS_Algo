package pageObjectModel;

import java.time.Duration;

//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import stepDefinition.DriverManager;
//import utilities.Loggerload;
import utilities.logger;

public class Register_POM {
	public static WebDriver driver = DriverManager.getChromedriver();
	WebDriverWait  wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	
	
	@FindBy (name="username" ) WebElement username;
	@FindBy (name="password1" ) WebElement pass;
	@FindBy (name="password2" ) WebElement confirmpass;
	@FindBy (xpath="//div[@class=\"alert alert-primary\"]" ) WebElement errorMsg;
	@FindBy (xpath="//input[@value=\"Register\"]" ) WebElement register;
	
	
	public void OpenRegisterPage() {
			logger.info("User is on Register Page");
			driver.get("https://dsportalapp.herokuapp.com/register");
			PageFactory.initElements(driver, this);
					
		
	}
	public void setUserName(String userName) {
		
			logger.info("Enter User Name");
			username.click();
			username.clear();
			username.sendKeys(userName);
		}
	public void setPassword(String Pass) {
		
		logger.info("Enter password");
		pass.click();
		pass.clear();
		pass.sendKeys(Pass);
		
	}
	public void setConfirmPass(String confirmPass) {
		
		logger.info("Enter confirm password");
		confirmpass.click();
		confirmpass.clear();
		confirmpass.sendKeys(confirmPass);
	}
	public String verifyErrorMsg() {
		logger.info("verify the error message");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String mes1=errorMsg.getText();
		logger.warn(mes1);
		return mes1;
	}
	public void ClickRegister() {
		logger.info("Click Register Button");
		register.click();
	}
	public String verifyUserWarnMsg() {
		logger.info("verify the warn message");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String wmes=username.getAttribute("validationMessage");
		logger.warn(wmes);
		return wmes;
	}
	public String verifyPassWarnMsg() {
		logger.info("verify the warn message");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String wmes1=pass.getAttribute("validationMessage");
		logger.warn(wmes1);
		return wmes1;
	}
	public String verifyConPassWarnMsg() {
		logger.info("verify the warn message");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String wmes2=confirmpass.getAttribute("validationMessage");
		logger.warn(wmes2);
		return wmes2;
	}

	
	}


