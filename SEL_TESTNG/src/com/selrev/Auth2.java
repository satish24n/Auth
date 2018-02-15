package com.selrev;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.io.InputStream;
import java.util.concurrent.TimeUnit;

import javax.print.DocFlavor.INPUT_STREAM;

import org.apache.http.auth.Credentials;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Auth2 {
	
	public static void main(String[] args) throws AWTException, InterruptedException {
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String baseURL = "http://aspire.infogain.com/trainingportal/app_pages/TrainingCalender.aspx";
		driver.get(baseURL);
		
		Alert a = driver.switchTo().alert();
		a.sendKeys("sat");
		a.sendKeys("{TAB}");
		
		
		
		
/*		Credentials cred = new UsernamePasswordCredentials("sat", "pw");
		Alert a = driver.switchTo().alert();
		
		a.sendKeys(cred);*/
		
//		Actions act = new Actions(driver);
//		act.sendKeys(Keys.TAB);
//		Alert alert = driver.switchTo().alert();

		
		
/*		alert.sendKeys("satish.k");
		Thread.sleep(2000);
		alert.sendKeys(KeyEvent.VK_TAB);
		alert.sendKeys("Pass");*/
		Robot robot = new Robot();
		
/*		
		Robot robot = new Robot();
		
		Alert alrt = driver.switchTo().alert();
		alrt.sendKeys("satish.k");
		Thread.sleep(3000);
		robot.keyPress(9);
		robot.keyRelease(9);
		Thread.sleep(3000);
		alrt.sendKeys("Pass");*/
		
/*		
		Alert ba = driver.switchTo().alert();
		ba.sendKeys("Passss");*/
		
/*		Robot rob = new Robot();
		rob.keyPress(KeyEvent.VK_ENTER);*/
//		Thread.sleep(4000);
		
//		Alert bb = driver.switchTo().alert();
//		bb.sendKeys("dfdsfdfdsfasf");
//		rob.keyPress(KeyEvent.VK_ENTER);
//		Thread.sleep(5000);
//		
		System.out.println("Execution completed!!");
		
	}

}
