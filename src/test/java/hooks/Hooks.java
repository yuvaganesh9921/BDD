package hooks;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import fb.com.Baseclass.Base_Class_Ipt2;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks extends Base_Class_Ipt2 {
	@Before
	public void BeforeHook() {
		System.out.println("am before hooks");
	}
	@After
	public void AfterHooks(Scenario scenario) {
		TakesScreenshot ts = (TakesScreenshot)driver;
		byte[] screenshotAs = ts.getScreenshotAs(OutputType.BYTES);
		scenario.attach(screenshotAs, "image/png", "screenshot");
		
		driver.close();
	}
}
