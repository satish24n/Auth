package com.selrev;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Tooltip {
	
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://omayo.blogspot.in/");
		
//		String tooltip = driver.findElement(By.partialLinkText("www.selenium-by-arun.blogspot.com")).getAttribute("title");
//		String tooltip = driver.findElement(By.xpath("//p[contians(text(), 'www.selenium-by-arun.blogspot.com')]")).getAttribute("title");
		String tooltip = driver.findElement(By.xpath("//p[text()='www.selenium-by-arun.blogspot.com']")).getAttribute("title");
		System.out.println("Tooltip value: "+tooltip);
		
	}
	

}
