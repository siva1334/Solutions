package com.practice;
import java.util.*;
public class Problem67 {

public static void  main(String[] args) {	
		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the values: ");
		int n = scan.nextInt();
		
		int arr[][] = new int[n][n];
		
		for(int i  = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				arr[i][j] = scan.nextInt();
			}
		}
		

		for(int i  = 0; i < n; i++) {
			for(int j = i; j < n; j++) {
				
				int temp = arr[i][j];
				arr[i][j] = arr[j][i];
				arr[j][i] = temp;				
		}
		}
		
		for(int i  = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println(" ");
		}
		
}
}
