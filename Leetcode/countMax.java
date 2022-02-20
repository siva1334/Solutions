/*
Given a binary array nums, return the maximum number of consecutive 1's in the array.

 
*/
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int count = 0;
        for(int x:nums){
            if(x == 1)count++;
            else {
                if(max < count)max=count;
                count = 0;
            }
        }
        if(count > max)
            max = count;
        
        return max;
    }
}
