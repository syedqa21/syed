package com.stepdef;

import org.openqa.selenium.By;

import org.testng.Assert;

import com.common.OSBase;
import com.projectmodel.HomePage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SignIn extends OSBase{
	
	
	@Given("^Iam on the webpage$")
	public void iam_on_the_webpage() {
		driver = getDriver();
		driver.get("https://demo.oscommerce.com");
		
	}

	@When("^I click username and password page$")
	public void i_click_username_and_password_page() {
		//driver.findElement(By.xpath("(//span[@class='ui-button-text'])[3]")).click();
		HomePage hp = new HomePage(driver);
		hp.myAccount().click();
		
  		//driver.findElement(By.name("email_address")).sendKeys("syed706@yahoo.com");
		hp.username().sendKeys("syed706@yahoo.com");
		
		driver.findElement(By.name("password")).sendKeys("HallalFood");
	}

	@When("^I sign in$")
	public void i_sign_in() {
		driver.findElement(By.className("ui-button-text")).click();

	}

	@Then("^I am in account page$")
	public void i_am_in_account_page() {
		String title = driver.getTitle();
		Assert.assertEquals(title, "osCommerce Demo");
		driver.close();
	}

}
