/*
While the most typical type of dice have 6 sides, each of which shows a different integer 1 through 6,
there are many games that use other types. In particular, a dk is a die with k sides,
each of which shows a different integer 1 through k. A d6 is a typical die, a d4 has four sides, and a d1000000 has one million sides.

Dice from sample case 1

In this problem, we start with a collection of N dice. The i-th die is a dSi, 
that is, it has Si sides showing integers 1 through Si. A straight of length ℓ starting at
x is the list of integers x,x+1,…,x+(ℓ−1). We want to choose some of the dice (possibly all)
and pick one number from each to form a straight. What is the longest straight we can form in this way?

Input
The first line of the input gives the number of test cases, T. T test cases follow. Each
test case is described in two lines. The first line of a test case contains a single integer N, 
the number of dice in the game. The second line contains N integers S1,S2,…,SN, each representing the number of sides of a different die.

Output
For each test case, output one line containing Case #x: y, where x is the test case number (starting from 1)
and y is the maximum number of input dice that can be put in a straight.
*/

//package com.codejame;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {
	
static Scanner scan = new Scanner(System.in);


static int solve() {
	int n = scan.nextInt();
	
	int a[] = new int[n];
	for(int i = 0; i < n; i++) {
		a[i] = scan.nextInt();
	}
	
	Arrays.sort(a);
	
	int ans = 0;
	
	for(int i = 0; i < n; i++) {
		if(a[i] > ans)ans++;	
	}
	
	return ans;
}
	
public static void main(String[] args) {
		
		int i = 1;
		
		int t = scan.nextInt();
		
		while(t-- > 0) {
			System.out.println("case #" + i++ + ": " + solve() );
			
			
		}

	}
}
