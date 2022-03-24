/*
Initially, Chef is at coordinate 0 on X-axis. For each i=1,2,…,N in order, Chef does the following:

If Chef is at a non-negative coordinate, he moves i steps backward 
(i.e, his position's coordinate decreases by i), otherwise he moves i steps forward (i.e, his position's coordinate increases by i).
You are given the integer N. Find the final position of Chef on the X-axis after N operations.
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
        int ans = 0;
        if(n % 2 == 0){
           ans = n /2;
        }
        else{
            ans = (n / 2) + 1;
            ans *= -1;
        }System.out.println(ans);
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
