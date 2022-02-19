/*
You are given an integer finalSum. Split it into a sum of a maximum number of unique positive even integers.

For example, given finalSum = 12, the following splits are valid
(unique positive even integers summing up to finalSum): (2 + 10), (2 + 4 + 6), and (4 + 8). Among them, (2 + 4 + 6) contains
the maximum number of integers. Note that finalSum cannot be split into (2 + 2 + 4 + 4) as all the numbers should be unique.
Return a list of integers that represent a valid split containing a maximum number of integers.
If no valid split exists for finalSum, return an empty list. You may return the integers in any order.

 
*/
class Solution {
    public List<Long> maximumEvenSplit(long sum) {
        
        List<Long>ans = new ArrayList<Long>();
        
        if(sum % 2 != 0)return ans;
        
        long x = 2;
        int i = -1;
        long size = 0;
        while(true){
            if(size + x <= sum){
                size += x;
                i++;
                ans.add(x);
                x += 2;
            }else{
                long temp = sum - size;
                temp += ans.get(i);
                ans.remove(i);
                ans.add( temp);
                break;
            }
        }
        return ans;
        
            
    }
}
