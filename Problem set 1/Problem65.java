package com.practice;

import java.util.Scanner;

public class Problem65 {
	
	public static void  main(String[] args) {	
		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the values: ");
		int n = scan.nextInt();		
		int arr1[][] = new int[n][n];
		int arr2[][] = new int[n][n];
		for(int i  = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				arr1[i][j] = scan.nextInt();
			}
		}
		
		for(int i  = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				arr2[i][j] = scan.nextInt();
			}
		}
		
		for(int i  = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				arr1[i][j] = arr1[i][j] + arr2[i][j];
			}
		}
		
		for(int i  = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				System.out.print(arr1[i][j] + " ");
			}
			System.out.println(" ");
		}
		



		}

}
