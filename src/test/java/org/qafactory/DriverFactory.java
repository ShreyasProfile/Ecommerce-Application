package org.qafactory;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {
   public static ThreadLocal<WebDriver> tlDriver=new ThreadLocal<WebDriver>();
  
   public WebDriver init_Driver(String bName) {
		WebDriver driver= null;
	  if(bName.equalsIgnoreCase("ch") || bName.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver",
				"./Drivers/chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");   
//		options.addArguments("start-maximized");
//		options.addArguments("--disable-notifications");
//		options.addArguments("headless");
	//This is Not Use--> driver = new ChromeDriver(options);	
   		tlDriver.set(new ChromeDriver(options));
      getDriver().manage().window().maximize(); 
		} else if(bName.equalsIgnoreCase("ff") || bName.equalsIgnoreCase("firefox")) {
		System.setProperty("webdriver.gecko.driver",
				".Drivers/geckodriver.exe");
	//This is Not Use-->  driver = new FirefoxDriver();
   		tlDriver.set(new FirefoxDriver());
		} else if(bName.equalsIgnoreCase("edge")) {
		 System.setProperty("webdriver.edge.driver",
				".Drivers/msedgedriver.exe");
	//This is Not Use-->  driver = new FirefoxDriver();
	   	tlDriver.set(new EdgeDriver());
	    } else {
		System.out.println("Invalid Browser Name !!");
		}
   	  getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		  return driver;
  }
	public static synchronized WebDriver getDriver() {
		return tlDriver.get();
		
	}
	
}

