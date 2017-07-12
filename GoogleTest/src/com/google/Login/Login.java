package com.google.Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) {
		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("www.gmail.com");
		
		driver.findElement(By.xpath("//*[@id='identifierId']")).sendKeys("rhasan3860@gmail.com");

		driver.findElement(By.id("password")).sendKeys("hflkfkl");
		driver.findElement(By.xpath("//*[@id='passwordNext']/content/span"));
		System.out.println("Finally succeeded");
		

	}

}
