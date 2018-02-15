package com.selrev;

import java.util.Scanner;

public class PrintArrayReverse {
	
	public static void main(String[] args) {
		
		System.out.println("How many number you wanna enter? ");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		int[] ar = new int[num];
		
		System.out.println("Enter "+num+ " integers: ");
		for(int i=0; i<ar.length; i++){
			ar[i]= scan.nextInt();
		}
		
		System.out.print("Original numbers you entered is: ");
		for(int i=0; i<ar.length; i++){
			System.out.print(ar[i]+" ");
		}
		System.out.println();
		
		for(int i=(ar.length-1);i>=0; i--){
			System.out.print(ar[i]+" ");
		}
			
	}
	
}
