package com.practice;

import java.util.Scanner;

//program to multiply two matrix.

public class Problem66 {
	
	public static void  main(String[] args) {	
		
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the first matrix row: ");
		int fr = scan.nextInt();
		System.out.println("enter the first matrix colum: ");
		int fc = scan.nextInt();
		System.out.println("enter the first matrix row: ");
		int sr = scan.nextInt();
		System.out.println("enter the first matrix colum: ");
		int sc = scan.nextInt();
		
		int a[][] = new int [fr][fc];
		int b[][] = new int[sr][sc];
		
		System.out.println(" enter the first matrix: ");
		for(int i = 0; i < fr; ++i) {
			for(int j = 0; j < fc; ++j) {
				a[i][j] = scan.nextInt();
			}
		}
		System.out.println("enter the second matrix: ");
		for(int i = 0; i < sr; ++i) {
			for(int j = 0; j < sc; ++j) {
				b[i][j] = scan.nextInt();
			}
		}
			
		int res[][] = new int[fr][sc];
		if(fc != sr) {
			System.out.println("invalid matrix ");
		}
		else {
			for(int i = 0 ; i < fr   ; i++) {
				
				for(int j = 0 ; j < sc; j++ ) {
					
					int sum = 0;				
					
				for(int k = 0 ; k < fc; k++) {
					
					sum += (a[i][k] * b[k][j]);
				}				
				res [i][j] = sum;
				}
			}
			
			//printing matrix
			System.out.println("the multiplied matrix is: ");
			
			
			for(int i  = 0;i < res.length; i++) {
				
				for(int j = 0 ; j < res[0].length;j++) {
					
				System.out.print(res[i][j] + " ");
				
				}
				System.out.println();
			}
			
		}

		}
}
