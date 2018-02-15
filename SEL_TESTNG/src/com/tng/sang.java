package com.tng;

import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class sang {
	
	@BeforeMethod
	public void beforeMethod(){
		System.out.println("------------------- Class 2 - Before Method ..");
	}
	
	@Test
	public void cMethod(){
		System.out.println("Class 2 - Method CCCCCC..");
	}
	
	@Test
	public void dMethod(){
		System.out.println("Class 2 - Method DDDDD");
	}
	

	public void b4g(){
		System.out.println("Before Group");
	}
}
