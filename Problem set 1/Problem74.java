package com.practice;

import java.util.Scanner;

public class Problem74 {
	
public static void  main(String[] args) {	
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("enter the number of rows ");
		
		int n = scan. nextInt();
		
		for(int i = n; i >= 1 ; i--) {
			
			// loop 1
			for(int m = n-i; m >= 1; m-- )
				System.out.print(" ");
			
			// loop 2
			for( int j = 1; j <= i; j++)			
				System.out.print("* ");
			
			// endline statement			
			System.out.println();
			
		}
		
}

}
