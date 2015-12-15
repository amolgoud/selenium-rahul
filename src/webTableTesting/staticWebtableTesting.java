package webTableTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class staticWebtableTesting {
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
				String rahull="]/td[1]";
				System.out.println("************R@HUUUL*********");
				for (int i = 1; i < 37; i++)
				{
				
					String x=driver.findElement(By.xpath(rahul+i+rahull)).getText();
					System.out.println(x);
					
				}
				
	}
}
	
	
	