package Pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class ConnectionPage extends PageObjects{
	
	@AndroidFindBy (id = "") 
	@iOSXCUITFindBy (xpath = "")
    private MobileElement PAGE_CONNEXION_NAME;
	
	@AndroidFindBy (id = "") 
	@iOSXCUITFindBy (xpath = "")
    private MobileElement CONNECTION_BTN;
	
	@AndroidFindBy (id = "") 
	@iOSXCUITFindBy (xpath = "")
    private MobileElement EMAIL_PHONE_FIELD;
	
	@AndroidFindBy (id = "") 
	@iOSXCUITFindBy (xpath = "")
    private MobileElement PASSWORD_FIELD;
	
	
	@AndroidFindBy (id = "") 
	@iOSXCUITFindBy (xpath = "")
    private MobileElement SUCCESSFUL_CONNEXION_MSG;
	
	@AndroidFindBy (id = "") 
	@iOSXCUITFindBy (xpath = "")
    private MobileElement PROFIL_NAME;

	public Boolean isConnexionPageDisplayed()
	{
		Boolean isConnexionPageDisplayed=false;
		isConnexionPageDisplayed=isElementDisplayedOnPage(PAGE_CONNEXION_NAME);
		return isConnexionPageDisplayed;
	}
	public Boolean isEmailPhone_fieldDisplayed()
	{
		Boolean isEmailPhone_fieldDisplayed=false;
		isEmailPhone_fieldDisplayed=isElementDisplayedOnPage(EMAIL_PHONE_FIELD);
		return isEmailPhone_fieldDisplayed;
	}
	public Boolean isPassword_fieldDisplayed()
	{
		Boolean isPassword_fieldDisplayed=false;
		isPassword_fieldDisplayed=isElementDisplayedOnPage(PASSWORD_FIELD);
		return isPassword_fieldDisplayed;
	}
	public void ClickOnConnexionBTN()
	{
		ClickOn("Click on connexion btn", CONNECTION_BTN);
	}
	
	public void enterPassword(String password)
	{
		sendKeys(PASSWORD_FIELD, password, "Enter the password "+ password);
	}
	public void enterPhoneNumber(String phoneNumber)
	{
		sendKeys(PASSWORD_FIELD, phoneNumber, "Enter the phone number "+ phoneNumber);
	}
	public Boolean isConnexionSuccessful()
	{
		Boolean isConnexionSuccessful=false;
		isConnexionSuccessful=isElementDisplayedOnPage(SUCCESSFUL_CONNEXION_MSG);
		return isConnexionSuccessful;
	}
	
	public Boolean isProfilNameDisplayed(String profileName)
	{
		Boolean isProfilNameDisplayed=false;
		if(getText(PROFIL_NAME, "Get user profil name").equals(profileName))
		{
			isProfilNameDisplayed=true;
		}
		return isProfilNameDisplayed;
	}
}
