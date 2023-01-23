package Testng;

import org.testng.annotations.Test;

import fb.com.Baseclass.Base_Class_Ipt2;

public class Invocation_count extends Base_Class_Ipt2{
	@Test(priority = 1)
	public void broswer_launch() {
		browser_Launch();
	}
	@Test(priority = 2)
	public void geturl() {
		get("https://aws.amazon.com/");
	}
	@Test (priority = 3,invocationCount =3 )
	public void refresh() {
		driver.navigate().refresh();
	}
}
