package com.AutomationFramework.Browser_Manager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class launch_browser {

	public static WebDriver driver;
	 static launch_browser instance =null;
	 
	 public static WebDriver getDriver()
		{
			return driver;
		}
	 
	 public static launch_browser getInstace() 
		{
				instance = new launch_browser();
			return instance;
		}
		
	public void open_browser(String browser_name, String path ) {
		if(browser_name.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", path);
			driver = new ChromeDriver();			
		}
		else if(browser_name.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", path);
			driver = new FirefoxDriver();
		}
		
		else {
			// Run code with default browser
			System.setProperty("webdriver.chrome.driver", path);
			driver = new ChromeDriver();		
		}
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in");
	}
	
	
	public void Close_browser()throws Throwable
	{
		Thread.sleep(2000);
		driver.quit();
	}
	
}
