package xpath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class headlines {

	public static void main(String[] args) {
		FirefoxDriver rahul=new FirefoxDriver();
		rahul.get("https://news.google.co.in/");
		List<WebElement> headlines=rahul.findElements(By.xpath("//h2/a/span[@class='titletext']"));
		for (int i = 0; i < headlines.size(); i++) {
			System.out.println(headlines.get(i).getText());
			
		}
			
		}
		
		

	}


