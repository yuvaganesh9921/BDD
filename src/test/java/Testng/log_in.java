package Testng;

import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import fb.com.Baseclass.Base_Class_Ipt2;

public class log_in extends Base_Class_Ipt2{
@BeforeSuite
public void setproperty() {
	System.setProperty("webdriver.chrome.driver", ".\\src\\test\\resources\\driver\\chromedriver.exe");
}
@BeforeTest
public void browser_lunch() {
	browser_Launch();
	//System.out.println("broswer start");
}
@BeforeClass
public void geturl() {
	//System.out.println("url start");
	get("https://www.amazon.in");
}
@BeforeMethod
public void singIn() throws Throwable {
	//System.out.println("sing in");
	select(driver.findElement(By.xpath("(//a[@data-nav-role='signin'])[1]")));
	ThreadSleepForSecond(2);
	elementSendKeys(driver.findElement(By.id("ap_email")), "9025948267\n");
	elementSendKeys(driver.findElement(By.id("ap_password")), "Ambika@9614\n");
	
}
@Test
public void dress() {
	elementSendKeys(driver.findElement(By.id("twotabsearchtextbox")), "dress\n");
	select(driver.findElement(By.xpath("(//div[@class='a-section a-spacing-base a-text-center']//descendant::div[@class='a-section a-spacing-none a-spacing-top-small s-title-instructions-style']//following::h2[@class='a-size-mini a-spacing-none a-color-base s-line-clamp-2']//span[@class='a-size-base-plus a-color-base a-text-normal'])[3]")));
	
}
@Test
public void tshit() {
	elementSendKeys(driver.findElement(By.id("twotabsearchtextbox")), "tshirt\n");
	select(driver.findElement(By.xpath("(//h2[contains(@class,'a-size-mini')])[3]")));
}
@AfterMethod
public void singoff() {
	  Window_Handle("select(driver.findElement(By.xpath(\"//span[text()='Sign Out']\")));");   
	 
}

@AfterTest
public void close() {
	driver.close();
}
@AfterSuite
public void deletecookies() {
	driver.manage().deleteAllCookies();
}
}













