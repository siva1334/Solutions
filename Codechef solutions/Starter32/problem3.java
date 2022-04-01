/*
JJ has an array A of size N. He can perform the following operations on the array at most K times:

Set Ai:=Ai+1 where 1≤i≤N−1
Set Ai:=Ai−1 where 2≤i≤N
He wants to maximize the value of the minimum element of the array A. Formally, he wants to maximize the value of min1≤i≤NAi.

Can you help him do so?
*/

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    static Scanner scan = new Scanner(System.in);
    
    static int solve(){
        int n = scan.nextInt();
        int k = scan.nextInt();
        int a[] = new int[n];
        
        for(int i = 0; i < n; i++){
            a[i] = scan.nextInt();
        }
        
        Arrays.sort(a);
        int cnt = 0;
        
        for(int i=0;i<n && i<=k;i++){
            if(a[i] > cnt)cnt=a[i];
        }
    return cnt; 
    
       
       
        
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes 
		int t = scan.nextInt();
		while(t-- > 0){
		    System.out.println(solve());
		}
	}
}
