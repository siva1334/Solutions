package com.practice;

import java.util.Scanner;

public class Problem48 {

public static void  main(String[] args) {	
		
		Scanner scan = new Scanner(System.in);
     
		System.out.println(" enter the number: ");
		
		int n = scan.nextInt();
		
		int x = n;
		
		int reverse = 0;
		
		 while(x > 0) {			 
			reverse = reverse * 10 + (x % 10);
			x /= 10;		
		}
		if(n == reverse )
		System.out.println(n + " is palindrome");
		
		else System.out.println(n + " is not palindrome");

		}
}
