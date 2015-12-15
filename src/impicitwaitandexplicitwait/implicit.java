package impicitwaitandexplicitwait;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class implicit {
	FirefoxDriver driver;
	@BeforeMethod
	public void setup()
	{
		driver=new FirefoxDriver();
		driver.get("http://pvrcinemas.com");
		

}
@Test
public void implicitwaitTest()
{
	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//*[@id='carousel-example-generic']/div/div[1]/div/div/div/span/a/i")).click();
}

}
