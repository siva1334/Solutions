package com.practice;

import java.util.Scanner;

public class Problem41 {

	public static void  main(String[] args) {	
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print(" enter the no: ");
		int n = scan.nextInt();
		System.out.print(0 + " ");
		
		int number_1 = 0;
		int number_2 = 1;
		
		for ( int i = 1; i <= n+1; i++) {
			System.out.print(number_2 + " ");
			int temp = number_1;
			number_1 = number_2;
			number_2 += temp;
		}

		}
}
