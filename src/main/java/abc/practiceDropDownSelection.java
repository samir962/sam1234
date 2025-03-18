package abc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class practiceDropDownSelection {

	public static void main(String[] args) {


		WebDriver driver= new ChromeDriver();
		
		driver.get("https://omayo.blogspot.com/");
		
		driver.manage().window().maximize();
		
		driver.navigate().refresh();
		
		driver.findElement(By.id("drop1"));
		
		Select s= new Select(driver.findElement(By.id("drop1")));
		
		//s.selectByIndex(4);
		//s.selectByValue("ghi");
		s.selectByVisibleText("doc 3");
		
		
	}

}
