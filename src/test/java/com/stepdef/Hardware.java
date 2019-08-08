package com.stepdef;

import org.openqa.selenium.By;

import com.common.OSBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

	public class Hardware extends OSBase {

		@Given("^I am on the webpage$")
		public void i_am_on_the_webpage() {
			driver= getDriver();
			driver.get("https://demo.oscommerce.com");
		    
		    
		}

		@When("^I click hardware page and click on printer button and select printer$")
		public void i_click_hardware_page_and_click_on_printer_button_and_select_printer() {
			driver.findElement(By.xpath("(//*[@id=\"tdb3\"]/span[2]")).click();
			driver.findElement(By.xpath("(//*[@id=\"bodyContent\"]/div/div/table/tbody/tr[3]/td[1]/a/img")).click();
			driver.findElement(By.xpath("(//*[@id=\"bodyContent\"]/div/div/div[1]/div[2]/table/tbody/tr/td[1]/a/img")).click();
		    
		    
		}

     @When("^I choose my printer$")
     public void i_choose_my_printer() {
          driver.findElement(By.xpath("(//*[@id=\"bodyContent\"]/div/div/div[1]/div[2]/table/tbody/tr/td[1]/a/img")).click();
     }

		
		    
	

		@Then("^I add printer to cart and checkout$")
		public void i_add_printer_to_cart_and_checkout() {
			driver.findElement(By.xpath("(//*[@id=\"bodyContent\"]/form/div[1]/h1[2])")).click();
		    
		    
		}

	}
		
	
	
