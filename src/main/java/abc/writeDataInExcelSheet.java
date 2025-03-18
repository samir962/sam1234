package abc;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class writeDataInExcelSheet {

	public static void main(String[] args) throws IOException {


		File file = new File("C:\\Users\\samir sanas\\OneDrive\\Desktop\\Kunal\\Sachin Khatpe Expense.xlsx");
		
	      FileInputStream ip= new FileInputStream(file);
	      
	      XSSFWorkbook workBook=new XSSFWorkbook(ip);
	      
	      XSSFSheet sheet= workBook.getSheet("Sheet4");
		     
		    XSSFRow row= sheet.createRow(0);
		    sheet.getRow(0).createCell(1).setCellValue("dhjdgfhfbfhmmm");
		   
		        
		    FileOutputStream op= new FileOutputStream(file);
		    workBook.write(op);
		    
		    //workBook.close();

	      


		

	}

}
