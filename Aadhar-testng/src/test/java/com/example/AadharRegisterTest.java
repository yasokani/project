package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AadharRegisterTest {
	static WebDriver driver = null;

	@Test
	public void ChromeBrowser() {
		System.setProperty("webdriver.chrome.driver","D:/chrome driver/chromedriver_win32/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println("Chrome Browser is Opened!!");
		
	}
	
	@Test
	public void TestRegister() {
		driver.get("http://localhost:4200/home");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//a[@routerlink='/register']")).click();
		//driver.get("http://localhost:4200/register");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.id("name")).sendKeys("suve");
		driver.findElement(By.id("dob")).sendKeys("2000-3-30");
		driver.findElement(By.id("emailid")).sendKeys("suve@gmail.com");
		driver.findElement(By.id("address")).sendKeys("Radha nagar,Chennai");
		driver.findElement(By.id("mobileno")).sendKeys("9675678909");
		driver.findElement(By.id("gender")).sendKeys("female");
	}



}
