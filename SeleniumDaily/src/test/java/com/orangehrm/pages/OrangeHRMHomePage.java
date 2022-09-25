package com.orangehrm.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeHRMHomePage {
	
	WebDriver driver = null;
	
	@FindBy(className = "oxd-userdropdown-tab") 
	WebElement logoutmenu;
	
	@FindBy(xpath = "//a[contains(text(), 'Logout')]")
	WebElement logoutbutton;
	
	public OrangeHRMHomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
    public void clickLogOut() {
    	logoutmenu.isDisplayed();
    	logoutmenu.click();
    }
    
    public void logout() {
    	logoutbutton.isDisplayed();
    	logoutbutton.click();
    }
}
