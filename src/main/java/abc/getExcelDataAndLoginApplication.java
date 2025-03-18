package abc;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getExcelDataAndLoginApplication {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		
	
		File file=new File("C:\\\\Users\\\\samir sanas\\\\OneDrive\\\\Desktop\\\\Kunal\\\\Sachin Khatpe Expense.xlsx");
		
		FileInputStream ip= new FileInputStream(file);
		
		 XSSFWorkbook workBook=new XSSFWorkbook(ip);
		 
		 XSSFSheet sheet= workBook.getSheet("Sheet5");
		 
		 String userName=sheet.getRow(1).getCell(0).getStringCellValue();
	     System.out.println(userName);
	      
	     String password=sheet.getRow(1).getCell(1).getStringCellValue();
			
	     System.out.println(password);
	     
	     WebDriver driver=new ChromeDriver();
	     
	     driver.get("https://www.saucedemo.com/");
	     
	     driver.manage().window().maximize();
	     
	     driver.navigate().refresh();
	     //String title=driver.getTitle();
	     
	     System.out.println(driver.getTitle());
	     
	     Thread.sleep(2000);
	     
	     driver.findElement(By.id("user-name")).sendKeys(userName);	     
	     
	    Thread.sleep(2000);
	    
	    driver.findElement(By.id("password")).sendKeys(password);	
	    
	   Thread.sleep(2000);
	   
	   driver.findElement(By.id("login-button")).click();
	   
	   driver.navigate().refresh();
	   
	   driver.findElement(By.id("react-burger-menu-btn")).click();
	   
	   
	   
	   

	}

}
