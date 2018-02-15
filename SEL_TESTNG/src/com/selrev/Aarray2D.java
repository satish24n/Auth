package com.selrev;

public class Aarray2D {
	
	public static void main(String[] args) {
		
		int[][] a = {{5,2,9},{4,6,8}};
		System.out.println(a.length);
		
		for(int i =0; i<a.length; i++){
			 
			for(int j =0; j <a[i].length; j++){
				System.out.println("a["+i+"]["+j+"]: "+a[i][j]);
			}
			
			
		}//for 1st loop end
		
		Object[] any = {"satish", 24, "Ank", 16, true};
		
		for(Object i : any){
			System.out.println(i);
		}
		
		
		String s1 = "satish";
		String s2 = "satish";
		
		if(s1==s2){
			System.out.println("Comparion successful");
		}
		
		
		
		
	}//main ends

}
