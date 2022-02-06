package com.practice;

import java.util.Scanner;

public class Problem29 {

	public static void  main(String[] args) {	
		
		Scanner scan = new Scanner(System.in);

		int a , b ;
		System.out.println("enter the two values ");
		a = scan.nextInt();
		b = scan.nextInt();

		System.out.println("Quotient is "+ (a/b));
		System.out.println("Remainder is " + (a%b));

		}
}
