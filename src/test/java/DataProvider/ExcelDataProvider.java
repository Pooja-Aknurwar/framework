package DataProvider;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider {
		
		XSSFWorkbook wb;
		XSSFSheet sheet;
		
		public  ExcelDataProvider (){
			try {
				File src = new File("C:\\Users\\yogesh.aknurwar\\Desktop\\Automation\\Drivers and Jars\\TestData.xlsx");
				FileInputStream fis = new FileInputStream(src);
				wb = new XSSFWorkbook(fis);
			} 
			catch (Exception e) {
				System.out.println(e.getMessage());
	     		}
		
		}
		
		public String getData(int sheetno, int row, int col)
		{
			sheet= wb.getSheetAt(sheetno);
			String data = sheet.getRow(row).getCell(col).getStringCellValue();
			return data ;
		}
		
		public int getRow(int sheetno)
		{
			int row_no = wb.getSheetAt(sheetno).getLastRowNum();
			int row = row_no + 1;
			return row;	

		}

	}


