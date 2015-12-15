package datadriventestng;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class dtadrivn1 {
	FirefoxDriver driver;
	@BeforeMethod
	public void setup()
	{
		driver=new FirefoxDriver();
		driver.get("http://newtours.demoaut.com");
		
	}
@Test
public void linksTest() throws IOException
{
	FileInputStream f=new FileInputStream("C:\\Users\\RAHUL\\Downloads\\eclipse-jee-mars-R-win32 (1)\\eclipse\\rahu new\\seleniumprograms\\src\\com\\rahul\\excelfiles\\datadrivenexcel.xlsx");
	XSSFWorkbook wb=new XSSFWorkbook(f);
	XSSFSheet ws=wb.getSheet("sheet1");
	Iterator<Row> row=ws.iterator();
	row.next();
	while(row.hasNext())
	{
		Row r=row.next();
				String linkname=r.getCell(0).getStringCellValue();
		try
		
		{
			driver.findElement(By.linkText(linkname)).click();
			String acturl=driver.getCurrentUrl();
			r.createCell(2).setCellValue(acturl);
String expurl=r.getCell(1).getStringCellValue();
if(acturl.equals(expurl))
{
	r.createCell(3).setCellValue("passsed");
}
else
{
	r.createCell(3).setCellValue("failed");
}
driver.navigate().back();	
}		
		catch (Exception e) {
			r.createCell(3).setCellValue("links not found");
			
		}
	}
FileOutputStream f1=new FileOutputStream("C:\\Users\\RAHUL\\Downloads\\eclipse-jee-mars-R-win32 (1)\\eclipse\\rahu new\\seleniumprograms\\src\\com\\rahul\\resultsexcelfiles\\datadrivenexcel.xlsxlinks.xlsx");
wb.write(f1);
f1.close();
driver.quit();
}

}
