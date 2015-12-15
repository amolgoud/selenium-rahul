package cookiesTesting;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class cookies {
	FirefoxDriver driver;
	@BeforeMethod
	public void setup()
	{
		driver=new FirefoxDriver();
		driver.get("http://mirror.co.uk");
	}
	
	
	@Test
	public void cookieTest()
	{
		Set<org.openqa.selenium.Cookie> mycookies=driver.manage().getCookies();
		System.out.println(mycookies.size());
		Iterator<org.openqa.selenium.Cookie> it=mycookies.iterator();
		while (it.hasNext()) 
		{
			org.openqa.selenium.Cookie c=it.next(); 
					System.out.println(c.getName()+"   "+c.getDomain());
		}
		driver.manage().deleteAllCookies();
		mycookies=driver.manage().getCookies();
		System.out.println(mycookies.size());
	}
		}