package conceptOfdataprovider;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ConceptOfDataProvider
{
	@Test
	public void login()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\automation testing\\Drivers\\chromedriver.exe");
		
		ChromeDriver dr =new ChromeDriver();
		dr.manage().window().maximize();
		
		dr.get("http://www.newtours.demoaut.com/");
		
		dr.findElement(By.xpath("//input[@name='userName']")).sendKeys("poojachavan@gmail.com");
		dr.findElement(By.xpath("//input[@name='password']")).sendKeys("Pooja@123");
		dr.findElement(By.xpath("//input[@name='login']")).click();
		
       int count =dr.findElements(By.xpath("//b[contains(text(),'Passengers')]")).size();
       
       Assert.assertEquals(count, 1);
       
		
		
	}
		

}
