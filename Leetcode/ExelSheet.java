/*
Given a string columnTitle that represents the column title as appear in an Excel sheet, return its corresponding column number.

For example:

A -> 1
B -> 2
C -> 3
...
Z -> 26
AA -> 27
AB -> 28 
...

*/
class Solution {
    public int titleToNumber(String s) {
        int ans = 0;
        int indx = s.length() - 1;
        int mul = 1;
        
        for(int i = indx; i >= 0; --i){
            
            ans += (s.charAt(i) - 64) * mul;
            mul *= 26;
        }
        
        return ans;
    }
}
