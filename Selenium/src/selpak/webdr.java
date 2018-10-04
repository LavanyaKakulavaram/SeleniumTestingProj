package selpak;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class webdr {
	public static void main(String[]args)
	{
		 WebDriver driver= new FirefoxDriver();
		 driver.get("http://facebook.com");
		 System.out.println(driver.getTitle());
		 System.out.println(driver.getClass());
		 System.out.println(driver.getCurrentUrl());
		 driver.close();
	}


}
