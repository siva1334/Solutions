package com.practice;

import java.util.Scanner;

public class Problem27 {
	
	public static void  main(String[] args) {	
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("enter the year ");
		
		int year = scan.nextInt();
		
		if(year%400==0) // if it is multiple of 400 it is leap
			System.out.println("it is leaf year");
		 
		else if(year%4==0 && year%100!=0 )
			System.out.println("it is a leaf year");
		
		else System.out.println("it is not a leaf year");
			
			
		

		}

}
