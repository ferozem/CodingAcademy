package com.jpm.selenium.table;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.jpm.selenium.util.ChromeUtil;

public class TableDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = ChromeUtil.getChromeDriver();
		//open the webpage
		driver.get("file:G:\\Feroze\\Programing\\Java\\JPMC Coding Academy\\Spring-Apr3\\11_SeleniumWebdriver\\src\\main\\java\\table.html");

		//maximize the browser window
		driver.manage().window().maximize();
		
		// implicit wait - tell the webdriver to wait for certain amount of time before it throws a
		// "no such element exception 
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		//locating table
		WebElement mytable=driver.findElement(By.tagName("tbody"));
		//locating rows
		List<WebElement> rows_table = mytable.findElements(By.tagName("tr"));
		
		//no of rows
		int row_count = rows_table.size();
		System.out.println("Number of rows: " +row_count);
		
		for(int row=0; row<row_count; row++){
			List<WebElement> cols_table =   rows_table.get(row).findElements(By.tagName("td")); 
			//driver.findElements(By.tagName("td"));
			int cols_count=cols_table.size();
			System.out.println("Row No: "+row +"has " +cols_count+" columns");
			
			for(int col=0; col<cols_count;col++){
				String tableData = cols_table.get(col).getText();
				System.out.println("Cell Value:" +tableData);
			}
		}
		
		// implicit wait time is applied to all the elements in the script
		// we can't specify the "Expected condition"
		//driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		//Thread.sleep(10000);
		driver.close();
		

	}

}
