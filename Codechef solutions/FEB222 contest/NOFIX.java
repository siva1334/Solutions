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
        int a[] = new int [n];
        for(int i = 0; i < n; i++){
            a[i] = scan.nextInt();
        }
        int addition = 1;
        int ans = 0;
        for(int i = 0; i < n; ++i){
            if(a[i] == i+addition){
              ans++;
              addition++;
            }
        }
        System.out.println(ans);
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int t = scan.nextInt();
		while( t-- > 0){
		    solve();
		}
	}
}
