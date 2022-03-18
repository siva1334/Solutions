/*
Chef is given a binary string A of length N. He can perform the following operation on A any number of times:

Choose L and R (1≤L≤R≤N), such that, in the substring A[L,R], the number of 1s is equal to the number of 0s and reverse the substring A[L,R].
Find the lexicographically smallest string that Chef can obtain after performing the above operation any (possibly zero) number of times on A.

String X is lexicographically smaller than string Y, if either of the following satisfies:

X is a prefix of Y and X≠Y.
There exists an index i such that Xi<Yi and Xj=Yj,∀j such that 1≤j<i.
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
        String s =  scan.next();
       int zero = 0;
       int one = 0;
       char a[] = s.toCharArray();
       
       for(int i = 0; i < n; i++){
           
           if(s.charAt(i) == '0')zero++;
           else one++;
       }
            
            int i = 0;
            while(i < zero){
               a[i++] = '0';
                }
                 while(i < n){
               a[i++] = '1';
                }
                
                for( i = 0; i < n; i++){
                System.out.print(a[i]);
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
