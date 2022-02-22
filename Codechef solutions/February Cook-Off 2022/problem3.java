/*
You are given an array A of length K. Find any permutation P of length N such that only the prefixes of length Ai (1≤i≤K) form a permutation.

Under the given constraints, it is guaranteed that there exists at least one permutation which satisfies the given condition.

If there are multiple solutions, you may print any.

Note: A permutation of length N is an array where every element from 1 to N occurs exactly once.
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
        int a[] = new int [k];
        
       
        for(int i  = 0; i < k; i++){
            a[i] = scan.nextInt();
        }
        int temp = 0;
        for(int i = 0;i < k; i++){
            for(int j = a[i]; j > temp;j--){
                System.out.print(j + " ");
            }
            temp = a[i];
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
