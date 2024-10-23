package CROSSBROWSEREXECUTION;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;

import com.beust.jcommander.Parameter;

public class BaseClass 
{
	WebDriver driver;
	@Parameters("BROWSER")
	@BeforeClass
	public void Classconf(String browser)
	{
		
	}
	

}
