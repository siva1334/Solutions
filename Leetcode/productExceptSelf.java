/*
Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].

The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.

You must write an algorithm that runs in O(n) time and without using the division operation.
*/

class Solution {
    
    public int[] productExceptSelf(int[] nums) {
        
        int n = nums.length;
        
        int[]res = new int[n];
        
        res[0] = 1;
        
        for(int i = 1; i < n; i++){
            res[i] = res[i - 1] * nums[i - 1];
        }
        
        int right = 1;
        
        for(int i = n - 1; i >= 0; --i){
            
            res[i] = res[i] * right;
            right = right  * nums[i];
        }
        
        
        return res;
         
        
    }
}
