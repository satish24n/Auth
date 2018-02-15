package com.selrev;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowsHandle {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.navigate().to("https://www.ndtv.com/");
		
		driver.findElement(By.xpath("//span[contains(text(),'New Gmail widget can help you find anyone’s email address.')]")).click();
		
		String handl = driver.getWindowHandle();
		System.out.println(handl);
		Thread.sleep(3000);
		
//		driver.switchTo().window(handl);
//		driver.findElement(By.xpath("//span[contains(text(), 'Install for Gmail')]")).click();
		
//		boolean hai = driver.getPageSource().equalsIgnoreCase("           Find any email in under five seconds         ");
		boolean hai = driver.getPageSource().contains("Find any email in under five seconds");
		
		if(hai){
			System.out.println("This is the correct Page!");
		}
		else{
			System.out.println("Text not present!");
		}
		
		System.out.println("Execution completed!!!");
		
	}
	
	
	
}
