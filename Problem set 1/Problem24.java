package com.practice;

import java.util.Scanner;

public class Problem24 {
	
	public static void  main(String[] args) {	
		
		Scanner scanner = new Scanner(System.in);
		
		int y = 10;
		int z = (++y *(y++ + 5));//it is z=11*(11+5).
		
		System.out.println(z);
		
		System.out.println(11*(11+5));

		}

}
