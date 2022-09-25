package StepDefinitions;
import java.io.FileReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.apache.commons.exec.OS;
import org.apache.log4j.Logger;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import Utils.CommonFunctions;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
 
@CucumberOptions(
        features = "src/test/resources/Features/",
        plugin = {
                "pretty",
                "html:reports/tests/cucumber/html",
                "timeline:reports/tests/cucumber/timeline",
                "junit:reports/tests/cucumber/junit/cucumber.xml",
                "testng:reports/tests/cucumber/testng/cucumber.xml",
                "json:reports/tests/cucumber/json/cucumber.json",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
        }
)
public class Runner extends AbstractTestNGCucumberTests {
	
     public static Logger logger;	
	 private String LOG_TITLE			= null;
	 public Logger getLogger() {return logger;}
	 private SimpleDateFormat dateLogFormatter = new SimpleDateFormat("YYYYMMdd-HHmmss");
     public static String os=System.getProperty("os");
     public static String devices=System.getProperty("devices");
     protected static AppiumDriver<MobileElement> driver;
     CommonFunctions commonFunctions= new CommonFunctions();
 	 private Map<String, Object> capabilities = new HashMap<>();

	 public Runner() {
		logger = Logger.getRootLogger();
		this.LOG_TITLE = dateLogFormatter.format(new Date());
	 }
	  
	 public AppiumDriver<MobileElement> getIOSLocalDriver() throws MalformedURLException
	 	{
		 
			 DesiredCapabilities capabilities = new DesiredCapabilities();

	 		try {
	 			logger.info("get IOS LocalDriver");
		 		logger.info("devices choosen" + devices);
		 		commonFunctions.parseXML(devices);
		 		commonFunctions.getCapabilities().forEach((name, value)->{	
					logger.debug("cap :: " +name+" : "+value);
					capabilities.setCapability(name, value);
		
		 		});	
	 		    capabilities.setCapability("app",System.getProperty("user.dir")+"/src/test/resources/Apps/app_for_test.ipa");

	 		    URL url = new URL("http://0.0.0.0:4723/wd/hub");
	 		    driver = new AppiumDriver<MobileElement>(url, capabilities);
	 		
	 		} catch (MalformedURLException e) {
	 			e.printStackTrace();
	 		}
	 		return driver;
		  }
	 
	 public AppiumDriver<MobileElement> getAndroidLocalDriver() throws Exception {

		    DesiredCapabilities capabilities = new DesiredCapabilities();
		   try {
		 		logger.info("get Android LocalDriver");
		 		logger.info("devices choosen" + devices);
		 		commonFunctions.parseXML(devices);
		 		commonFunctions.getCapabilities().forEach((name, value)->{	
					logger.debug("cap :: " +name+" : "+value);
					capabilities.setCapability(name, value);
		
		 		});	 		 
		 		capabilities.setCapability("app",System.getProperty("user.dir")+"/src/test/resources/Apps/app_for_test.apk");
			    URL url = new URL("http://0.0.0.0:4723/wd/hub");
	 		    driver = new AndroidDriver<MobileElement>(url, capabilities);
				 
		   }catch (MalformedURLException e) {
	 			e.printStackTrace();
	 		}
	 		return driver;
		  }
	 @BeforeClass(alwaysRun=true)
	  @org.testng.annotations.Parameters(value={"deviceIndex","execution"})
	  public void setUp(String deviceIndex, String execution) throws Exception  {

	      logger.info("OS : " + os);
	      logger.info("Execution : " + execution);
	      switch (os) {
	      case "android":
			  if(execution.equalsIgnoreCase("cloud")) {
			
			    	driver=getAndroidLocalDriver();
			  }
			break;
	      case "ios":
			    	driver=getIOSLocalDriver();
			  
			break;
		default:
			break;
		}
		 

 
	 	}
	 }
