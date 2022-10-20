package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AadharAdminTest {
	static WebDriver driver = null;

	@Test
	public void ChromeBrowser() {
		System.setProperty("webdriver.chrome.driver","D:/chrome driver/chromedriver_win32/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println("Chrome Browser is Opened!!");
		
	}
	
	@Test
	public void TestHome() {
		driver.get("http://localhost:4200/home");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//a[@routerlink='/adminlogin']")).click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.get("http://localhost:4200/adminlogin");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.id("admin")).sendKeys("admin1");
		driver.findElement(By.id("password")).sendKeys("Admin10$");
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
		

	}



}


