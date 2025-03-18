package testNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Listener {
	
	WebDriver driver;
	
	@BeforeClass
	void setUp() throws InterruptedException {
		
		driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com");
		driver.manage().window().maximize();
		driver.navigate().refresh();
		
		Thread.sleep(3000);
		
	}
	
	@AfterClass
	void tearDown() {

		driver.close();
	}


	@Test(priority=1)
	void loginpageLogo() throws InterruptedException {
		
		Thread.sleep(3000);
		
		boolean Logo=driver.findElement(By.xpath("//div[normalize-space(text())='Swag Labs']")).isDisplayed();
		Assert.assertTrue(Logo);

	}
	
	@Test(priority=2)
	void login() throws InterruptedException {
		
		driver.findElement(By.id("user-name")).sendKeys("problem_user");
		Thread.sleep(3000);
		
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		
		Thread.sleep(3000);
		driver.findElement(By.id("login-button")).click();
		
	}
	
	@Test(priority=3)
	void verifyLogo() {
		
		String title= driver.getTitle();
		Assert.assertEquals(title,"Swag Labs");
		 
	 }

	
	
	@Test(priority=4)
	void lgn() {
		
	}
	
	
	@Test(priority=5)
	void gn() {
		
	}
}
