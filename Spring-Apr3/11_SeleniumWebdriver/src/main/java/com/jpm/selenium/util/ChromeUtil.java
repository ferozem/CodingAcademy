package com.jpm.selenium.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeUtil {
	
	public static WebDriver getChromeDriver(){
		WebDriver driver = null;
		//step 1 :driver class
		String driverClassKey = "webdriver.chrome.driver";
		//setup  2: driver path
		String driverPath=".\\driver\\chromedriver.exe";
		//step 3: set the system class properties
		System.setProperty(driverClassKey, driverPath);
		// step 4: set the chrome options
		ChromeOptions options = new ChromeOptions();
		// step 5: get the chrome driver instance by passing chrome options
		driver = new ChromeDriver(options);
		System.out.println("Trying to load chrome browser");
		if(driver!=null){
			System.out.println("Driver not loaded");
		}
		
		return driver;
		
	}
	
	public static void main(String[] args) {
		WebDriver driver = ChromeUtil.getChromeDriver();
		System.out.println("Opening the Browser");
		System.out.println("Driver:" +driver);
		System.out.println("Closing the Browser");
		driver.close();
		
		//get
		//getCurrentUrl
		//findElement
		//getPageSource
		//getTitle()
		//close()
		//quite() -- close all the instances of browser created by webdirver
		//getWindowHandles()- hangling child window
		// switchTo() - switching between windows
		//navigate() - to do browser navigation - back, forward, to, refresh
	}

}
