/*
An index i in a permutation P of length N is said to be good if:

Pi is divisible by i
You are given 2 integers N and K. You need to construct a permutation P of length N such that exactly K indices in that permutation are good.

If no such permutation exists, output −1.

If multiple such permutations exist, output any.
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
        int k = scan.nextInt();
        int x = n - k;
        int a[] = new int[n];
        for(int i = 0; i < x;i++ ){
            a[i] = i + 2;
        }
        a[x] = 1;
        for(int i = x+1; i < n ; i++){
            a[i] = i+1;
        }
        for(int i = 0; i < n; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();
        
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
