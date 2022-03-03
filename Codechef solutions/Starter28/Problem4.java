/*
A permutation is called attractive if the bitwise XOR of all absolute differences of adjacent pairs of elements is equal to 0.

Formally, a permutation A=[A1,A2,…,AN] of length N is said to be attractive if:

|A1−A2|⊕|A2−A3|⊕…⊕|AN−1−AN|=0
where ⊕ denotes the bitwise XOR operation.

Output any attractive permutation of length N. If no attractive permutation exists, print −1 instead.

Note: A permutation of length N is an array A=[A1,A2,…,AN] such that every integer from 1 to N occurs exactly once in A. For example,
[1,2,3] and [2,3,1] are permutations of length 3,
but [1,2,1], [4,1,2], and [2,3,1,4] are not.
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
        if(n < 3){
           System.out.println(-1);
        }
        else{
        
        int a[]= new int[n];
        for(int i = 1; i <=n ; i++)
        a[i - 1] = i;
        
        if(n %2 == 0){
            a[n - 3] = n;
            a[n - 2] = n - 2;
            a[n - 1] = n - 1;
        }
        for(int i = 0; i < n; i ++)
        System.out.print(a[i] + " ");
        
        System.out.println();
        }
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
