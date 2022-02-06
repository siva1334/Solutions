package com.practice;

import java.util.Scanner;

public class Problem73 {
	
public static void  main(String[] args) {	
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("enter the number of rows ");
		
		int n = scan. nextInt();
		
		for(int i = n; i >= 1 ; i--) {
			
			// loop 1
			for(int m = i-1 ; m >= 1; m-- )
				System.out.print("  ");
			
			// loop 2
			for( int j = i; j <= n; j++)			
				System.out.print(j+" ");
			
			
			// loop 3			
			for( int k = n-1 ;k >= i; k--)	
			System.out.print( k + " ");
		
			// endline statement			
			System.out.println();
			
		}

}
}
