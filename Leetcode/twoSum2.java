/*
Given a 1-indexed array of integers numbers that is already sorted in non-decreasing order,
find two numbers such that they add up to a specific target number. 
Let these two numbers be numbers[index1] and numbers[index2] where 1 <= index1 < index2 <= numbers.length.

Return the indices of the two numbers, index1 and index2, added by one as an integer array [index1, index2] of length 2.

The tests are generated such that there is exactly one solution. You may not use the same element twice.

Your solution must use only constant extra space.
*/

class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int n = nums.length;
        int start = 0;
        int end = n - 1;
        int ans[] = new int[2];
        
        while(start <= end){
            
            if(nums[start] + nums[end] == target){
                ans[0] = start + 1;
                ans[1] = end + 1;
                break;
            }
            
         if(nums[start] + nums[end] < target)++start;else --end;
            
        }
        
        return ans;
        
    }
}
