/*
Alice has an array A of length N. She is interested in finding the number of pairs (i,j) such that 1≤i<j≤N and Ai⊕Aj<Ai&Aj.

⊕ represents the Bitwise XOR operator. & represents the Bitwise AND operator.
*/

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    static Scanner scan = new Scanner(System.in);
    
    static int pow(int x){

        int ans = 0;
        int pow = 1;
        while(pow <= x){
            ans++;
           pow *= 2;
        }
        
        return ans;
    }
    
    static void solve(){
        int n = scan.nextInt();
        int a[] = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = scan.nextInt();
        }
        
        int h[] = new  int[1000];
        long ans = 0;
        
        for(int i = n - 1; i >= 0; i--){
            int pow = pow(a[i]);
           // System.out.println(pow);
            ans += h[pow];
            h[pow]++;
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
