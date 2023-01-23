package Testng;

import org.testng.annotations.Test;

public class dependancy {
  @Test
	private void broswer_lanuch(){
	System.out.println("broswerlanuch");
}
  @Test(dependsOnMethods = "broswer_lanuch")
  private void geturl() {
	  System.out.println("url link");
  }
  @Test(dependsOnMethods = "geturl")
  private void username() {
	System.out.println("username");

}
  @Test(dependsOnMethods = "username")
  private void password() {
	System.out.println("password");

}
 @Test(dependsOnMethods = "password")
 private void click() {
	 System.out.println("click");
 }
  
}
