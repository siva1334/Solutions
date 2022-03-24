/*
A binary string is called alternating if no two adjacent characters 
of the string are equal. Formally, a binary string T of length M is called alternating if Ti≠Ti+1 for each 1≤i<M.

For example, 0, 1, 01, 10, 101, 010, 1010 are alternating strings while 11, 001, 1110 are not.

You are given a binary string S of length N. You would like to
rearrange the characters of S such that the length of the longest alternating substring of S is maximum. Find this maximum value.

A binary string is a string that consists of characters 0 and 1. A string a is a substring of a string b if a
can be obtained from b by deletion of several (possibly, zero or all) characters from the beginning and several (possibly, zero or all) characters from the end.
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
        String s = scan.next();
        int zero = 0;
        int one = 0;
        int ans =  0;
        for(int i =  0; i < n; i++){
            if(s.charAt(i) == '0')zero++;
            else one++;
        }
        
        if(zero == one){
            ans = zero + one;
        }else{
           int x = Math.min(zero,one);
           ans = x * 2 + 1;
        }
        
        System.out.println(ans);
        
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
