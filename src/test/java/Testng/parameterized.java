package Testng;

import org.openqa.selenium.By;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import fb.com.Baseclass.Base_Class_Ipt2;

public class parameterized extends Base_Class_Ipt2{
	@Test(priority = 1)
	public void browser() {
		browser_Launch();
	}
	@Test (priority = 2)
	public void geturl() {
		get("https://adactinhotelapp.com/");
	}
	@Test(priority=3)
	@Parameters({ "username" , "password" })
	public void credential(String username, String password) {
		elementSendKeys(driver.findElement(By.id("username")),username );
		elementSendKeys(driver.findElement(By.id("password")), password);
		select(driver.findElement(By.id("login")));
		
	}
}
