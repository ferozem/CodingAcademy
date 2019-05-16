package com.jpm.selenium.forms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.jpm.selenium.util.ChromeUtil;

public class WorkingWithFroms {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = ChromeUtil.getChromeDriver();
		//open the webpage
		driver.get("file:\\G:\\Feroze\\Programing\\Java\\JPMC Coding Academy\\Spring-Apr3\\11_SeleniumWebdriver\\src\\main\\java\\WorkingWithForms.html");

		//maximize the browser window
		driver.manage().window().maximize();
		
		driver.findElement(By.id("txtUserName")).sendKeys("JPM_Smita");
		driver.findElement(By.name("txtPwd")).sendKeys("jpm@123");
		driver.findElement(By.className("Format")).sendKeys("jpm@123");
		driver.findElement(By.cssSelector("input.Format1")).sendKeys("Smita");
		driver.findElement(By.cssSelector("Input#txtLastName")).sendKeys("Kumar");
		Thread.sleep(2000);
		
		List<WebElement> radioElements = driver.findElements(By.name("gender"));
		for(WebElement radio:radioElements){
			String radioSelection = radio.getAttribute("value").toString();
			//which radio button to be selected
			if(radioSelection.equals("Female")){
				radio.click();
			}
			
		}
		
		driver.findElement(By.cssSelector("input[type=date]")).sendKeys("12/12/2001");
		driver.findElement(By.id("txtEmail")).sendKeys("smita@gmail.com");
		driver.findElement(By.name("Address")).sendKeys("Mumbai");
		
		//Dropdown 3 ways to select --> selectByIndex, selectByValue, selectByVisibleText
		Select drpCity=new Select(driver.findElement(By.name("City")));
		drpCity.selectByIndex(3);
		drpCity.selectByValue("Mumbai");
		drpCity.selectByVisibleText("Pune");
		driver.findElement(By.name("Phone")).sendKeys("993949394");
		
		List<WebElement> checkEleList = driver.findElements(By.name("chkHobbies"));
		for(WebElement hobbyChkBox:checkEleList){
			String selection = hobbyChkBox.getAttribute("value").toString();
			if(!selection.equals("Movies")){
				hobbyChkBox.click();
			}
		}
		
		
		
		Thread.sleep(10000);
		
		driver.close();
		
		System.out.println("Registration on process!");
		
		
	}

}
