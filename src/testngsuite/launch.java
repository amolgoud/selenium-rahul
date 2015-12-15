package testngsuite;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class launch {
	static  FirefoxDriver  driver=null;
	@BeforeClass
	public void launchApp()
	{
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("MyProfile");
		driver=new FirefoxDriver(fp);
		driver.get("http://newtours.demoaut.com");
	}
	@AfterClass
	public void closeApp()
	{
		driver.quit();
	}


}
