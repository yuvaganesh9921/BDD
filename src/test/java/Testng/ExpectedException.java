package Testng;

import org.testng.annotations.Test;

public class ExpectedException {
@Test(expectedExceptions = Exception.class)
	public void div() {
	int a= 3;
	System.out.println(a/0);
}
}
