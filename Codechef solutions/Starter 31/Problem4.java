/*
Chef was recently studying the Bitwise OR operation, and stumbled upon the following problem:

Let F(i)=1 | 2 | 3 | … | i, where | denotes bitwise OR.

You are given an integer N. Find the number of distinct i such that 2≤i≤N and F(i)=F(i−1).
*/

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    static Scanner scan = new Scanner(System.in);
    
    static void solve(){
        int n = scan.nextInt();
        int cnt = 1;
        int start = 3;
        
        while(start < n){
            cnt++;
            start = start + (start + 1);
        }
        
        cnt = n - 1 - cnt;
        
            
          
        
        System.out.println(cnt);
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
