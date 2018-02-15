package com.selrev;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Auth3_autoit {
	
	public static void main(String[] args) throws InterruptedException {
		String baseURL = "http://aspire.infogain.com/trainingportal/app_pages/TrainingCalender.aspx";
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		driver.get(baseURL);
//		driver.manage().window().maximize();
		Thread.sleep(3000);
		Alert al = driver.switchTo().alert();
		
		try{
			Runtime.getRuntime().exec("C:/Users/bluestar/Desktop/autoITscript/basicauth.exe");
			
		}catch(Exception e){
			System.out.println("something went haywire!!");
			e.printStackTrace();
		}
		
		Thread.sleep(2000);
		al.accept();
		
	}

}
