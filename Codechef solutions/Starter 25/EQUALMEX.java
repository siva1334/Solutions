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
