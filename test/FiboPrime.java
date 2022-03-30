
package com.practice;

import java.util.*;
public class FiboPrime {
	
	static boolean isPrime(long x) {
		
		for(int i = 2; i <= x/2; i++) {
			if(x % i == 0)return false;		
		}
		
		return true;
	}

	public static void main(String[] args) {
		
		long a[] = new long[10];
		long first = 1; 
		long second = 1;
		
		int i = 0;
		while(i < 10) {
			long temp = second;
			second = first + second;
			first = temp;
			
			if(isPrime(second)) {
				a[i++] = second;
			}
		}
		
		for(int j = 0; j < 10; j++) {
			System.out.print(a[j] + " ");
		}
		
		
	}

}
