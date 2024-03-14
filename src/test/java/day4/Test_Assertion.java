package day4;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Test_Assertion {
	int a=10;
	int b=20;
	@Test
	void validations() {
		
		//normal java validation
	/*	if(a==b) {          
			System.out.println("test passed");
		}
		else {
			System.out.println("test not passed");
		}*/
		
		//hard assert validation
		//Assert.assertEquals(a, b);
		
		//soft assert validation
		SoftAssert sa=new SoftAssert();
		sa.assertEquals(a, b);
		sa.assertAll();

	
	
	}
}
