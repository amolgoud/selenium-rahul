package excelfiles;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class readexclcopy {


	public static void main(String[] args) throws IOException {
		FileInputStream f=new FileInputStream("‪C:\\Users\\RAHUL\\Desktop\\rahul001.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(f);
		XSSFSheet ws=wb.getSheet("Sheet1");
		java.util.Iterator<Row> row=ws.iterator();
		while(row.hasNext())
		{
			Row r=row.next();
			java.util.Iterator<Cell> cell=r.iterator();
			while(cell.hasNext())
			{
				Cell c=cell.next();
				if(c.getCellType()==Cell.CELL_TYPE_STRING)
				{
					System.out.print(c.getStringCellValue()+"   ");
				}
				else if(c.getCellType()==Cell.CELL_TYPE_NUMERIC)
				{
					System.out.print(c.getNumericCellValue()+"   ");
				}
			}
			System.out.println();
			
		}
		
		
		
		
		
		
		
		
		
		
	}

}
