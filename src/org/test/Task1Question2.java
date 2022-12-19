package org.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1Question2 {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sabari\\eclipse-workspace\\lib\\driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.greenstechnologys.com/");
		
		driver.get("https://www.gmail.com/");
		
		driver.get("https://www.flipkart.com/");
		
		driver.get("https://www.greenstech.in/selenium-course-content.html");
		
		
		
		
	}

}
