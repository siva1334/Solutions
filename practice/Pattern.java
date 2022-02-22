/*
n
        a
        r
        e
n a r e n d r a n 
        d
        r
        a
        n

*/

package com.practice;

import java.util.Scanner;

public class Pattern {
public static void  main(String[] args) {	
		
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		int n = s.length();
		int mid = n / 2;
		for(int i = 0; i < n; i++) {
			
			if(i != mid ) {
			for(int j = 0; j < mid; j++)
				System.out.print("  ");
			System.out.println(s.charAt(i));
			}
			
			else {
				for(int j = 0; j < n; j++)
				System.out.print(s.charAt(j) + " ");
				System.out.println();
			}
		}
}
}
