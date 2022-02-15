//package com.kickstart;
/*
Jorge is a physicist who has published many research papers and wants to know how much impact they have had in the academic community.
To measure impact, he has developed a metric, H-index, to score each of his papers based on the number of times it has been cited by other papers.
Specifically, the H-index score of a researcher is the largest integer H such that the researcher has H papers with at least H citations each.

Jorge has written N papers in his lifetime.
The i-th paper has Ci citations. Each paper was written sequentially in the order provided, 
and the number of citations that each paper has will never change. Please help Jorge determine his H-index score after each paper he wrote.

Input
The first line of the input gives the number of test cases, T. 
T test cases follow. Each test case begins with a line containing N, the number of papers Jorge wrote.
The second line contains N integers. The i-th integer is Ci, the number of citations that the i-th paper has.

Output
For each test case, output one line containing Case #x: y, where x is the test case number (starting from 1) 
and y is a space-separated list of N integers. The i-th integer is Jorge's H-index score after writing his i-th paper.

Limits
Time limit: 50 seconds.
Memory limit: 1 GB.
1≤T≤100
1≤Ci≤105
Test Set 1
1≤N≤1000
Test Set 2
1≤N≤105.

Sample
Sample Input
save_alt
content_copy
2
3
5 1 2
6
1 3 3 2 2 15
Sample Output
save_alt
content_copy
Case #1: 1 1 2
Case #2: 1 1 2 2 2 3
*/

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
