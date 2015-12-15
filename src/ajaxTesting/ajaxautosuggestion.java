package ajaxTesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ajaxautosuggestion {
	FirefoxDriver driver;
	@BeforeMethod
	public void setup()
	{
		driver=new FirefoxDriver();
		driver.get("http://google.com");
		

}
@Test
public void ajaxates() throws InterruptedException 
{
	driver.findElement(By.name("q")).sendKeys("selenium");
	
	Thread.sleep(1000);
	WebElement blockrahul=driver.findElement(By.xpath("//*[@id='sbtc']/div[2]/div[2]/div[1]"));
	List<WebElement> ajax=blockrahul.findElements(By.xpath("//*[starts-with(@id,'sbse')]/div[2]"));
	System.out.println(ajax.size());
	for (int i = 0; i < ajax.size(); i++) 
	{
	System.out.println(ajax.get(i).getText());
	}
	
	}
	
}
