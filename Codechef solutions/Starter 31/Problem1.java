/*
Chef's professor is planning to give his class a group assignment. 
There are 2N students in the class, with distinct roll numbers ranging from 1 to 2N. Chef's roll number is X.

The professor decided to create N groups of 2 students each. The groups were created as follows:
the first group consists of roll numbers 1 and 2N, the second group of roll numbers 2 and 2N−1, and so on, with the final group consisting of roll numbers N and N+1.

Chef wonders who his partner will be. Can you help Chef by telling him the roll number of his partner?
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
        int x = scan.nextInt();
        int ans = 0;
        if(x <= n){
            ans = (2 * n) + 1 - x;
        }
        else{
            ans = Math.abs((2 * n) - x) + 1;
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
