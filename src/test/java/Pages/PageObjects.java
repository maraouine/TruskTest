package Pages;


import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.Status;

import StepDefinitions.Runner;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class PageObjects extends Runner{

	public PageObjects() {
	     try {
	         PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	        } catch (Exception e) {

	            e.printStackTrace();
	        }
    }
	
	
    public void waitForVisibility(MobileElement element) {
		  WebDriverWait wait = new WebDriverWait(driver, 30);
		  wait.until(ExpectedConditions.visibilityOf(element));
	}
	  
	public void ClickOn(String name, MobileElement element) {  
		WebDriverWait wait = new WebDriverWait(driver, 30);
		try {
				logger.info("get element" + element);
				wait.until(ExpectedConditions.elementToBeClickable((element)));
				element.click();
				logger.info("Click on " +  name);
		} catch (Throwable e) {
			logger.error(e.getMessage().toString());
		}
	}
	
  
    public void sendKeys(MobileElement e, String txt, String msg) {
  	  waitForVisibility(e);
  	  logger.info(msg);
  	  e.sendKeys(txt);
    }
    
    public String getAttribute(MobileElement element, String attribute) {
  	  waitForVisibility(element);
  	  return element.getAttribute(attribute);
    }
    
    public String getText(MobileElement element, String msg) {
  	  String txt = null;
  	  switch(os) {
  	  case "android":
  		  txt = getAttribute(element, "text");
  		  break;
  	  case "ios":
  		  txt = getAttribute(element, "label");
  		  break;
  	  }
  	  logger.info(msg + txt);
  	  return txt;
    }
    
    public Boolean isElementDisplayedOnPage(MobileElement element)
    {
    	Boolean isElementDisplayedOnPage=false;
    	waitForVisibility(element);
    	if(element.isDisplayed())
    	{
    		isElementDisplayedOnPage=true;
    	}
    	return isElementDisplayedOnPage;
    }

}