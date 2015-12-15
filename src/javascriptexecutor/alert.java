package javascriptexecutor;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class alert {
	FirefoxDriver driver;
	@BeforeMethod
	public void setup()
	{
		driver=new FirefoxDriver();
		driver.get("http://google.com");
		
	}
@Test
public void alertHandletest() throws InterruptedException
{
	JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("alert('hello world');");
		alertHandle();
	}
		
	public void alertHandle()
	{
		try 
		{
			Alert alert=driver.switchTo().alert();
			alert.accept();
		} 
		catch (Exception e)
		{
			
		}
	
	}
}

