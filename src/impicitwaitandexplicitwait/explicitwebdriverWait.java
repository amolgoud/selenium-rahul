package impicitwaitandexplicitwait;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class explicitwebdriverWait {
	FirefoxDriver driver;
	@BeforeMethod
	public void setup()
	{
		driver=new FirefoxDriver();
		driver.get("http://pvrcinemas.com");
	}
	

		@Test
		public void  waittest()
		{
			WebDriverWait rahulwait=new WebDriverWait(driver, 50);
rahulwait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id='carousel-example-generic']/div/div[1]/div/div/div/span/a/i")));
rahulwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='carousel-example-generic']/div/div[2]/div/div/div/span/a/i"))).click();

			
		
}
}

