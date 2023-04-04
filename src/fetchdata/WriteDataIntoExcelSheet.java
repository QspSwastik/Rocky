package fetchdata;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class WriteDataIntoExcelSheet 
{
@Test
public void writeData() throws IOException
{
	FileInputStream fis = new FileInputStream("./excelfile/swastik.xlsx");
	Workbook wb = new XSSFWorkbook(fis);
	Sheet s = wb.getSheet("prodosh");//create sheet use to create sheet 
	Row r = s.createRow(2);
	Cell c = r.createCell(3);
	c.setCellValue("neha mohapatra");
	
	FileOutputStream fos = new FileOutputStream("./excelfile/swastik.xlsx");
	wb.write(fos);
}
}
