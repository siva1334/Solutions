/*
The MEX (minimum excluded) of an array is the smallest non-negative integer that does not belong to the array. For instance:

The MEX of [2,2,1] is 0 because 0 does not belong to the array.
The MEX of [3,1,0,1] is 2 because 0 and 1 belong to the array, but 2 does not.
The MEX of [0,3,1,2] is 4 because 0,1,2 and 3 belong to the array, but 4 does not.
You're given an array A containing 2⋅N integers where 0≤Ai≤N.
Is it possible to reorder the elements of the array in such a way that the MEX of the first N elements is equal to the MEX of the last N elements?
*/

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static String solve(){
        	Scanner scan = new Scanner(System.in);
        int n = scan. nextInt()*2;
        int a[]= new int [n];
        for(int i =0;i<n;i++ ){
            a[i]=scan.nextInt();
        }
        int b[] = new int[(n/2)+1];
        for(int i =0;i<n;i++ ){
            b[a[i]]++;
        }
        for(int i =0;i<n;i++ ){
            if(b[i]%2!=0)
            return "NO";
            
        }
        return "YES";
        
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		
		while(t-- > 0){
		    int n = scan. nextInt()*2;
        int a[]= new int [n];
        for(int i =0;i<n;i++ ){
            a[i]=scan.nextInt();
        }
        String s = "YES";
        int b[] = new int[(n/2)+1];
        for(int i =0;i<b.length;i++ ){
            b[i]=0;
        }
        for(int i =0;i<n;i++ ){
            b[a[i]]++;
        }
        for(int i =0;i<b.length;i++ ){
            if(b[i]==0)
            break;
            if(b[i]==1){
            s= "NO";
            break;
            }
            
        }
        
		    System.out.println(s);
		}
	
	}
}
