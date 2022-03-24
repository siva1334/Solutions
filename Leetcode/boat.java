/*
You are given an array people where people[i] is the weight of the ith person, 
and an infinite number of boats where each boat can carry a maximum weight of limit. Each boat carries at most two people at the same time, 
provided the sum of the weight of those people is at most limit.

Return the minimum number of boats to carry every given person.
*/

class Solution {
    public int numRescueBoats(int[] p, int limit) {
      
        
        Arrays.sort(p);
        int start = 0 ; 
        int n = p.length;
        
        int end = n - 1;
        
        int ans = 0;
        while(start <= end){
            if(start == end){
                
                ans++;
                break;
            }
            
            if(p[end] + p[start] <= limit){
                ans++;
                end--;
                start++;
            }
            else{
                end--;
                ans++;
            }
           
            
        }
        
        return ans;
        
        
    
        
    }
}
