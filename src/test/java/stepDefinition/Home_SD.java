package stepDefinition;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjectModel.Home_POM;

public class Home_SD {
	DriverManager DM = new DriverManager();
	public static WebDriver driver = DriverManager.getChromedriver();
	Home_POM HP = new Home_POM();

@When("The user opens DS Algo portal link")
public void the_user_opens_ds_algo_portal_link() {
    HP.DS_portal();
}

@Then("The user get tittle of page {string}")
public void the_user_get_tittle_of_page(String tittle) {
    assertEquals(driver.getTitle(),tittle);
}

@Given("The user opens DS Algo portal")
public void the_user_opens_ds_algo_portal() {
    HP.DS_portal();
}

@When("The user clicks the Get Started button")
public void the_user_clicks_the_get_started_button() {
    HP.clickGetStart();
}


@Then("The user should be redirected to homepage as {string}")
public void the_user_should_be_redirected_to_homepage_as(String hometittle) {
    assertEquals(driver.getTitle(),hometittle);
}

@Given("The user opens Home Page")
public void the_user_opens_home_page() {
   HP.Homepage();
}
@When("The user clicks Data Structures drop down")
public void the_user_clicks_data_structures_drop_down() {
    HP.clickDataStrDD();
}


@Then("See {int} different Data structures")
public void see_different_data_structures(Integer int1) {
    
}

@When("The user clicks any of the {string} buttons below the data structures")
public void the_user_clicks_any_of_the_buttons_below_the_data_structures(String string) {
    
}

@Then("It should alert the user with a message {string}")
public void it_should_alert_the_user_with_a_message(String error) {
   String mes2 = HP.verifyErrorMsg(error);
   assertEquals(mes2, error);
}

@When("The user selects any data structures item from the drop down without Sign in.")
public void the_user_selects_any_data_structures_item_from_the_drop_down_without_sign_in() {
   
}

@When("The user clicks {string}")
public void the_user_clicks(String string) {
   
}

@Then("The user should be redirected to Sign in page")
public void the_user_should_be_redirected_to_sign_in_page() {
    
}

@Then("The user should be redirected to Register form")
public void the_user_should_be_redirected_to_register_form() {
    
}
}
