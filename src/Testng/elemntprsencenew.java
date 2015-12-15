package Testng;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class elemntprsencenew {
FirefoxDriver driver;
@BeforeMethod
public void setup()
{
	ProfilesIni pr=new ProfilesIni();
	FirefoxProfile fp=pr.getProfile("myprofile");
	driver=new FirefoxDriver(fp);
	driver.get("http://google.com");
}

@Test
public void amol()
{
	String xyz=driver.getPageSource();
	if (xyz.contains("Qedge"))
	{
	System.out.println("rahul");	
	}
else
{
	System.out.println("ravi");

}
}
@AfterMethod
public void tearDown()
{
	driver.close();
}
}