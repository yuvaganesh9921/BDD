package Pageobjectmanager;

import org.openqa.selenium.WebDriver;

import fb.com.Baseclass.Base_Class_Ipt2;
import fb.com.locator.Filcard_ss;
import fb.com.locator.Log_in;

public class pageobjectmanager extends Base_Class_Ipt2 {
	public pageobjectmanager(WebDriver xdriver) {
		this.driver=xdriver;
			}
	private Log_in log_in;
	public Log_in getLog_in() {
		if (log_in==null) {
			log_in=new Log_in(driver);
		}
		return log_in;
	}
	private Filcard_ss filcard_ss;
	public Filcard_ss getFilcard_ss() {
		if(filcard_ss==null) {
			filcard_ss=new Filcard_ss(driver);
		}
		
		return filcard_ss;
	}
	
}
