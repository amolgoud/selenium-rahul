package linktestngcptureur;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class urlcpture {

	public static void main(String[] args) {
		
ProfilesIni pr=new ProfilesIni();
FirefoxProfile fp=new FirefoxProfile();
fp=pr.getProfile("myprofile");
FirefoxDriver driver=new FirefoxDriver(fp);
driver.get("http://bing.com");
String expctdurl=driver.findElement(By.linkText("VIDEOS")).getAttribute("href");
driver.findElement(By.linkText("VIDEOS")).click();
String actualurl=driver.getCurrentUrl();
if (actualurl.contains(expctdurl)) 
{
System.out.println("videos link working corrrctly");	
}
else
{
	System.out.println("videos link working corrrctly");
}
driver.close();
	}

}
