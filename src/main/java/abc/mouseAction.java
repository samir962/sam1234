package abc;

import org.openqa.selenium.By;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseAction {


		public static void main(String[] args) {


			 WebDriver driver = new ChromeDriver();
				
				driver.get("https://omayo.blogspot.com/");

				driver.manage().window().maximize();
	WebElement blogs=driver.findElement(By.id("blogsmenu"));
				
				WebElement selenium143=driver.findElement(By.linkText("Selenium143"));
				
				WebElement seleniumByArun=driver.findElement(By.xpath("//span[normalize-space(text())='SeleniumByArun']"));
				
				WebElement buttonele=driver.findElement(By.xpath("//button[normalize-space(text())='Double click Here']"));
	WebElement ele=driver.findElement(By.xpath("//p[normalize-space(text())='PracticeAutomationHere']"));
				
				Actions act= new Actions(driver);
				
			  // act.doubleClick(buttonele).perform();  // double click
				
				act.contextClick(ele).perform();   // Right click
	/*  ////Action class
				 * Actions act= new Actions(driver); act.moveToElement(blogs)
				 * .moveToElement(seleniumByArun).click().perform(); //
				 * .moveToElement(seleniumByArun).click().perform();
				 */			

		}
	}
	