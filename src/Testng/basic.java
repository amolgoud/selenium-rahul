package Testng;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class basic {
	@Test(priority=0)
	public void loginTest()
	{
		System.out.println("login");
	}
	
	
	
	@Test(priority=1)
	public void registratn(){
		System.out.println("registratn");
	
	}
	@Test(priority=2)
	public void logout(){
		System.out.println("logout");
		
	}
	@BeforeMethod
	public void funtion()
	{
		System.out.println("amol");
	}

}
