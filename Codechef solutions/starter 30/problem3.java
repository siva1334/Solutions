/*
Chef is working on his swap-based sorting algorithm for strings.

Given a string S of length N, he wants to know whether he can sort the string using his algorithm.

According to the algorithm, one can perform the following operation on string S any number of times:

Choose some index i (1≤i≤N) and swap the ith character from the front and the ith character from the back.
More formally, choose an index i and swap Si and S(N+1−i).
For example, d––cba–– can be converted to a––cbd–– using one operation where i=1.

Help Chef find if it is possible to sort the string using any (possibly zero) number of operations.
*/

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    static Scanner scan = new Scanner(System.in);
    
    static boolean solve(){
        int n = scan.nextInt();
        String s = scan.next();
        char a[] =  s.toCharArray();
        
       if(n < 2)return true;
        
       for(int i = 0; i < n/2; i++){
           if(a[i] > a[i + 1]){
                if(a[i + 1] < a[n - 1 - i]){
                  return false;
                   
                } 
                
                else{
                    char temp = a[n - 1 - i];
                    a[n - 1 - i] = a[i];
                    a[i] = temp;
                }
           }
           else if(a[i] == a[i + 1]){
               
               if(a[i + 1] > a[n - 1 - i]){
                   char temp = a[n - 1 - i];
                    a[n - 1 - i] = a[i];
                    a[i] = temp;
               }
           }
       }
       
       for(int i = 1; i < n; i++){
           if(a[i] < a[i - 1])return false;
       }
       return true;
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes 
		int t = scan.nextInt();
		while(t-- > 0){
		    boolean b = solve();
		    if(b){
		        System.out.println("YES");
		    }else{
		         System.out.println("NO");
		    }
		}
	}
}
