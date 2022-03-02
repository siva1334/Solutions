/*
Given an integer array nums sorted in non-decreasing order,
return an array of the squares of each number sorted in non-decreasing order.
*/

class Solution {
    
    public int[] sortedSquares(int[] nums) {
        
        int n = nums.length;
        
        int res[] = new int[n];
        
        int start = 0;
        int end = n - 1;
        
        int indx = n - 1;
        
        for(int i = 0; i < n; i++){
            nums[i] *= nums[i];
        }
        
       while(start <= end){
           
           if(nums[start] < nums[end]){
               res[indx--] = nums[end--];
           }
           else{
               res[indx--] = nums[start++];
           }
       }
        
        return res;
        
        
    }
}
