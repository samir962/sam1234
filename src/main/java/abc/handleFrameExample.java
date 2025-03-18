package abc;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.support.ui.Select;

public class handleFrameExample {

	public static void main(String[] args) throws InterruptedException {
	
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://omayo.blogspot.com/");
		
		driver.manage().window().maximize();
		driver.navigate().refresh();
		
		Thread.sleep(2000);
		driver.findElement(By.id("iframe1")).click();
		
		Thread.sleep(2000);
		driver.switchTo().frame("iframe1");
		
		Thread.sleep(2000);
		driver.findElement(By.linkText("Google+")).click();
		
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.id("drop1"));
		
		Select s=new Select(driver.findElement(By.id("drop1")));
		
		s.selectByVisibleText("doc 3");
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("radio2")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("ta1")).sendKeys("samir sanas");
		
		Thread.sleep(3000);
		
	
	
	}

}
