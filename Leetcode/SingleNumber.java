/*
Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

You must implement a solution with a linear runtime complexity and use only constant extra space.
*/
import java.util.*;
class Solution {
    
    public int singleNumber(int[] nums) {
        int ans = 0;
        for(int i = 0; i < nums.length; i++)
            ans ^= nums[i];
        
        return ans;
        
    }
}
class Main{
  public static void main(String []args){
    
    Scanner scan = new Scanner();
    
    int n = scan.nextInt();
    int a[] = new int[n];
    
    for(int i =0; i < n; i++){
      a[i] = scan.nextInt();
    }
    
    Solution obj = new Solution();
    
    (System.out.println(obj.singleNumber(a));
}
}
