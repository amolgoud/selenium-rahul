package frame;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class frames {
FirefoxDriver driver;
@BeforeMethod
public void setup()
{
	driver=new FirefoxDriver();
	driver.get("http://bing.com");
}
@Test
public void multiplewndwTest()
{
driver.findElement(By.id("sb_help")).click();

Set<String> windwsid=driver.getWindowHandles();
Iterator<String> it=windwsid.iterator();
while (it.hasNext())
{
	driver.switchTo().window(it.next());
	try 
	{
	driver.findElement(By.xpath("//*[@id='privacyLabel']")).click();	
	break;
	} 
	catch (Exception e) 
	{
		
	}
	
	
}



}
}
