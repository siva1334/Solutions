/*
Given an unsorted array A of size N that contains only non-negative integers, find a continuous sub-array which adds to a given number S.
*/

class Solution
{
    //Function to find a continuous sub-array which adds up to a given number.
    static ArrayList<Integer> subarraySum(int[] a, int n, int s) 
    {
        // Your code here
        
        ArrayList<Integer>ans = new ArrayList<Integer>();
        
        int start = 0;
        int sum = 0;
        int end = 0;
        for(int i = 0; i < a.length;i++){
            if(sum < s){
               sum += a[i];  
            }
            
            if(sum == s){
                end = i + 1;
                break;
            }
            
            if(sum > s){
                while( sum > s)
                sum -= a[start++];
                
                if(sum == s){
                    end = i + 1;
                    break;
                }
            }
        }
        
        if(end == 0){
            ans.add(-1);
            return ans;
        }
        
        start++;
        ans.add(start);
        ans.add(end);
        return ans;
        
    }
}
