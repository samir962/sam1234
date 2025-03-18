package testNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnotationExample {
	
	WebDriver driver;
	
@AfterMethod
void loginapp() throws InterruptedException {
	
	driver.manage().window().maximize();
	
	Thread.sleep(2000);
	driver.findElement(By.id("username")).sendKeys("userName");
	
	
	Thread.sleep(2000);
	
	WebElement password1=driver.findElement(By.id("password"));
	
	password1.sendKeys("password");
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//input[@type='checkbox']")).click();
	
	driver.findElement(By.id("log-in")).click();		
		System.out.println("Login the Application");
		
	}

@AfterMethod
void logotApp() {
	
	driver.close();

	//System.out.println("logout the application");

}

@Test(priority=1)
void VerifyHomepage() {
	
	 //driver.getTitle();
	System.out.println("verify HomePage verify " + driver.getTitle());

	
}

@Test(priority=0)
void openAppliaction() {
	  driver = new ChromeDriver();
	 	//	WebDriver driver = new FirefoxDriver();
driver.get("https://demo.applitools.com/#");
	System.out.println("openeing the application");
}



}
	
	


