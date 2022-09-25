package Pages;

import org.openqa.selenium.By;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class RegistrationPage extends PageObjects {

	
	
	@AndroidFindBy (id = "") 
	@iOSXCUITFindBy (xpath = "")
    private MobileElement PAGE_REGISTRATION_NAME;
	

	@AndroidFindBy (id = "") 
	@iOSXCUITFindBy (xpath = "")
    private MobileElement REGISTRATION_BTN;
	
	@AndroidFindBy (id = "") 
	@iOSXCUITFindBy (xpath = "")
    private MobileElement EMAIL_PHONE_FIELD;
	
	@AndroidFindBy (id = "") 
	@iOSXCUITFindBy (xpath = "")
    private MobileElement PASSWORD_FIELD;
	
	@AndroidFindBy (id = "") 
	@iOSXCUITFindBy (xpath = "")
    private MobileElement PASSWORD_CONFIRMATION_FIELD;
	
	@AndroidFindBy (id = "") 
	@iOSXCUITFindBy (xpath = "")
    private MobileElement CGU_CHECKBOX;
	
	public Boolean isRegistationPageDisplayed()
	{
		Boolean isRegistationPageDisplayed=false;
		isRegistationPageDisplayed=isElementDisplayedOnPage(PAGE_REGISTRATION_NAME);
		return isRegistationPageDisplayed;
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
	public Boolean isPasswordConfirmation_fieldDisplayed()
	{
		Boolean isPassword_fieldDisplayed=false;
		isPassword_fieldDisplayed=isElementDisplayedOnPage(PASSWORD_CONFIRMATION_FIELD);
		return isPassword_fieldDisplayed;
	}
	public Boolean isRegisterBTNDispalyed()
	{
		Boolean isRegisterBTNDispalyed=false;
		isRegisterBTNDispalyed=isElementDisplayedOnPage(REGISTRATION_BTN);
		return isRegisterBTNDispalyed;
	}
	public Boolean isCheckBOXBTNDispalyed()
	{
		Boolean isCheckBOXBTNDispalyed=false;
		isCheckBOXBTNDispalyed=isElementDisplayedOnPage(CGU_CHECKBOX);
		return isCheckBOXBTNDispalyed;
	}
	
	
	public void ClickOnRegistrationBTN()
	{
		ClickOn("Click on registration btn", REGISTRATION_BTN);
	}
	
	public void enterPassword(String password)
	{
		sendKeys(PASSWORD_FIELD, password, "Enter the password "+ password);
	}
	public void enterPasswordConfirmation(String password)
	{
		sendKeys(PASSWORD_CONFIRMATION_FIELD, password, "Enter the password "+ password);
	}
	public void enterPhoneNumber(String phoneNumber)
	{
		sendKeys(EMAIL_PHONE_FIELD, phoneNumber, "Enter the phone number "+ phoneNumber);
	}
	
}
