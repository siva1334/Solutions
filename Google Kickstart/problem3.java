//package com.kickstart;

import java.util.*;

public class Solution {
	
static Scanner scan = new Scanner(System.in);
static int solve2(int a[], int index, int val) {
	int count = 0;
	for(int i = 0; i <= index; i++) {
		if(a[i] > val)
			count++;
	}
	if(count > val)
		return val+1;
	else return val;
}
	static void solve() {
		int n = scan.nextInt();
		int a[] = new int[n];
		int val = 1;
		for(int i = 0; i < n; i++) {
			a[i] = scan.nextInt();
			val = solve2(a, i , val );
			System.out.print(val + " ");
		}
	}
public static void  main(String[] args) {	
	int t = scan.nextInt();
	int i = 1;
	while(t-- > 0) {
		System.out.print("Case #"+i+": ");
		solve();
		System.out.println();
		i++;
	}
}
}
