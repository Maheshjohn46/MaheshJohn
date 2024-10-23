package ASSERTIONS;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertionTest 
{
	@Test
	public void Demo() {
		String s1="Mahesh";
		String s2="mahesh";
		SoftAssert s=new SoftAssert();
				s.assertEquals(s1,s2);
				System.out.println(s1);
				System.out.println(s2);
				s.assertAll();
//				Assert.fail();
		
	}

}
