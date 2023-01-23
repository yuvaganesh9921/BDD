package Testng;

import org.openqa.selenium.By;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import fb.com.Baseclass.Base_Class_Ipt2;

public class test extends Base_Class_Ipt2 {
 @Test(priority = 1)
 public void broswer_launch() {
	 browser_Launch();
 }
 @Test(priority = 2)
 public void geturl() {
	get("https://adactinhotelapp.com/");
 }
 @Ignore
 @Test(priority = 3)
 public void username() {
	 elementSendKeys(driver.findElement(By.id("username")), "yuva");
 }
 @Test(priority = 4)
 public void password() {
	 elementSendKeys(driver.findElement(By.id("password")), "1234");
 }
 @Test(priority = 5)
 public void click() {
	 select(driver.findElement(By.id("login")));
 }
}
