package com.practice;

import java.util.Scanner;

public class Problem18 {

	
		
		public static void  main(String[] args) {	
			
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("enter three values ");
		
		int x = scan.nextInt();
		
		int y = scan.nextInt();
		
		int z = scan.nextInt();
		
		int max = (x>y)?(x>z)?x:z:y>z?y:z; 
		
		System.out.println("maximum no is " + max);

		}
}
