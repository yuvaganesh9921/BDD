package fb.com.Stepdefination;

import Pageobjectmanager.pageobjectmanager;
import fb.com.Baseclass.Base_Class_Ipt2;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class step_class extends Base_Class_Ipt2{
	pageobjectmanager obj = new pageobjectmanager(driver);

	@Given("User lanuch browser")
	public void user_lanuch_browser() {
		browser_Launch();
	   
	}
	@Given("User navigate url")
	public void user_navigate_url() {
		get("https://www.flipkart.com/");
	   
	}
	@Given("User cancel popup button")
	public void user_cancel_popup_button() {
		select(obj.getFilcard_ss().cancelbutton);
	   
	}
	@Given("User click mobile section")
	public void user_click_mobile_section() {
	   select(obj.getFilcard_ss().mobile);
	   
	}
	@Given("User navigate to electronics mi phone")
	public void user_navigate_to_electronics_mi_phone() throws InterruptedException {
		ThreadSleepForSecond(3);
		select(obj.getFilcard_ss().electronics);
		ThreadSleepForSecond(3);
		movetoElement(obj.getFilcard_ss().mob);
		select(obj.getFilcard_ss().mi);
	   
	}
	@Then("User select minnium product using dropdown")
	public void user_select_minnium_product_using_dropdown() throws InterruptedException {
		SelectDropdown(obj.getFilcard_ss().dropdown, "text", "₹10000");
		
	   
	}
	@Then("User search product")
	public void user_search_product() {
		elementSendKeys(obj.getFilcard_ss().search,"Mi\n");
	   
	}
	@Then("User click first product")
	public void user_click_first_product() {
	   select(obj.getFilcard_ss().product);
	   
	}
	@Then("User uses window handeler")
	public void user_uses_window_handeler() {
		Window_Handle(obj.getFilcard_ss().handle);
	   
	}
	@Then("User product compare to zero")
	public void user_product_compare_to_zero() {
	   
	   
	}
	@Then("User enter pincode")
	public void user_enter_pincode() {
	   elementSendKeys(obj.getFilcard_ss().pincode, "632007\n");
	   
	}
	@Then("User view deatils")
	public void user_view_deatils() throws Throwable {
		ThreadSleepForSecond(3);
		 select(obj.getFilcard_ss().viewdetails);
		 ThreadSleepForSecond(3);
		 select(obj.getFilcard_ss().cancel);
	   
	}
	@Then("User Add to card")
	public void user_add_to_card() {
	   select(obj.getFilcard_ss().addtocard);
	   
	}
	@Then("user close broswer")
	public void user_close_broswer() throws InterruptedException {
		ThreadSleepForSecond(3);
		
	   
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
