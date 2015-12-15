package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class dynamicxpath {

	public static void main(String[] args) {
	FirefoxDriver driver=new FirefoxDriver();
	driver.get("http://yahoo.com");
	driver.findElement(By.xpath("//*[Start-with(@id,'yui_3_12_0_1_144423')]/div/ol/li[9]/a")).click();

	}

}
