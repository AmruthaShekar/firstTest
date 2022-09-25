package SeleniumFirstDay;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElementsDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		WebElement username = driver.findElement(By.id("txtUsername"));
		
		System.out.println(username.isDisplayed());
		
		System.out.println(username.isEnabled());
		
		username.sendKeys("Admin");
		
		WebElement pwd = driver.findElement(By.name("txtPassword"));
		
		pwd.sendKeys("admin123");
		
		WebElement loginbutton = driver.findElement(By.className("button"));
		
		loginbutton.click();
		
		WebElement logoutpanel = driver.findElement(By.partialLinkText("Welcome"));
		logoutpanel.click();
		
		driver.findElement(By.linkText("Logout")).click();
	}

}
