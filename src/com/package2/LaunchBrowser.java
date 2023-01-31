package com.package2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:/Drivers/chromedriver.exe");
		 WebDriver driver = new ChromeDriver();

	      driver.get("https://www.rediff.com");
	      driver.manage().window().maximize();
	      Thread.sleep(2000);
	      System.out.println(driver.getTitle());
	          }

	}


