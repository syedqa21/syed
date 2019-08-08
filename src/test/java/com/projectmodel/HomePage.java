package com.projectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	WebDriver driver;

	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}
	
	//driver.findElement(By.xpath("(//span{@class='ui-button-text'])[3]")).click();
	
	@FindBy(xpath=("(//span[@class='ui-button-text'])[3]"))
	WebElement btn_myAccount; 
	
	public WebElement myAccount() {
		return btn_myAccount;
}

//driver.findelement(By.name("email_address")).Syntax("syed706@yahoo.com");
   @FindBy(name="email_address")
    WebElement edt_userName;
    

public WebElement username() {
 return edt_userName;
}


//driver.findelement(by.name("password")).syntax("hallalFood")
	
	

}
