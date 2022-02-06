package com.practice;

import java.util.Scanner;

public class Problem46 {
	
	public static void  main(String[] args) {	
		
		Scanner scan = new Scanner(System.in);
     
		System.out.println(" enter the number: ");
		
		int n = scan.nextInt();
		
		int reverse = 0;
		
		 while(n > 0) {			 
			reverse = reverse * 10 + (n % 10);
			n /= 10;		
		}
		
		System.out.println(" Reversed number = " + reverse);

		}


}
