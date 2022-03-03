/*
Write a function that reverses a string. The input string is given as an array of characters s.

You must do this by modifying the input array in-place with O(1) extra memory.

 
*/

class Solution {
    public void reverseString(char[] s) {
        
        int n = s.length;
        int start = 0;
        int end = n - 1;
        
        while(start <= end){
            char temp = s[start];
            s[start++] = s[end];
            s[end--] = temp;
        }
        
    }
}
