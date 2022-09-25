package SeleniumFirstDay;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GooglePage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		googlePageNavigate();
		
	}
	
	public static void googlePageNavigate() {
		
		WebDriverManager.chromiumdriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://google.com");
		driver.findElement(By.name("q")).sendKeys("automation");
		
		driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
		
	}

}
