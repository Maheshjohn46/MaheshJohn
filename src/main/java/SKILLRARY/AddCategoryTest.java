package SKILLRARY;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class AddCategoryTest extends BaseClass
{
	@Test
	public void CategoryTest()
	{
		driver.findElement(By.xpath("//span[text()='Courses']")).click();
		driver.findElement(By.xpath("//a[text()=' Category']")).click();
		driver.findElement(By.xpath("//a[text()='New']")).click();
		driver.findElement(By.id("name")).sendKeys("M@20");
		driver.findElement(By.name("add")).click();
		}

}
