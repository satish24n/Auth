package com.selrev;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ArrayMissingNumber {
	
	public static void main(String[] args) {
		
		int[] a = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,18,19,20};
		int size = a.length;
		
		int sum =0; 
		for(int i=0; i<size ; i++){
			sum = sum+a[i];
		}
		
		int last  = a[size-1];
		int nsum = last*(last+1)/2;
		
		System.out.println("The missing number is: "+(nsum-sum));
		
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("");
		driver.navigate().back();
		driver.navigate().refresh();
		driver.navigate().refresh();
		
		String handle =driver.getWindowHandle();
		Set<String> handls = driver.getWindowHandles();
		
		Iterator<String> itr = handls.iterator();
		
		while(itr.hasNext()){
			driver.switchTo().window(itr.next());
		}
		
		
		
	}

}
