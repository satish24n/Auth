package com.tng;

public class ArrayShravan {
	
	public static void main(String[] args) {
		
		int[] aro = {0,1,2,3,4,5,6,7,8}; 
		int[] ra = new int[aro.length];
		
		for(int i=1; i<aro.length; i++){
			ra[i-1] = aro[i];
			if(i==(aro.length-1)){
				ra[i] = 0;
			}
		}
		
		for(int i=0; i<ra.length; i++){
			System.out.println("Value at ["+ i + "] = "+ ra[i]);
		}
		
	}

}
