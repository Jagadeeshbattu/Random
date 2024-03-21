package com.po;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Launching {

	@Test
	void main() throws InterruptedException {
		WebDriver driver;

		WebDriverManager.chromedriver().setup();
		// chrome driver
		driver = new ChromeDriver();
		// launchig ecommerce website
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(6000);
		// to maximize window
        driver.manage().window().maximize();
		driver.findElement(By.name("username")).sendKeys("Admin");

		//Thread.sleep(6000);

		driver.findElement(By.name("password")).sendKeys("admin123");

		//Thread.sleep(6000);

		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		Thread.sleep(3000);
		//clicking on Leave
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[3]/a")).click();
		Thread.sleep(3000);
		//clicking on Time
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[4]/a")).click();		driver.close();
		Thread.sleep(3000);
		//clicking on Recuritment	
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[5]/a/span")).click();
		Thread.sleep(3000);
		//clicking on my info
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[5]/a/span")).click();
		Thread.sleep(3000);
	}
}
