package javascriptexecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class hiddenlinkEMAIL {
	FirefoxDriver driver;
	@BeforeMethod
	public void setup()
	{
		driver=new FirefoxDriver();
		driver.get("http://www.yssofindia.org");
		
	}
	@Test
	public void javaScriptexecutorTest()
	{
		WebElement rahul=driver.findElement(By.xpath("//*[@id='topmenu']/div/ul/li[5]/ul/li[9]/ul/li[1]/a"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();",rahul);
		
	}

}
