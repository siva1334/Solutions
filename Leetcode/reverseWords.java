/*
Given a string s, reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.
*/

class Solution {
    String reverse(String s, int indx){
        String temp = "";
        
        for(; indx >= 0; indx--){
            if(s.charAt(indx) == ' ')break;
            temp += s.charAt(indx);
        }
        
        return temp;
    }
    
    public String reverseWords(String s) {
        String ans = "";
        
        
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == ' '){
                ans += reverse(s, i - 1) + " ";
            }
        }
        
        ans += reverse(s,s.length() - 1);
        
        return ans;
    }
}
