package com.practice;

import java.util.Scanner;

public class Problem40 {
	
	public static void  main(String[] args) {	
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("enter the no: ");
		int n = scan.nextInt();
		
		for ( int i = 1; i <= 10 ; i++)
			System.out.println(n + " * " + i + " = " + (n * i));

		}

}
