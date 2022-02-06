package com.practice;

import java.util.Scanner;

public class Problem52 {
	
	public static void  main(String[] args) {	
		
		Scanner scan = new Scanner(System.in);
		System.out.println(" enter the number: ");
		int n = scan.nextInt();
		
		for(int i = 1; i <= n/2; ++i)
			if(n % i == 0)
			System.out.print(i + " ");
			
		System.out.print(n);
		


		}

}
