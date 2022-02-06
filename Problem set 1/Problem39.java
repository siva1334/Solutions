package com.practice;

import java.util.Scanner;

public class Problem39 {

public static void  main(String[] args) {	
		
		Scanner scan = new Scanner(System.in);
		
		long fac = 1;
		//factorial numbers will be very huge so long data type is used
		
		System.out.println(" enter the the no ");
		
		int n = scan.nextInt() ;
		
		for( int i = 2; i <= n; i++ ) 
			fac *= i;
		
		System.out.println(fac);
		
		

		}
}
