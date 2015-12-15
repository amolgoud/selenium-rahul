package impicitwaitandexplicitwait;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class explicitFluentwaitTest {
	FirefoxDriver driver;
	@BeforeMethod
	public void setup()
	{
		driver=new FirefoxDriver();
		driver.get("http://pvrcinemas.com");
	}
	
@Test
public void waitTest()
{
	FluentWait<WebDriver> rahulfluent=new FluentWait<WebDriver>(driver).withTimeout(40, TimeUnit.SECONDS).pollingEvery(2, TimeUnit.SECONDS).ignoring(NoSuchElementException.class);
	rahulfluent.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id='carousel-example-generic']/div/div[2]/div/div/div/span/a/i")));
	rahulfluent.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='carousel-example-generic']/div/div[3]/div/div/div/span/a/i"))).click();;
}

}
