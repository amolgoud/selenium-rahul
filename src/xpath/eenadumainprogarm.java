package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class eenadumainprogarm {

	public static void main(String[] args) {
		FirefoxDriver rahul=new FirefoxDriver();
		rahul.get("http://www.eenadu.net/andhra-pradesh-news.aspx");
		rahul.findElement(By.xpath("//a[@href='andhra-pradesh-news-inner.aspx?item=break171']")).click();
		
	rahul.close();
	
	}

}
