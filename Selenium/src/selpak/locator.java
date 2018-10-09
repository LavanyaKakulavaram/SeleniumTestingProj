package selpak;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class locator {
	public static void main(String[]args)
	{
	
		WebDriver driver= new FirefoxDriver();
		 driver.get("http://facebook.com");
		system.out.println("Facebook brower is selected");
		 driver.findElement(By.xpath("//input[@id='email']")).sendKeys("lavanya2055@gmail.com");
		 driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("chittitalli");
		 driver.findElement(By.xpath("//input[@id='u_0_n']")).click();
	}

}
