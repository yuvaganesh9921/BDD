package Testng;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import fb.com.Baseclass.Base_Class_Ipt2;

public class timeout extends Base_Class_Ipt2 {
@Test (timeOut=20000)
public void time_Out() throws Throwable {
	browser_Launch();
	Thread.sleep(1000);
	get("https://adactinhotelapp.com/");
	Thread.sleep(2000);
	elementSendKeys(driver.findElement(By.id("username")),"yuva");
	Thread.sleep(3000);
	elementSendKeys(driver.findElement(By.id("password")), "1234");
	Thread.sleep(1000);
	select(driver.findElement(By.id("login")));
	
}
}
