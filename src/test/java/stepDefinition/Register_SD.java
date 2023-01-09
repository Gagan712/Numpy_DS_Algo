package stepDefinition;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjectModel.Register_POM;
import utilities.readXLfile;

public class Register_SD {
	DriverManager DM = new DriverManager();
	public static WebDriver driver = DriverManager.getChromedriver();
	Register_POM RP = new Register_POM();
	

@When("User click Register with username as {string} only")
public void user_click_register_with_username_as_only(String UserName) {
    RP.setUserName(UserName);
    RP.ClickRegister();
}

@Then("User verify the message at password as {string}")
public void user_verify_the_message_at_password_as(String warn1) {
	String wmes2 =RP.verifyPassWarnMsg();
	assertEquals(wmes2, warn1);
}

@When("User click Register with username as {string} and password as {string} only")
public void user_click_register_with_username_as_and_password_as_only(String user, String pass) {
    RP.setUserName(user);
    RP.setPassword(pass);
    RP.ClickRegister();
}

@Then("User verify the message at confirmpassword as {string}")
public void user_verify_the_message_at_confirmpassword_as(String warn2) {
   String wmes3 = RP.verifyConPassWarnMsg();
   assertEquals(wmes3, warn2);
}

	

@When("User click Register with all empty field")
public void user_click_register_with_all_empty_field() {
    RP.ClickRegister();
}

@Then("User verify the message at username as {string}")
public void user_verify_the_message_at_username_as(String warn) {
    String wmes1 = RP.verifyUserWarnMsg();
    assertEquals(wmes1, warn);
}

@Then("User click Register and verify the {string}")
public void user_click_register_and_verify_the(String message) {
	RP.ClickRegister();
    String mes2 =RP.verifyErrorMsg();
    assertEquals(mes2, message);
}
	@Given("The user opens Register Page")
	public void the_user_opens_register_page() {
	    	RP.OpenRegisterPage();
	}

	@When("User enter {string} ,{string} and {string}")
	public void user_enter_and(String username, String password, String confirmpass) {
	   RP.setUserName(username);
	   RP.setPassword(password);
	   RP.setConfirmPass(confirmpass);
	}

	@Then("User verify the {string}")
	public void user_verify_the(String message) {
		RP.ClickRegister();
	    String mes2 =RP.verifyErrorMsg();
	    assertEquals(mes2, message);
	}
	@When("user enter the sheetname {string} and row number {int}")
	public void user_enter_the_sheetname_and_row_number(String sheetname, Integer rownum) throws EncryptedDocumentException, IOException {
		readXLfile rxf = new readXLfile();
	    String[][] testdata1 = rxf.getData(sheetname);
	    String user = testdata1[rownum][0];
	    String pass1 = testdata1[rownum][1];
	    String passconfirm = testdata1[rownum][2];
	    String message = testdata1[rownum][3];
	    RP.setUserName(user);
	    RP.setPassword(pass1);
	    RP.setConfirmPass(passconfirm);
	    RP.ClickRegister();
	    String mes2 =RP.verifyErrorMsg();
	    assertEquals(mes2, message);
	    
	}

	@Then("user click on Register button and verify message")
	public void user_click_on_register_button_and_verify_message() {
	    
	}

}
