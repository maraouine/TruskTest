# README #

This README would normally document whatever steps are necessary to get your application up and running.

### What is this repository for? ###
* This repository includes tests for which will be launched on the TruskX application

* Summary of set up

Get repository in your local machine by doing 
* Configuration and prerequisites
* How to run tests

### Configuration and prerequisites ###

 # Java #
In this project we use PageFactory to implement Page Object Model concept. It's recommended to use JAVA 11 (for this project I used java version "11.0.15")

 # Appium #
In order to be able to get element, you need Appium. To install Appium follow this : https://www.softwaretestinghelp.com/download-install-and-setup-appium/
 
 # Maven #
To install Maven follow this : https://phoenixnap.com/kb/install-maven-windows
 
Important : 

Don't forget to check if JAVA, APPIUM and MAVEN are well installed by doing 
 - java -version
 - mvn -v
 - appium -v

The version used during development are :

 - Java : java version "11.0.15"
 - Mvn : Apache Maven 3.8.2
 - Appium : 1.21.0

### How to start test ? ###

# STEP 1 #
Clone repository in your local storage by doing :

git clone https://github.com/maraouine/TruskTest.git

# STEP 2 #

Inder main directory you can find an xml file called devices.xml. In this file you will find all information about your real device. 
File : ...

To get devices information you can use adb devices command after pluging phone on you PC. Otherwise use Parameters menu from your phone.

	<device>
		<informations>
			<nom>SAMSUNG_GALAXY_A32</nom>
			<version>11</version>
			<udid>RF8R80JBE4H</udid>
			<appPackage>packageName</appPackage>
			<appActivity>packageNameMainactivity</appActivity>
		</informations>
		<server>
		</server>
		<capabilities>
			<appPackage>packageName</appPackage>
			<appActivity>packageNameMainactivity</appActivity>
			<deviceName>SM-A325F</deviceName>
			<noReset>false</noReset>
			<platformVersion>11</platformVersion>
			<automationName>uiautomator2</automationName>
			<systemPort>50000</systemPort>
		</capabilities>
	</device>

Important : for local execution on real phone it's important after plugging your device inside you PC to fill out all device informations

# STEP 3 #

### For Local execution ###

To start test under workspace directory we should run this command : 

	mvn test -P TruskX-android -Dos="android" -Ddevices="SAMSUNG_GALAXY_A32"

 * Details 

 Here we start mvn profil called : TruskX-android

 -TruskX-android: profil name : By calling this profil the testng file 'android_local_testng' will be executed 
 -Dos ="android" : It an argument used to handale on which OS the tests will be started 
 -Ddevices="SAMSUNG_GALAXY_A32" : It an argument used to get devices informations from devices.xml file

# Which tests are started #

On this project we use cucumber approach, then inside this folder

	/src/test/resources/Features/

you can find tests scenario write for each feature.

Inside Runner.java class (/src/test/java/StepDefinitions/Runner.java) features option we specify which features should be runned.
In our use case we run all features

	@CucumberOptions(
	        features = "src/test/resources/Features",
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


### Report ### 

For report I use : https://www.extentreports.com/docs/versions/4/java/spark-reporter.html
Report examples : 

![ReportExample1](https://user-images.githubusercontent.com/61714215/192155995-6e1a38dd-550f-4aa8-a7ec-5a7dc7742c42.PNG)
![ReportExample2](https://user-images.githubusercontent.com/61714215/192156036-d4da32aa-8e41-4b44-a760-2378caa8d4c9.PNG)
![ReportExample3](https://user-images.githubusercontent.com/61714215/192156048-a5df452f-cfa7-4083-bfd5-a401fd82d7e6.PNG)


### Who do I talk to? ###

* Repo owner or admin : raouine.mohamed20@gmail.com
* Other community or team contact : Raouine Mohamed Amine