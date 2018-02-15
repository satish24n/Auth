package com.selrev;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrokenLink {
	
	public static void main(String[] args) throws MalformedURLException {
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.qamantra.com/");
		
		List<WebElement> linqs = driver.findElements(By.tagName("a"));
		
		System.out.println("No of links= "+linqs.size());
		
		for(int i =0; i < linqs.size(); i++){
			
			WebElement linqElement = linqs.get(i);
			
			//By using "href" attribute, we could get the url of the //requried Link
			String urlt = linqElement.getAttribute("href");
//			System.out.println(urlt);
			verifyUrl(urlt);
			
		}
		
		driver.quit();
	}
	
	//method verifyUrlf or verifying connection:
	public static void verifyUrl(String urlt) throws MalformedURLException{
		
		URL link = new URL(urlt);
		
		try {
			HttpURLConnection httpcon = (HttpURLConnection) link.openConnection();
			
			//set HTTP connection time out...
			httpcon.setConnectTimeout(3000);
			//connect using connect method
			httpcon.connect();
			
			//use getResponse() method to get the response code...
			if(httpcon.getResponseCode() == 200){
				System.out.println(urlt +" - "+ httpcon.getResponseMessage());
				System.out.println(httpcon.getResponseMessage());
			}
			else{
				System.out.println(urlt +" - "+ httpcon.getResponseMessage());
				System.out.println(httpcon.getResponseMessage());
			}

			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	

}
