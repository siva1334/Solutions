package com.practice;

import java.util.Scanner;

public class Problem45 {
	
	public static void  main(String[] args) {	
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println(" enter the number: ");
		int n = scan.nextInt();
		
		int result = 0;
		while(n>0) {
		n/=10;
		++result;
		}
		
		System.out.println("number of digits = " + result);


		}


}
