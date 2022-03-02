/*
Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Note that you must do this in-place without making a copy of the array.
*/

class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int p1 = 0;
        for(int i = 0; i < n; i ++)
            if(nums[i] == 0)
               break;
            else p1++;
            
        
        //int cnt = 0;
        for(int i = p1 + 1; i < n; i++){
            
            if(nums[i] != 0){
                nums[p1++] = nums[i];
            }
        }
        
        for(int i = p1; i < n; i++)nums[i] = 0;
        
        
    }
}
