package com.selrev;

import java.util.Scanner;

public class ArrayGreatestNumber {
	
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
		//-----------------------------
		
		int tem = ar[0];
		for(int i=1; i<ar.length; i++){
			
			if(ar[i]<tem){
				tem = ar[i];
			}
			
		}
		System.out.println("The greatest number is: "+tem);
		
		
		
		
	}

}
