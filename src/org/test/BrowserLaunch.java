package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch {
	


	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sabari\\eclipse-workspace\\lib\\driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement TxtUser = driver.findElement(By.id("email"));
		
	TxtUser.sendKeys("Ram");
	WebElement TxtPass = driver.findElement(By.id("pass"));
	
	TxtPass.sendKeys("12344");
	WebElement btnLogin = driver.findElement(org.openqa.selenium.By.xpath("//button[@value='1']"));
	
	btnLogin.click();
	}
	


}
