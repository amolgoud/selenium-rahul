package webTableTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class staticWebtstng2 {
	FirefoxDriver driver;
	@BeforeMethod
	public void setup()
	{
		driver=new FirefoxDriver();
		driver.get("http://www.timeanddate.com/worldclock/");
		

}
	@Test
	public void webtableTest()
	{
		String rahul="html/body/div[1]/div[7]/section[2]/div[1]/table/tbody/tr[";
				String rahull="]/td[";
				String rahulll="]";
				for (int i = 1; i < 37; i++)
				    {
					  for (int j = 1; j < 8; j++) 
					    {
						String x=driver.findElement(By.xpath(rahul+i+rahull+j+rahulll)).getText();
						System.out.print(x+"  ");
                          System.out.println();
					    }
				    }
					
				}
				
				

}
