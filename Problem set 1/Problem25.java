package com.practice;

import java.util.Scanner;

public class Problem25 {
	
	public static void  main(String[] args) {	
		
		Scanner scanner = new Scanner(System.in);
		
		int x = 5;
		int x1 = ++x - x++ + -x; // equal to (6-6)+(-7).
		System.out.println(x1);
		System.out.println((6-6)+(-7));

		}

}
