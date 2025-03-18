package testNg;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class PracticeTestNg {

	WebDriver driver;
	
	@BeforeClass
	void setup() {

		driver = new ChromeDriver();
		
		
		
	}

	@Test(dataProvider="dp")
	void testLogin(String uname, String pwd ) throws InterruptedException {
		
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("user-name")).sendKeys(uname);
		Thread.sleep(3000);
		driver.findElement(By.id("password")).sendKeys(pwd);
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("login-button")).click();
		
	}
	
	@Test(priority=1)
	void LoginPage() {
		
	String title=driver.getTitle();
	
	System.out.println("This is verify title text" +       title);

	}
	
	@Test(priority=2)
	void verifyhomePage() {
		
		boolean text=driver.findElement(By.xpath("//div[normalize-space(text())='Swag Labs']")).isDisplayed();
		 System.out.println(text);
		 
		 assertTrue(true);
		
	}
	
	@Test(priority=3)
		void addtoCart() throws InterruptedException {
		
		Thread.sleep(2000);
		driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
		
	}
	
	@Test(priority=4)
		void sourcelabBackPackWord() throws InterruptedException {
		
		Thread.sleep(3000);
	
		WebElement	sourcelabBackPackWord=driver.findElement(By.xpath("//div[normalize-space(text())='Sauce Labs Backpack']"));
		
		System.out.println(sourcelabBackPackWord.isDisplayed());

	}
		
	
	@Test(priority=5)
		void ShoppingCartList() throws InterruptedException  {
	
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[@class='shopping_cart_container']//a[1]")).click();
	
	}
	@AfterClass
	void tearDown() throws InterruptedException{
		
		Thread.sleep(3000);
		driver.close();
	}
	
	@DataProvider(name="dp")
	
	Object[][] loginData() {
		
		Object data[][] = {{ "admon424", "A@5653" }, 
				{ "admin774", "Tsgtb536" }, 
				{ "admin7878", "pqr846" },
				{ "error_user", "secret_sauce" },

		};
		 	
		return data;
		

	}
	
	@Test(priority=6)
	void ContinueShopping() throws InterruptedException{
		
	WebElement	ContinueShopping =driver.findElement(By.xpath("(//button[contains(@class,'btn btn_secondary')])[2]"));
		
	     ContinueShopping.click();
	     Thread.sleep(3000);
			
	}	
}
