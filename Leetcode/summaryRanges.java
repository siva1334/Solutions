/*
You are given a sorted unique integer array nums.

Return the smallest sorted list of ranges that cover all the numbers in the array exactly.
That is, each element of nums is covered by exactly one of the ranges,
and there is no integer x such that x is in one of the ranges but not in nums.

Each range [a,b] in the list should be output as:

"a->b" if a != b
"a" if a == b
*/

class Solution {
    public List<String> summaryRanges(int[] nums) {
             
        List<String> ans = new ArrayList<String>();
         if(nums.length == 0) return ans;
        
        String temp = "" + nums[0];
        int len = 1;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] - 1 != nums[i - 1]){
                
                if(len == 1){
                    ans.add(temp);
                    temp = "" + nums[i];
                }
                else{
                    temp +="->" + nums[i - 1];
                    ans.add(temp); 
                     len = 1;
                    temp = "" + nums[i];
                }
                }
            
            else len++;          
          }
        if(len == 1)ans.add(temp);
        else ans.add(temp + "->" + nums[nums.length - 1] );
        
         return ans;
    }
}
