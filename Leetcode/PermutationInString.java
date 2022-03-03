/*
Given two strings s1 and s2, return true if s2 contains a permutation of s1, or false otherwise.

In other words, return true if one of s1's permutations is the substring of s2.
*/

class Solution {
    
    boolean isEqual(int a[], int b[]){        
    for(int i = 0; i < 26; i++) if(a[i] != b[i])return false;return true;        
    }
    
    public boolean checkInclusion(String s1, String s2) {
        
        if(s1.length() > s2.length())return false;
        
        int len = s1.length();
        
        int a[] = new int[26];
        int b[] = new int[26];
        for(int i = 0; i < len; i++)a[s1.charAt(i) - 'a']++;
        
        int i = 0;
        for(; i < len; i++){
            if(a[s2.charAt(i) - 'a'] != 0)
            b[s2.charAt(i) - 'a']++;
        }
        
        if(isEqual(a, b))return true;
        
        for(; i < s2.length(); i++){
            
            if(a[s2.charAt(i - len) - 'a'] != 0)
                b[s2.charAt(i - len) - 'a']--;
            
                if(a[s2.charAt(i) - 'a'] != 0)
                b[s2.charAt(i) - 'a']++;
                
                if(isEqual(a,b))return true;        
            }
            
            return false;
    }
}
