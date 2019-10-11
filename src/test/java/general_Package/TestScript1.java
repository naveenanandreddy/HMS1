package general_Package;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.log4testng.Logger;

public class TestScript1 {
	

	static Logger log = Logger.getLogger(TestScript1.class);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.setProperty("webdriver.ie.driver", "C:\\Users\\navee\\Downloads\\Naveen_Selenium\\MicrosoftWebDriver.exe");
			WebDriver driver = new InternetExplorerDriver();
			driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
			driver.get("http:/selenium4testing.com/hms/");
			driver.manage().window().maximize();
			driver.findElement(By.name("username")).sendKeys("admin");
			log.info("username entered");
			driver.findElement(By.name("password")).sendKeys("admin");
			log.info("password entered");
			driver.findElement(By.name("submit")).click();
			log.info("button clicked");
			System.out.println("Logged in Successfully");
		} catch (Exception e) {
			System.out.println("Not Logged in Successfully");
		}
		
		
	}

}
