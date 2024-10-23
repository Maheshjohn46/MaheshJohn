package TESTNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderBookTickate 
{
	@Test(dataProvider = "Mahesh")
	public void Book(String from,String to)
	
	{
		System.out.println(" from: "+"\tTo:"+to);
	}
	@DataProvider
	
	 public Object[][] Mahesh()   //data
	{
	 Object[][] obj=new Object[3][2];
	
	 obj[0][0]="HYD";
	 obj[0][1]="KNL";
	 
	 obj[1][0]="HYD";
	 obj[1][1]="KNG";
	 
	 obj[2][0]="HYD";
	 obj[2][1]="DHN";
	 return obj;
	}
}
