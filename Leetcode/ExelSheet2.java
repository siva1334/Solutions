/*
Given an integer columnNumber, return its corresponding column title as it appears in an Excel sheet.
*/

class Solution {
    public String convertToTitle(int number) {
     
        String ans = "";
        
        while( number > 0 ){
            
            if(number % 26 != 0){
            int n = number % 26 + 64;
            ans += (char)n;
            number /= 26;
                
            }
            
            else {
                ans += (char)(26 + 64);
                 number /= 26;
                number--;
            }
            
           
        }
        
        String res = "";
        
        for(int i = ans.length() - 1; i >= 0; --i){
            res += ans.charAt(i);
        }
        
        return res;
    }
}
