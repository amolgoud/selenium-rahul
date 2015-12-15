package Testng;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class elementpresence {
	FirefoxDriver driver;
	@BeforeMethod
		public void setup()
	{
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=new FirefoxProfile();
		fp=pr.getProfile("myprofile");
		FirefoxDriver driver=new FirefoxDriver(fp);
		driver.get("http://google.com");
		
	}
	@Test
	public void elemntpresenceee()
	{
		String str=driver.getPageSource();
		if (str.contains("Qedge"))
		{
		System.out.println("yes");	
		}
		else
		{
			System.out.println("no");
			
		}
	}
	}
	