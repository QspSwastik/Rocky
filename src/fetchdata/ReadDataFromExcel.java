package fetchdata;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadDataFromExcel 
{
	@Test
	public void readdata() throws IOException
	{
	FileInputStream fis = new FileInputStream("./excelfile/swastik.xlsx");
	
	Workbook wb = new XSSFWorkbook(fis);

	
	System.out.println(wb.getSheet("swastik").getRow(2).getCell(3).toString());
	
	
	}
}
	

