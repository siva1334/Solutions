package com.practice;

import java.util.Scanner;

public class Problem21 {
	
	
		
		public static void  main(String[] args) {	
			
		Scanner scanner = new Scanner(System.in);
		
		int a = 10;
		int b = 10;
		int c = 0;
		
       c =	++a-b--;//it is (a+1)-(b); 
       
       System.out.println(c);

       c = a % b ++;//b value used first then increment operation performed.
		
		System.out.println(c);

        a*=b+5;    //is is equal to a=a*(b+5).
		
		System.out.println(a);

		int x = 69>>>2; // we do the right shift operation with zero fill
		System.out.println(x);
		}

}
