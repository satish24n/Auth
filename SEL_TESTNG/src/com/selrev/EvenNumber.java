package com.selrev;

public class EvenNumber {
	
	public static void main(String[] args) {
		
/*		for(int i=2; i<100; i++){
			
			if(i%2==0){
				System.out.println(i + " is Even.");
			}
			
		}*/
		
		int x =0;
		for(int i=1; i<=100; i++){
			x += i;
		}
		System.out.println("sum is: "+x);
		
		
		for(int i=1; i<=100; i++){
			
			if(i%5 == 0){
				System.out.println("Number is Divisible by 5");
				continue;
			}
			System.out.println(i);
			
		}
		
	}
	
	
}
