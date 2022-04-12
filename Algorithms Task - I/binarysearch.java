package com.practice;

import java.util.Scanner;

public class BinarySearch {
	
	static int leftSearch(int a[] , int target) {
		
		int start = 0;
		int end = a.length - 1;
		
		
		while(start <= end) {
			
			int mid = (start + end)/2;
			
			if( (a[mid] == target && mid == 0) || (a[mid] == target && a[mid - 1] != target) ) {
				return mid;
			}
			
			else if(a[mid] < target) {
				start = mid + 1;
			}
			
			else {
				end = mid - 1;
			}
		}
		
		return -1;
				
	}
	
	static int rightSearch(int a[] , int target) {
		
		int start = 0;
		int end = a.length - 1;
		
		
		while(start <= end) {
			
			int mid = (start + end)/2;
			
			if( (a[mid] == target && mid == a.length - 1) || (a[mid] == target && a[mid + 1] != target) ) {
				return mid;
			}
			
			else if(a[mid] <= target) {
				start = mid + 1;
			}
			
			else {
				end = mid - 1;
			}
		}
		
		return -1;		
		
	}
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("enter the size of the array: ");
		int n = scan.nextInt();
		
		int a[] = new int[n];
		
		System.out.println("enter the values: ");
		for(int i = 0; i < n; i++) {
			a[i] = scan.nextInt();
		}
		
		System.out.println("enter the target : ");
		
		int target = scan.nextInt();
		
System.out.println("start position = " + leftSearch(a,target) );
System.out.println("end position = " + rightSearch(a,target) );
				
	}

}
