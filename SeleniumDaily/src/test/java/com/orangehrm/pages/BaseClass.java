package com.orangehrm.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	WebDriver driver;
	
	public void startBrowser() {
		WebDriverManager.chromedriver().setup();
		
	}

}
