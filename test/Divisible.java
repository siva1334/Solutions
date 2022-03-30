package com.practice;

import java.util.Scanner;

public class Divisible {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the size of the array: ");
		int n = scan.nextInt();
		
		int a[] = new int[n];
		System.out.println("enter the k value: ");
		int k = scan.nextInt();
		System.out.println("enter the array values: ");
		for(int i = 0; i < n; i++) {
			a[i] = scan.nextInt();
		}
		
		int count = 0;
		for(int i = 0; i < n; i++) {
			for(int j = i + 1; j < n; j++) {
				
				if((a[i] + a[j]) % k == 0) {
					count++;
				}
			}
		}
		
		System.out.println( "total = " + count);

	}

}
