package testNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Paramatrization {
	
	WebDriver driver;

	@BeforeClass
	void setup() {

		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
			
	}
	
	@Test(priority=1)
	void logo() {
		
	boolean	logo=driver.findElement(By.xpath("login_logo")).isDisplayed();
		Assert.assertEquals(logo, true);
	}

	@Test(priority=2)
	void ad() {
		
		
	}	
	
	@Test(priority=3)
	void loinApp() {
		
		
	}
	
	@Test(priority=4)
	void ygp() {
		
		
	}
	
}
