package GROUPEXECUTION;

import org.testng.annotations.Test;

public class Test2 
{
	@Test(groups="smoke")
	public void demo1()
	{
		System.out.println("Test2-demo1-smoke");
	}
	
	@Test(groups="sanity")
	public void demo2()
	{
		System.out.println("Test2-demo2-sanity");
	}
	@Test(groups={"smoke","sanity"})
	public void demo3()
	{
		System.out.println("Test2-demo3-smoke and sanity");
	}

}
