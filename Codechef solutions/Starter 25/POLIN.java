/*
Given N points of the form (xi,yi) on a 2-D plane.

From each point, you draw 2 lines one horizontal and one vertical.
Now some of the lines may overlap each other, therefore you are required to print the number of distinct lines you can see on the plane.
*/

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    static Scanner scan;
    static int solve(){
        //Scanner scan = new Scanner(System.in);
        int res = 2;
		    int n = scan.nextInt();
		    int a[]= new int [n];
		   int b[] =new int[n];
		    for(int i = 0; i <n; i++){
		        a[i] = scan.nextInt();
		        b[i]= scan.nextInt();
		    }
		   Arrays.sort(a);
		    Arrays.sort(b);
		     
		    for(int i = 1;i<n;i++){
		        if(a[i] !=a[i-1])
		        res++;
		        if(b[i] !=b[i-1])
		        res++;
		    }
		    return res;
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t-- >0){
		   
		   System.out.println(solve());
		    }
		    
		}
	}

