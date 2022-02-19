/*
Given an integer num,
return three consecutive integers (as a sorted array) that sum to num.
If num cannot be expressed as the sum of three consecutive integers, return an empty array.
*/

class Solution {
    public long[] sumOfThree(long num) {
        
        if(num % 3 != 0)
         return  new long[0];
        
        long[] ans = new long[3];
        num /= 3;
        ans[0] = num - 1;
        ans[1] = num;
        ans[2] = num + 1;
        
        return ans;
        
        
    }
}
