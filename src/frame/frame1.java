package frame;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class frame1 {
	FirefoxDriver driver;
	@BeforeMethod
	public void setup()
	{
		driver=new FirefoxDriver();
		driver.get("http://www.angelfire.com/super/badwebs/");
	}
	@Test
	public void framesTest()
	{
		List<WebElement> rahulsframe=driver.findElements(By.tagName("Frame"));
	System.out.println(rahulsframe.size());
	for (int i = 0; i < rahulsframe.size(); i++)
	{
	driver.switchTo().frame(i);
	try 
	{
	driver.findElement(By.xpath("html/body/p[5]/b/a/font")).click();	
	break;
	
	}
	catch (Exception e)
	{
		driver.switchTo().defaultContent();
		
	}
	}
	}
}