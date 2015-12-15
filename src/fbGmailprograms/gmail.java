package fbGmailprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class gmail {

	public static void main(String[] args) {
		FirefoxDriver rahul=new FirefoxDriver();
		rahul.get("http://gmail.com");
		rahul.findElement(By.id("Email")).sendKeys("amolfancy27@gmail.com");
		rahul.findElement(By.id("next")).click();
		rahul.findElement(By.id("Passwd")).sendKeys("amol27397");
		
	
	}

}