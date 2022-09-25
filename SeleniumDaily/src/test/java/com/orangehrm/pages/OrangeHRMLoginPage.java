package com.orangehrm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeHRMLoginPage {
	
	WebDriver driver = null;
	
	By textbox_username = By.name("username");
	
	By textbox_password = By.name("password");
	
	By login_button = By.xpath("//button[@type='submit']");
	
	By forgot_password = By.xpath("//p[@class='oxd-text oxd-text--p orangehrm-login-forgot-header']");
	//By forgot_password = By.className("oxd-text oxd-text--p orangehrm-login-forgot-header");
	//By forgot_password = By.cssSelector("Forgot your password?");
	//p[@class='oxd-text oxd-text--p orangehrm-login-forgot-header']
	
	@FindBy(className = "oxd-userdropdown-tab") 
	WebElement logoutmenu;
	
	@FindBy(xpath = "//a[contains(text(), 'Logout')]")
	WebElement logoutBtn;
	
	public OrangeHRMLoginPage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void setTextInUsername() {
		driver.findElement(textbox_username).sendKeys("Admin");		
	}

	public void setTextInPassWord() {
		driver.findElement(textbox_password).sendKeys("admin123");
	}
	
	public void clickLogIn() {
		driver.findElement(login_button).click();
	}
	
	public void clickLogOut() {
	    	logoutmenu.isDisplayed();
	    	logoutmenu.click();
	    }
	public void forgotPassword() {
		driver.findElement(forgot_password).click();  
	}
	
//	public void exit() {
//		logoutBtn.isDisplayed();
//		logoutBtn.click();
//    }

	public void exit() {
		// TODO Auto-generated method stub
		logoutBtn.isDisplayed();
		logoutBtn.click();
	}
	
}
