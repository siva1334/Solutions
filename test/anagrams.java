package com.practice;

import java.util.Scanner;

public class Anagram {
	static boolean isEqual(int a[] , int b[]) {
		
		for(int i = 0; i < 26; i++) {
			if(a[i] != b[i]) {
				return false;
			}
					}
		
		return true;
	}
	
	static boolean solve(String wordOne , String wordTwo) {
		
		int n1 = wordOne.length();
		int n2 = wordTwo.length();
		
		if(n1 != n2)return false;
		
		int a[] = new int[26];
		
		int b[] = new int[26];
		
		for(int i = 0; i < n1; i++) {
			a[wordOne.charAt(i) - 'a']++;
		}
		
		for(int i = 0; i < n2; i++) {
			b[wordTwo.charAt(i) - 'a']++;
		}
		
		if(isEqual(a, b)) {
			return true;
		}
		
		else return false;
	}

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("enter the first string: ");
		String wordOne = scan.next();
		
		System.out.println("enter the second string: ");
		String wordTwo = scan.next();
		
		System.out.println(solve(wordOne , wordTwo));
		
		
		
		

	}

}
