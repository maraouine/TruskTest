package StepDefinitions;

import static org.testng.Assert.assertTrue;

import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

import org.json.JSONObject;
import org.json.JSONTokener;
import org.testng.annotations.BeforeClass;

import Pages.ConnectionPage;
import Pages.RegistrationPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import io.cucumber.java.Before;

public class Registration extends Runner {
	


	
	JSONObject datasAccountRegistration;
	RegistrationPage registrationPage=new RegistrationPage();

	
	
	@Before
	public void beforeClass() throws Exception {

		//Do something here
		//For exemple parsing data file
		InputStream datas = null;
		  try {
			  logger.info("Before class : get datas");
			  String dataFileName = "datas/datasAccountRegistration.json";
			  datas = getClass().getClassLoader().getResourceAsStream(dataFileName);
			  JSONTokener tokener = new JSONTokener(datas);
			  datasAccountRegistration = new JSONObject(tokener);
		  } catch(Exception e) {
			  e.printStackTrace();
			  throw e;
		  } finally {
			  if(datas != null) {
				  datas.close();
			  }
		  }
	}

	@And("I should see connection button")
	public void I_should_see_connection_button ()
	{
		
	}
	@When("I click on registration")
	public void I_click_on_registration()
	{
		//registrationPage.ClickOnRegistrationBTN();
	}
	@Then("The registration page should be open")
	public void The_registration_page_should_be_open()
	{
  		//assertTrue(registrationPage.isRegistationPageDisplayed());
	}
		   
	@Then("I should see the email or phone number filed on registration page")
	public void I_should_see_the_email_or_phone_number_filed_registerPage()
	{
  		//assertTrue(registrationPage.isEmailPhone_fieldDisplayed());
	}  		

	@Then("I should see the password field on registration page")
	public void I_should_see_the_password_field_registerPage()
	{
  		//assertTrue(registrationPage.isPassword_fieldDisplayed());
	}
	
	@Then("I should see the password confirmation field on registration page")
	public void I_should_see_the_password_confirmation_field_on_registration_page()
	{
  		//assertTrue(registrationPage.isPasswordConfirmation_fieldDisplayed());
	}
	@Then("I should see the register button")
	public void I_should_see_the_register_button()
	{
  		//assertTrue(registrationPage.isRegisterBTNDispalyed());
	}
	@Then("I should see GCU checkbox")
	public void I_should_see_GCU_checkbox ()
	{
  		//assertTrue(registrationPage.isCheckBOXBTNDispalyed());
	}
		  
	@When("I enter an invalid phone number")
	public void I_enter_an_invalid_phone_number()
	{
		
	}
	@And("I enter a password that meets the requirements")
	public void I_enter_a_password_that_meets_the_requirements()
	{
		
	}
	@Then("I should see a popup indicating that the phone number is invalid")
	public void I_should_see_a_popup_indicating_that_the_phone_number_is_invalid()
	{
		
	}
	@When("I enter an existing phone number")
	public void I_enter_an_existing_phone_number()
	{
		
	}
	@And("I enter a password that does not meet the requirements")
	public void I_enter_a_password_that_does_not_meet_the_requirements()
	{
		
	}
	@Then("I should see a popup indicating that the password entered does not meet the requirements")
	public void I_should_see_a_popup_indicating_that_the_password_entered_does_not_meet_the_requirements()
	{
		
	}
	@Then("I should see a popup to confirm that registration is with success")
	public void I_should_see_a_popup_to_confirm_that_registration_is_with_success()
	{
		
	}
	@Then("I must be logged into my account")
	public void I_must_be_logged_into_my_account()
	{
		
	}

}
