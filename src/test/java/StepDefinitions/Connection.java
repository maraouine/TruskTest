package StepDefinitions;

import static org.testng.Assert.assertTrue;

import java.io.InputStream;

import org.json.JSONObject;
import org.json.JSONTokener;

import Pages.ConnectionPage;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Connection extends Runner {
	
  
JSONObject datasAccountConnexion;

	
	ConnectionPage connectionPage=new ConnectionPage();
	@Before
	public void beforeClass() throws Exception {

		//Do something here
		//For exemple parsing data file
		InputStream datas = null;
		  try {
			  logger.info("Before class : get datas");
			  String dataFileName = "datas/datasAccountConnexion.json";
			  datas = getClass().getClassLoader().getResourceAsStream(dataFileName);
			  JSONTokener tokener = new JSONTokener(datas);
			  datasAccountConnexion = new JSONObject(tokener);
		  } catch(Exception e) {
			  e.printStackTrace();
			  throw e;
		  } finally {
			  if(datas != null) {
				  datas.close();
			  }
		  }
	}
  	
  	
  	
  	@Given("I am on the connexion page")
    public void I_am_on_the_connexion_page()
    {
  		//assertTrue(connectionPage.isConnexionPageDisplayed());
    }
  	@And("I should see the email or phone number filed")
    public void I_should_see_the_email_or_phone_number_filed()
    {
  		//assertTrue(connectionPage.isEmailPhone_fieldDisplayed());
    }
	@And("I should see the password field")
	public void I_should_see_the_password_field ()
	{
  		//assertTrue(connectionPage.isPassword_fieldDisplayed());
	}
	@And("I click on connection")
	public void I_click_on_connection ()
	{
		//connectionPage.ClickOnConnexionBTN();
	}
	@Then("The connection is successful")
	public void The_connection_is_successful()
	{
  		//assertTrue(connectionPage.isConnexionSuccessful());
	}
	@When("I enter a phone number associated to an account")
	public void i_enter_a_phone_number_associated_to_an_account() {
		//connectionPage.enterPhoneNumber(datasAccountConnexion.getJSONObject("valid_identifiants").getString("phone_number"));
	}
	@When("I enter a password associated to an account")
	public void i_enter_a_password_associated_to_an_account() {
		//connectionPage.enterPassword(datasAccountConnexion.getJSONObject("valid_identifiants").getString("password"));
	}
	
	@Then("I should see my first and last name at the top of the page")
	public void I_should_see_my_first_and_last_name_at_the_top_of_the_page()
	{
		//assertTrue(connectionPage.isProfilNameDisplayed(datasAccountConnexion.getJSONObject("profilNames").getString("validprofilName")));
	}

	@And("I enter an invalid password")
	public void I_enter_an_invalid_password() {
		//connectionPage.enterPassword(datasAccountConnexion.getJSONObject("invalid_identifiants").getString("password"));
	}
	@Then("I should see a popup indicating that the password associated with this account is invalid")
	public void I_should_see_a_popup_indicating_that_the_password_associated_with_this_account_is_invalid()
	{
		
	}
	

	





}
