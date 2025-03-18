package testNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestLogin {

	WebDriver driver;

	@BeforeClass
	void setup() {

		driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
	}

	@AfterClass
	void tearDown() throws InterruptedException {
		Thread.sleep(4000);
		driver.quit();
	}

	@Test
	public void loginTest() throws InterruptedException {

		Thread.sleep(3000);
		// LoginPage log=new LoginPage(driver);

		loginpage log = new loginpage(driver);

		log.enterUserName("standard_user");
		log.enterPassword("secret_sauce");
		log.clickOnLoginButton();

	}

	@Test
	public void verifyAddToCart() throws InterruptedException {

		ProductDetails product = new ProductDetails(driver);
		Thread.sleep(2000);
		product.addToCart();

	}

}
