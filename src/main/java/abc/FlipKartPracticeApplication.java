package abc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipKartPracticeApplication {

	public static void main(String[] args) throws InterruptedException {

		
		 WebDriver driver=new ChromeDriver();
		 
		 driver.get("https://www.flipkart.com/");
		 
		 driver.manage().window().maximize();
		 driver.navigate().refresh();
		 
		 Thread.sleep(2000);
		 
	WebElement	searchBox=driver.findElement(By.name("q"));
	
	searchBox.sendKeys("Mobiles");
	
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//span[normalize-space(text())='Cart']")).click();

	
		 
		 
	}

}
