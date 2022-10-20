package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AadharUserTest {
	static WebDriver driver = null;

	@Test
	public void ChromeBrowser() {
		System.setProperty("webdriver.chrome.driver","D://chrome driver//chromedriver_win32//chromedriver.exe//");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println("Chrome Browser is Opened!!");
		
	}
	
	
	@Test
	public void UserCheck() {
		driver.get("http://localhost:4200/home");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//a[@routerlink='/userlogin']")).click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.get("http://localhost:4200/userlogin");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.id("peopleId")).sendKeys("101");
		driver.findElement(By.id("password")).sendKeys(" 8967856789");
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		
	}
	

}


