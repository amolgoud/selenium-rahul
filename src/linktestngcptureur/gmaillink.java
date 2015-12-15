package linktestngcptureur;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class gmaillink {

	public static void main(String[] args) {
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=new FirefoxProfile();
		fp=pr.getProfile("myprofile");
		FirefoxDriver driver=new FirefoxDriver(fp);
		driver.get("http://google.com");
	driver.findElement(By.linkText("Gmail")).click();
	String exptitle="Gmail - Free Storage and Email from Google";
	String acttittle=driver.getTitle();
	if (exptitle.equals(acttittle))
	{
	
		System.out.println("correct");
		
	}
		else
		{
		System.out.println("wrong");	
		}
	

	}

}
