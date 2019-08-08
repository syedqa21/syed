package com.common;

import java.util.concurrent.TimeUnit;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OSBase {
	
	public WebDriver driver;
	
	String browser = "chrome";
	 
	public WebDriver getDriver() {
		
		if(browser.equals("chrome"))
		{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\syed5\\eclipse-workspace\\oscommerce_testing\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		}
		else if (browser.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\syed5\\eclipse-workspace\\oscommerce_testing\\driver\\geckodriver.exe");
			driver = new FirefoxDriver();		
		}
		else {
			System.out.println("Wrong Browser Name");
		}
	
		//driver.get("https://demo.oscommerce.com");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		return driver;
		
	}
		

}
