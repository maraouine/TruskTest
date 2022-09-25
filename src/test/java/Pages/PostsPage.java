package Pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class PostsPage extends PageObjects {

	@AndroidFindBy (id = "") 
	@iOSXCUITFindBy (xpath = "")
    private MobileElement PAGE_NAME;
	
	
	@AndroidFindBy (id = "") 
	@iOSXCUITFindBy (xpath = "")
    private MobileElement REGISTER_BTN;
	
	@AndroidFindBy (id = "") 
	@iOSXCUITFindBy (xpath = "")
    private MobileElement EMAIL_PHONE_FIELD;
	
	@AndroidFindBy (id = "") 
	@iOSXCUITFindBy (xpath = "")
    private MobileElement PASSWORD_FIELD;
}
