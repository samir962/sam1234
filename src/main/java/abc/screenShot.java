package abc;

import java.io.File;
import java.io.IOException;
//import java.nio.file.Files;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class screenShot {

	public static void main(String[] args) throws IOException {
WebDriver driver=new ChromeDriver();
		
		driver.get("https://omayo.blogspot.com/");
		
		driver.manage().window().maximize();
		driver.navigate().refresh();
		
	
		TakesScreenshot screenshot=  ((TakesScreenshot) driver ) ;
		
		File file=screenshot.getScreenshotAs(OutputType.FILE);
		
		File location= new File("C://Users/samir sanas/OneDrive/Pictures/ram/abc.png");
		
		//FileUtils.
		
		FileHandler.copy(file,location);

	}

}
