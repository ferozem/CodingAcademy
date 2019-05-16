package com.jpm.selenium.popup;

import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.jpm.selenium.util.ChromeUtil;

public class PopUpWindowDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = ChromeUtil.getChromeDriver();
		//open the webpage
		driver.get("file:\\G:\\Feroze\\Programing\\Java\\JPMC Coding Academy\\Spring-Apr3\\11_SeleniumWebdriver\\src\\main\\java\\PopUpWinDemo.html");
		String parentWin = driver.getWindowHandle();
		System.out.println("Parent win: "+parentWin);
		Thread.sleep(2000);
		//maximize the browser window
		driver.manage().window().maximize();
		
		driver.findElement(By.id("newtab")).click();
		parentWin = driver.getWindowHandle();
		System.out.println("Parent win: "+parentWin);
		
		Thread.sleep(2000);
		
		Set<String> childWinList=driver.getWindowHandles();
		for(String childWin:childWinList){
			if(!childWin.equals(parentWin)){
				Thread.sleep(2000);
				driver.switchTo().window(childWin);
				System.out.println("ChildWindow: "+childWin);
				driver.findElement(By.id("alert")).click();
				Thread.sleep(2000);
				Alert alert = driver.switchTo().alert();
				Thread.sleep(2000);
				alert.accept();
			}
		}
		
//		driver.navigate().back();
		driver.switchTo().window(parentWin);
		System.out.println("Switch to parent win: "+parentWin);
		Thread.sleep(2000);
		System.out.println("Again click another child window : "+parentWin);
		driver.findElement(By.id("newwindow")).click();
		for(String childWin2: driver.getWindowHandles()){
			if(!childWin2.equals(parentWin)){
				driver.switchTo().window(childWin2);
				System.out.println("ChildWindow2: "+childWin2);
				Thread.sleep(2000);
				break;
			
		
		}
		
		}
		Thread.sleep(2000);
		driver.quit();
		//driver.close();
	}

	}
	
