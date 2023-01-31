package com.package2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class projectClass2 {
	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "C:/Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
	    driver.manage().window().maximize();
	    Thread.sleep(2000);
	    System.out.println(driver.getTitle());
	}

}
