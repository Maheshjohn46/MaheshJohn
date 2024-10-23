package TESTNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class SampleTest 
{
	@Test
	public void demo() {
		Reporter.log("hello World",false);
	}

}
