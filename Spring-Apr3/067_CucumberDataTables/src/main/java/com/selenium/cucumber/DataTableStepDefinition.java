/**
 * 
 */
package com.selenium.cucumber;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;
import cucumber.table.DataTable;

/**
 * @author brije
 *
 */
public class DataTableStepDefinition {
	protected WebDriver driver;

	
	@Given("^I am on the new user registration page$")
	public void I_am_on_the_new_user_registration_page() {
		System.out.println("Getting the driver");
		driver = ChromeDriverUtil.getDriver();
		driver.get("https://www.facebook.com/");
		System.out.println("Opening Facebook Page .....");
	   
	}

	@When("^I enter invalid data on the page$")
	public void I_enter_invalid_data_on_the_page(DataTable table) {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//Initialize data table 
	      List<List<String>> data = table.raw();
	      System.out.println(data.get(1).get(1)); 	      
	      //Enter data
	      driver.findElement(By.name("firstname")).sendKeys(data.get(1).get(1));
	      driver.findElement(By.name("lastname")).sendKeys(data.get(2).get(1));
	      driver.findElement(By.name("reg_email__")).sendKeys(data.get(3).get(1));     
	      driver.findElement(By.name("reg_email_confirmation__")).
	         sendKeys(data.get(4).get(1)); 
	      driver.findElement(By.name("reg_passwd__")).sendKeys(data.get(5).get(1)); 	      
	      Select dropdownB = new Select(driver.findElement(By.name("birthday_day"))); 
	      dropdownB.selectByValue("15"); 			
	      Select dropdownM = new Select(driver.findElement(By.name("birthday_month")));
	      dropdownM.selectByValue("6"); 			
	      Select dropdownY = new Select(driver.findElement(By.name("birthday_year")));
	      dropdownY.selectByValue("1990"); 			
	      driver.findElement(By.className("_58mt")).click(); 
	      // Click submit button driver.findElement(By.name("websubmit")).click(); 
	}
	@Then("^User registration should be unsuccessful$")
	public void User_registration_should_be_unsuccessful() {
		if(driver.getCurrentUrl().equalsIgnoreCase("https://www.facebook.com/")){
	         System.out.println("Test Pass"); 
	      } else { 
	         System.out.println("Test Failed"); 
	      } 
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	      driver.close(); 
	}
}
