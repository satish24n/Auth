package com.tng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Tang {
	
	@BeforeTest
	public void b4test(){
		System.out.println("Before Test!!!");
	}
	@BeforeMethod
	public void beforeMethod(){
		System.out.println("Method Before..");
	}
	@BeforeClass
	public void b4class(){
		System.out.println("-----  Before Class method");
	}
	
	@Test
	public void Aone(){
		System.out.println("AONE method");
	}
	
	@Test
	public void Bone(){
		System.out.println("BBBB method");
	}
	
	@Test
	public void Cone(){
		System.out.println("CCCC method");
	}
	
	@AfterTest
	public void aftrtest(){
		System.out.println("After Test - Class 1");
		
	}
	@AfterClass
	public void afterClassm(){
		System.out.println("*************   After Class");
	}
	
	

}
