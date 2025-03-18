package abc;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class readExcelSheetData {

	public static void main(String[] args) throws IOException {
		
		File file= new File("C:\\Users\\samir sanas\\OneDrive\\Desktop\\Kunal\\Sachin Khatpe Expense.xlsx");
		
		   FileInputStream ip= new FileInputStream(file);

		
		 XSSFWorkbook workBook=new XSSFWorkbook(ip);
		 
		//  XSSFSheet sh= workBook.getSheetAt(4);
		     
		     XSSFSheet sheet= workBook.getSheet("Sheet5");
		      
		     String userName=sheet.getRow(1).getCell(0).getStringCellValue();
		     System.out.println(userName);
		      
		     String password=sheet.getRow(1).getCell(1).getStringCellValue();
				
		     System.out.println(password);
		     
		   /*  
		int rowCount=sheet.getLastRowNum();
		     System.out.println(rowCount);
		     
		     int columnCount=sheet.getRow(0).getLastCellNum();
		     
		     System.out.println(columnCount);
		     
			for (int r=0; r<rowCount; r++)	{
				
				for(int c=0; c<columnCount; c++) {
		String Value=sheet.getRow(r).getCell(c).getStringCellValue();
					System.out.print(Value +"                   ");
				}
				
				System.out.println();

			}
*/
	}

}
