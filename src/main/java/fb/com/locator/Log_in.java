package fb.com.locator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import fb.com.Baseclass.Base_Class_Ipt2;

public class Log_in extends Base_Class_Ipt2{
	public Log_in(WebDriver xdriver) {
		this.driver=xdriver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "email")
	private WebElement Username;

	public WebElement getUsername() {
		return Username;
	}
	@FindBy(id="pass")
	private WebElement password;

	public WebElement getPassword() {
		return password;
	}
	@FindBy(xpath = "//button[text()='Log in']")
	private WebElement login;

	public WebElement getLogin() {
		return login;
	}
	
	@FindBy(name="username")
	public WebElement log_In;
	@FindBy(id="password")
	public WebElement Password;
	@FindBy(id="login")
	public WebElement log;
	@FindBy(css ="[class=\"auth_error\"]")
	public WebElement error_message;
		
	


}
