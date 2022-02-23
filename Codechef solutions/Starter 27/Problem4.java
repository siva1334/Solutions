/*
You are given a binary string S of length N.

You have to perform the following operation exactly once:

Select an index i (1≤i≤N) and delete Si from S. The remaining parts of S are concatenated in the same order.
How many distinct binary strings of length N−1 can you get after applying this operation?
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
        
        int ans = 1;
         char c = s.charAt(0);
        for(int i =1; i < n; i++){
            if(s.charAt(i) != c){
                ans++;
                c = s.charAt(i);
            }
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
