package general_Package;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class TestScript3 {
	WebDriver driver;
  @Test
  public void f() {
	  
		try {
			System.setProperty("webdriver.ie.driver", "C:\\Users\\navee\\Downloads\\Naveen_Selenium\\MicrosoftWebDriver.exe");
			driver = new InternetExplorerDriver();
			driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
			driver.get("http:/selenium4testing.com/hms/");
			driver.manage().window().maximize();
			driver.findElement(By.name("username")).sendKeys("admin");
			driver.findElement(By.name("password")).sendKeys("admin");
			driver.findElement(By.name("submit")).click();
			System.out.println("Logged in Successfully");
			driver.findElement(By.linkText("Logout")).click();
			//driver.quit();
		
		} catch (Exception e) {
			System.out.println("Not Logged in Successfully");
			//e.printStackTrace();
			e.getMessage();
			driver.quit();
		}
		
  }
  
}
