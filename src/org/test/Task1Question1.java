package org.test;

import org.openqa.selenium.WebDriver;

public class Task1Question1 {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.msedgedriver.driver", "C:\\Users\\Sabari\\eclipse-workspace\\lib\\driver2\\msedgedriver.exe");
		
		WebDriver driver=new msedgedriver();
		
        driver.get("https://www.greenstechnologys.com/");
		
		driver.get("https://www.gmail.com/");
		
		driver.get("https://www.flipkart.com/");
		
		driver.get("https://www.greenstech.in/selenium-course-content.html/");
		
	}

}
