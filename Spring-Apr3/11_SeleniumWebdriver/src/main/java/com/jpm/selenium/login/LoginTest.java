package com.jpm.selenium.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.jpm.selenium.util.ChromeUtil;

public class LoginTest {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = ChromeUtil.getChromeDriver();
		
		if(driver !=null){
			String url = "http://www.gcrit.com/build3/admin/login.php";
			driver.get(url);
			driver.findElement(By.name("username")).sendKeys("admin");
			driver.findElement(By.name("password")).sendKeys("admin@123");
			Thread.sleep(2000);
			driver.findElement(By.id("tdb1")).click();
			
		}else{
			System.out.println("Driver is not Working");
		}

	}

}