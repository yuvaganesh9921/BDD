package fb.com.Stepdefination;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Pageobjectmanager.pageobjectmanager;
import fb.com.Baseclass.Base_Class_Ipt2;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Normal_Class extends Base_Class_Ipt2{
	pageobjectmanager obj = new pageobjectmanager(driver);

	@Given("user Launch Browser")
	public void user_launch_browser() {
		browser_Launch();
	}
	@Given("User naviagte Url {string}")
	public void user_naviagte_url(String string) {
	  get(string);
	}
	@When("User Verify page {int} and on login page")
	public void user_verify_page_and_on_login_page(Integer int1) {
		 isdisplay(driver.findElement(By.cssSelector("[alt='Facebook']")));
	}
	
	@When("User Enter vaild Username")
	public void user_enter_vaild_username() {
	  // elementSendKeys(driver.findElement(By.id("email")), "yuva");
	   elementSendKeys(obj.getLog_in().getUsername(), "yuva");
	}
	@When("User Enter Vaild Password")
	public void user_enter_vaild_password() {
	    //elementSendKeys(driver.findElement(By.id("pass")),"amma");
		elementSendKeys(obj.getLog_in().getPassword(), "amma");
	}
	@Then("Click LoginButton")
	public void click_login_button() {
		//select(driver.findElement(By.xpath("//button[@value='1']")));
		select(obj.getLog_in().getLogin());
	}
	@Then("User Verify Loged in Sucessfull")
	public void user_verify_loged_in_sucessfull() {
	    
	}	
	@Given("use Lanuch Browser")
	public void use_lanuch_browser() {
		browser_Launch();
	}
	@Given("User navigate Url")
	public void user_navigate_url() {
	    driver.get("https://adactinhotelapp.com/");
	}
	@Given("user Enter Name {string}")
	public void user_enter_name(String string) {
		elementSendKeys(obj.getLog_in().log_In, string);
	}
	@Given("user Enter Password {string}")
	public void user_enter_password(String string) {
		elementSendKeys(obj.getLog_in().Password, string);
	}
	@Given("user logbutton")
	public void user_logbutton() {
	    select(obj.getLog_in().log);
	}
	@Given("Error Message {string}")
	public void error_message(String string) {
		Assert.assertEquals(string,obj.getLog_in().error_message.getText());
	}

	
	
	


	
}
