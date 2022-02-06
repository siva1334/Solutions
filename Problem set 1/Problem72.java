package com.practice;

import java.util.Scanner;

public class Problem72 {
	
public static void  main(String[] args) {	
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("enter the number of rows ");
		
		int n = scan. nextInt();
		
		for(int i = 1; i <= n ; i++) {
			
			// loop 1
			for(int m = n-i; m >= 1; m-- )
				System.out.print("  ");
			
			// loop 2
			for( int j = 1; j <= i; j++)			
				System.out.print(j+" ");
			
			
			// loop 3			
			for( int k = i-1;k >= 1; k--)	
			System.out.print( k + " ");
			
			// endline statement			
			System.out.println();
			
		}
		
		
	}

}
