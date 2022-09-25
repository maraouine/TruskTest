package StepDefinitions;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;

public class Hooks extends Runner{
	
	
	//For extend report follow this : https://www.toolsqa.com/extent-report/extent-report-for-cucumber-testng-project/?__cf_chl_tk=beAKysbG2cm_THaJ3nIYjR_iQDMkn.fT.KSJB3gvyE8-1655903482-0-gaNycGzNChE
	@AfterStep
	public void addScreenshot(Scenario scenario) throws IOException {
		
		  //Driver is not seted for this project : then we cannot take screen
		 /* File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		  byte[] fileContent = FileUtils.readFileToByteArray(screenshot);
		  scenario.attach(fileContent, "image/png", "screenshot");*/
		
	}

	

}
