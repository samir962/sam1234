package abc;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.io.FileHandler;

public class practiceNewApplication {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		
		File file=new File("C:\\Users\\samir sanas\\OneDrive\\Desktop\\Kunal\\Sachin Khatpe Expense.xlsx");
		
		FileInputStream ip= new FileInputStream(file);
		
		XSSFWorkbook workBook=new XSSFWorkbook(ip);
		 
		 XSSFSheet sheet= workBook.getSheet("Sheet5");
		
		 String userName=sheet.getRow(1).getCell(0).getStringCellValue();
	     System.out.println(userName);
	      
	     String password=sheet.getRow(1).getCell(1).getStringCellValue();
			
	     System.out.println(password);
	     
	     WebDriver driver=new ChromeDriver();
			
			driver.get("https://demo.applitools.com/");
			
			driver.manage().window().maximize();
			
			driver.navigate().refresh();
		
		
		
		Thread.sleep(2000);
		WebElement userName1=driver.findElement(By.id("username"));
		
		userName1.sendKeys("userName");
		
		Thread.sleep(2000);
		
		WebElement password1=driver.findElement(By.id("password"));
		
		password1.sendKeys("password");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		
		driver.findElement(By.id("log-in")).click();
		
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		
		Thread.sleep(2000);
		System.out.println(driver.getCurrentUrl());
	
		Thread.sleep(2000);
		System.out.println(driver.getWindowHandle());
		
		driver.navigate().refresh();
		
		Thread.sleep(2000);
		
		//driver.findElement(By.xpath("(//div[@class='content-i']//div)[1]"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		
		Thread.sleep(2000);
/*
		TakesScreenshot screenshot=  ((TakesScreenshot) driver ) ;
		
		File file3=screenshot.getScreenshotAs(OutputType.FILE);
		
		File location= new File("D:\\abcsss");
		
		
		FileHandler.copy(file3,location);
		
		*/
		
		
		driver.findElement(By.xpath("(//input[@placeholder='Start typing to search...'])[1]")).sendKeys("abcdshhbd");

	}

}
