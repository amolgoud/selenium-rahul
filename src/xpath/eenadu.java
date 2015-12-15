package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class eenadu {

	public static void main(String[] args) {
		FirefoxDriver rahul=new FirefoxDriver();
		rahul.get("http://gmail.com");
		String x=rahul.findElement(By.xpath("//p[@class='tagline']")).getText();
		System.out.println(x);
	
	}

}
