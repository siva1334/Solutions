/*
According to the new tax scheme, a new tax called the binary string tax was introduced!
JJ has a binary string S of length N. According to the tax scheme, for every occurrence of 01 in S,
a tax of X rupees will be charged, while for every occurrence of 10 in S, a tax of Y rupees will be charged.

For example, if X=5, Y=7 and S=11010, then S has 1 occurrence of 01 and 2 occurrences of 10, so the tax charged =5⋅1+7⋅2=19

JJ can rearrange the string S in any way he wants. He wants to minimize the amount of tax he has to pay. Can you help him do so?
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
        int y = scan.nextInt();
        
        String s = scan.next();
        
        int xx = 0;
        int yy = 0;
        for(int i = 0; i < s.length(); i++){
            
            if(s.charAt(i) == '0'){
                xx++;
            }
            if(s.charAt(i) == '1'){
                yy++;
            }
        }
           if(xx == 0 ||  yy == 0){
              System.out. println(0);
           }
           
           else{
              System.out.println(Math.min(x,y));
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
