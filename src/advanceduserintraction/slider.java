package advanceduserintraction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class slider {
	FirefoxDriver driver;
	@BeforeMethod
	public void setup()
	{
		driver=new FirefoxDriver();
		driver.get("https://jqueryui.com/slider/");
		
		
}
@Test
public void draganddropTest()
{
	Actions action=new Actions(driver);
	driver.switchTo().frame(0);
	WebElement slider=driver.findElement(By.xpath("//*[@id='slider']/span"));
	int x=slider.getLocation().x;
	int y=slider.getLocation().y;
	System.out.println(x+"--"+y);
	action.dragAndDropBy(slider, 50, y).build().perform();
}
}
