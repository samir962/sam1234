package testNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class paraMetarizationUsingXml {
	
	WebDriver driver;

    @Parameters({"Browser"})
	@BeforeClass
	void setup(String bwr) throws InterruptedException {

		if ("chrome".equalsIgnoreCase(bwr)) {
			driver = new ChromeDriver();
		}
else if ("firefox".equalsIgnoreCase(bwr)){
		driver = new FirefoxDriver();
		}
	   else if ("edge".equalsIgnoreCase(bwr)){
			
			driver = new EdgeDriver();
		}
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}
    @AfterClass
	void tearDown() {

		driver.close();
	}
	
	 @Test
	 @Parameters({"Username", "Password"})
	void login(String uname, String pwd) throws InterruptedException {

		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(uname);
		Thread.sleep(1000);
driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(pwd);
		Thread.sleep(1000);
		// driver.findElement(By.xpath("//button[@type='submit']")).click();

		driver.findElement(By.cssSelector("button.oxd-button.oxd-button--medium")).click();

		Thread.sleep(3000);
		}

     
    

}
