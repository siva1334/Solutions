/*
 pangram is a string that contains every letter of the alphabet. Given a sentence determine whether it is a pangram in the English alphabet. Ignore case. 
 Return either pangram or not pangram as appropriate.

Example

The string contains all letters in the English alphabet, so return pangram.

Function Description

Complete the function pangrams in the editor below. It should return the string pangram if the input string is a pangram. Otherwise, it should return not pangram.

pangrams has the following parameter(s):

string s: a string to test
*/

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;

public class Solution {
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        String s = scan.nextLine();
        int temp[] = new int[26];
        String answer = "pangram";
        for(int i = 0; i < s.length(); i++){
            
            if(s.charAt(i) == ' ')
            continue;
            
            if((int)s.charAt(i) < 97){
                temp[s.charAt(i) - 65] = 1;
            }
            else{
                temp[s.charAt(i) - 97] = 1;
            }
            
        }
        for(int i = 0; i < 26; i ++){
            if(temp[i] == 0){
                answer = "not pangram";
                break;
            }
        }
        System.out.println(answer);
    }
}
