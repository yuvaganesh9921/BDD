package fb.com.locator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import fb.com.Baseclass.Base_Class_Ipt2;

public class Filcard_ss extends Base_Class_Ipt2 {
  public Filcard_ss(WebDriver xdriver) {
	  this.driver=xdriver;
	  PageFactory.initElements(driver, this);
  }
  
  @FindBy(xpath="//button[@class='_2KpZ6l _2doB4z']")
  public WebElement cancelbutton;
  
  @FindBy(xpath = "(//div[@class='xtXmba'])[2]")
  public WebElement mobile;
  @FindBy(xpath="(//div[contains(@class,'dwRsDN')]//ancestor::div//span[@class='_2I9KP_'])[1]")
  public WebElement electronics;
  @FindBy(xpath = "//a[@title='Mobiles']")
  public WebElement mob;
  @FindBy(xpath = "//a[@title='Mi']")
  public WebElement mi;
  @FindBy(xpath = "(//select[@class='_2YxCDZ'])[2]")
  public WebElement dropdown;
  @FindBy(css = "[type=\"text\"]")
  public WebElement search;
  @FindBy(xpath = "(//div[@class='_4ddWXP'])[1]")
  public WebElement product;
  @FindBy(xpath="//a[contains(@title,'REDMI')]")
  public String handle;
  @FindBy(css = "[placeholder=\"Enter Delivery Pincode\"]")
  public WebElement pincode;
  @FindBy(xpath = "//span[@class='YxlyDn']")
  public WebElement viewdetails;
 @FindBy(xpath="(//div[contains(@class,'row')])[1]//ancestor::div[@class='_2_e-g9']//button[text()='✕']")
  public WebElement cancel;
 @FindBy(xpath="//button[text()='Add to cart']")
 public WebElement addtocard;
  @FindBy(xpath = "//div[@class='_25b18c']")
  public WebElement compare;
}
