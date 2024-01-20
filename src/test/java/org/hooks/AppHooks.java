package org.hooks;

import java.io.File;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.qafactory.DriverFactory;
import org.utilities.ConfigReader;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;


public class AppHooks {
   public static Properties prop;
   private WebDriver driver;
   public static Scenario scn;
  
    @Before(order=0) 
	public void getProperty() {
	  ConfigReader cr =new ConfigReader();
		 prop = cr.getProp();
	}
	@Before(order=1)
	public void startUp(Scenario scn) {
	 String bName = prop.getProperty("browserName");
	 DriverFactory df= new DriverFactory();
		driver= df.init_Driver(bName);
		  this.scn=scn;
	}
	
	@After(order=0) 
	public void tearDown() {
      DriverFactory.getDriver().quit();
	}
	@After(order=1) 
	public void takeScreenshot() {
		//TakesScreenshot scnShot = ((TakesScreenshot)driver);
	//	File scnfile = scnShot.getScreenshotAs(OutputType.FILE);
		//FileHandler.copy(Fromefile, FileTo);
	}
}
