package ASSERTIONS;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertionTest {
@Test
public void demo() {
	String s1="Mahesh";
	String s2="mahesh";
	Assert.assertEquals(s1,s2);
	System.out.println(s1);
	System.out.println(s2);
}
}
