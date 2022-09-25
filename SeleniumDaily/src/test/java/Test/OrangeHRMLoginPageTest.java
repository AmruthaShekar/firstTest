package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.orangehrm.pages.OrangeHRMLoginPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeHRMLoginPageTest {

	static WebDriver driver = null;
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		googleSearchTest();

	}

	public static void googleSearchTest() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup(); 
		WebDriver driver = new ChromeDriver();
		//String ProjectPath = System.getProperty("user.dir");
		//System.out.println("ProjectPath:" + ProjectPath);
		
		//System.setProperty("webdriver.chrome.driver", ProjectPath+"/drivers/chromedriver_linux64/chromedriver");
		//System.setProperty("webdriver.chrome.driver", "/home/ranga/Documents/chromedriver_linux64/chromedriver");
				
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(null); 
		
		OrangeHRMLoginPage hrm = new OrangeHRMLoginPage(driver);
		
		Thread.sleep(1000);
		
		hrm.setTextInUsername();		
		hrm.setTextInPassWord();
		hrm.forgotPassword();
		//hrm.clickLogIn();
		//hrm.clickLogOut();
		//hrm.exit();
		
		String title = driver.getTitle();
		if(title.equals("OrangeHRM"))
			System.out.println("Login Successful");
		else
			System.out.println("Login Failure");
		//driver.close();
	}

}
