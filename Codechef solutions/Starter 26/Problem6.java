/* package codechef; // don't place package name! */

/*
Chef has a sequence of integers A of length N. He creates another sequence B of length 2⋅N using sequence A. Initially, B is empty. Chef performs the following process.

For each element Ai (1≤i≤N) of A:

Choose any arbitrary integer k (Note that the value of k can be different for different elements).
Add Ai−k and Ai+k to B.
Chef then shuffles the sequence B randomly after this process.

Since Chef is careless, he lost both A and B and now only vaguely remembers the elements of B. 
Chef would like to know if the sequence B (which he vaguely remembers) can be correct or not. Can you help him?

Formally, you are provided with a sequence B of size 2⋅N. 
You are required to tell if the provided sequence can be achieved from any sequence A of size N using the given process or not.

Input Format
The first line of the input contains a single integer T - the number of test cases. The description of T test cases follows.
The first line of each test case contains a single integer N.
The second line of each test case contains 2⋅N space-separated integers B1,B2,…,B2⋅N.
*/

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    static Scanner scan = new Scanner(System.in);
    
    static void solve(){
        int n = scan.nextInt();
        n*=2;
        int a[] = new int [n];
        int odds = 0;
        int evens = 0;
        for(int i = 0; i < n ; i++){
            a[i] = scan.nextInt();
            if(Math.abs(a[i]) % 2 == 0)
            evens++;
            else odds++;
        }
        
        if(odds%2 == 0 && evens %2 == 0)
        System.out.println("YES");
        else System.out.println("NO");
        
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes 
		int t = scan.nextInt();
		while(t-- > 0){
		    solve();
		}
	}
}
