
/*
Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
Notice that the solution set must not contain duplicate triplets.
  Example:
 Input: nums = [-1,0,1,2,-1,-4]
Output: [[-1,-1,2],[-1,0,1]]
*/


package com.day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Problem4 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("enter the size: ");
		int n = scan.nextInt();
		System.out.println("enter the values: ");
		
		int a[] = new int[n];
		
		for(int i = 0; i < n; i++) {
			a[i] = scan.nextInt();
		}
		
		Arrays.sort(a);
		
		int neg = 0;
		int pos = 0;
		int zeros = 0;
		for(int i = 0; i < n; i++) {
			if(a[i] < 0)neg++;
			else if(a[i] > 0)pos++;
			else zeros++;
		}
		
		ArrayList<Integer>negativeOne = new ArrayList<Integer>();
		ArrayList<Integer>positiveOne = new ArrayList<Integer>();
		
		int i = 0;
		for(; i <neg; i++) {
			
			if(a[i] != a[i + 1]) {
				negativeOne.add(a[i]);
			}
			
		}
		
		
		int j = 0;
		for(; a[j] < 0; j++) {
			
			if(a[j] != a[j + 1]) {
				positiveOne.add(a[j]);
			}
			else {
				positiveOne.add(a[j]);
				positiveOne.add(a[j]);
				int x = a[j];
				j += 2;
				while(a[j] == x && a[j] < 0) {
					j++;
				}			
			}			
		}
		
	
		for(j = 0; j < n; j++) {
			if(a[j] > 0)break;
		}
		
		for(; j < n; j++) {
			if(a[j] != a[j - 1]) {
				positiveOne.add(a[j]);
			}
		}

		
		


		i += zeros ;
for(; i < n - 1; i++) {
			
			if(a[i] != a[i + 1]) {
				negativeOne.add(a[i]);
			}
			else {
				negativeOne.add(a[i]);
				negativeOne.add(a[i]);
				int x = a[i];
				i += 2;
				while(i < n && a[i] == x) {
					i++;
				}
			}
			
		}

	if(a[n - 1] != a[n - 2]) {
		negativeOne.add(a[n - 1]);
	}
	
//	for(i = 0; i < negativeOne.size(); i++) {
//		System.out.print(negativeOne.get(i) + " ");
//	}
//	System.out.println();
//	for(i = 0; i < positiveOne.size(); i++) {
//		System.out.print(positiveOne.get(i) + " ");
//	}

	ArrayList<ArrayList<Integer>>ans = new ArrayList<ArrayList<Integer>>();
	
	int start = 0;
	int end = positiveOne.size() - 1;
	
	while(start < end ) {
		if(positiveOne.get(start + 1) > 0)break;
		if(positiveOne.get(end) < 0) break;
		
		int x = positiveOne.get(start) + positiveOne.get(start + 1); 
		x *= -1;
		if(x == positiveOne.get(end)) {
			ArrayList<Integer>temp = new ArrayList<Integer>();
			temp.add(positiveOne.get(start));
			temp.add(positiveOne.get(start + 1));
			temp.add(positiveOne.get(end));
			ans.add(temp);
			end--;
			start++;
		}
		
		else if(x > positiveOne.get(end))start++;
		else end--;
		
	}
	
	start = 0;
	end = negativeOne.size() - 1;
	
	while(start < end ) {
		if(negativeOne.get(start ) > 0)break;
		if(negativeOne.get(end - 1) < 0) break;
		
		int x = negativeOne.get(end) + negativeOne.get(end - 1); 
		int y = negativeOne.get(start);
		y *= -1;
		if(x == y) {
			ArrayList<Integer>temp = new ArrayList<Integer>();
			temp.add(negativeOne.get(start));
			temp.add(negativeOne.get(end - 1));
			temp.add(negativeOne.get(end));
			ans.add(temp);
			end--;
			start++;
		}
		
		else if(x > y)end--;
		else start++;
	
	}
	
	if(zeros > 0) {
		
		start = 0;
		end = positiveOne.size() - 1;
		
		while(negativeOne.get(start) < 0 && positiveOne.get(end) > 0) {
			
			int x = negativeOne.get(start);
			x *= -1;
			int y = positiveOne.get(end);
			
			if(x == y) {
				ArrayList<Integer>temp = new ArrayList<Integer>();
				temp.add(-x);
				temp.add(0);
				temp.add(y);
				ans.add(temp);
				end--;
				start++;
			}
			
			else if(x > y)start++;
			else end--;
		}
	}
	
	if(zeros > 2) {
		ArrayList<Integer>temp = new ArrayList<Integer>();
		temp.add(0);
		temp.add(0);
		temp.add(0);
		ans.add(temp);
	}
	
	for( i = 0; i < ans.size(); i++) {
		ArrayList<Integer>temp = ans.get(i);
		
		for( j = 0; j < temp.size(); j++) {
			System.out.print(temp.get(j) + " ");
		}
		
		System.out.println();
		
	}
					
	}

}
