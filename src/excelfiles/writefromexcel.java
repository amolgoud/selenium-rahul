package excelfiles;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class writefromexcel {

	public static void main(String[] args) throws IOException 
	{
		
FileInputStream f=new FileInputStream("C:\\Users\\RAHUL\\Desktop\\Book1new.xlsx");

XSSFWorkbook wb=new XSSFWorkbook(f);
XSSFSheet ws=wb.getSheet("Sheet1");
Row r=null;
Cell c=null;

r=ws.getRow(0);
c=r.getCell(1);
c.setCellValue("abc");

r=ws.getRow(1);
c=r.getCell(2);
c.setCellValue("rraaaa");

r=ws.getRow(4);
c=r.getCell(0);
c.setCellValue("hiiii");

FileOutputStream f1=new FileOutputStream("C:\\Users\\RAHUL\\Desktop\\Book1new.xlsx");
	wb.write(f1);
f1.close();

	}

}
