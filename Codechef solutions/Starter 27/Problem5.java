/*
Chef has a string S consisting only of English lowercase letters (a - z). However, Hitesh does not like it and wants it to be reversed.

Hitesh wonders what is the minimum number of operations required to reverse the string S using the following operation:

Select any i such that 1≤i≤|S| and remove Si from its original position and append it to the end of the string (i.e. shift any character to the end of the string).
For e.g. if S= abcde and we apply operation on i=2, then S becomes acdeb.

Help Hitesh find the minimum number of operations required to reverse S.

It is guaranteed that it is possible to reverse the string in a finite number of operations.
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
        String s = scan.next();
       int n = s.length();
        int cnt = 0;
        
       
        int j = n-1;
        for(int i = 0; i < n; i++){
            if(s.charAt(i) == s.charAt(j)){
                j--;
            }
            else cnt++;
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
