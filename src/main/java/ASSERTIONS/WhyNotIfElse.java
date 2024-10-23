package ASSERTIONS;

import org.testng.annotations.Test;

public class WhyNotIfElse 
{
	@Test
	public void Demo() {
		String s1="Mahesh";
		String s2="mahesh";
		if (s1.equals(s2)) 
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
			
	}

}
