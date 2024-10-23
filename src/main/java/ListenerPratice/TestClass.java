package ListenerPratice;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(ListenerPratice.ListenerImplementation.class)

public class TestClass extends BaseClass
{
	@Test(dependsOnMethods ="demo2")
	public void demo1() {
		System.out.println("@Mahesh");
	}
	
	@Test
	public void demo2() {
		System.out.println("@Mahesh");
		Assert.fail();
	}


}
