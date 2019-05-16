package com.jpm.selenium.driver_cmd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.jpm.selenium.util.ChromeUtil;

public class WebDriverCommands {

	public static void main(String[] args) throws InterruptedException {
		//we need instance of driver
		WebDriver driver = ChromeUtil.getChromeDriver();
		if(driver!=null){
			// get -- to launch the website
			//String url = "http://www.synergetics-india.com/";
			String url = "file:\\G:\\Feroze\\Programing\\Java\\JPMC Coding Academy\\Spring-Apr3\\11_SeleniumWebdriver\\src\\main\\java\\Locators.html";
			driver.get(url);
			//get the title of the webpage
			System.out.println("Title of the page is:" +driver.getTitle());
			System.out.println("Current Url: " +driver.getCurrentUrl());
			//By.Id
			WebElement element = driver.findElement(By.id("user"));
			System.out.println("Element 1:" +element.getAttribute("id"));
			element.sendKeys("admin");// input data in that element
			driver.findElement(By.name("admin")).sendKeys("password123");
			element = driver.findElement(By.linkText("How to use locators?"));
			System.out.println("element link test: " +element.getText());
			Thread.sleep(2000);
			element.click(); // it will click the link as the webelement is holding link ref
		
		}else {
			System.out.println("Driver not loaded");
		}
		Thread.sleep(1000);
		driver.close();

	}

}
