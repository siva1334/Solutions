/*
You have n boxes. You are given a binary string boxes of length n, where boxes[i] is '0' if the ith box is empty, and '1' if it contains one ball.

In one operation, you can move one ball from a box to an adjacent box. Box i is adjacent to box j if abs(i - j) == 1.
Note that after doing so, there may be more than one ball in some boxes.

Return an array answer of size n, where answer[i] is the minimum number of operations needed to move all the balls to the ith box.

Each answer[i] is calculated considering the initial state of the boxes.
*/
class Solution {
    public int[] minOperations(String boxes) {
        
        int ones = 0;
        int n = boxes.length();
        int sum = 0;
        int ans[] = new int[n];
        
        for(int i = 0;  i < n; i++){
            
            if(boxes.charAt(i) == '1'){
                ones++;
                sum += i;
            }
        }
        
         ans[0] = sum;
        int beforeOnes = 0;
        int beforeSum = 0;
        
        if(boxes.charAt(0) == '1'){
            beforeOnes++;
            ones--;
        }
        
        for(int i = 1; i < n; i++){
            
            beforeSum += beforeOnes;
            sum -= ones;
            
            if(boxes.charAt(i) == '1'){
                beforeOnes++;
                ones--;
            }
            ans[i] = sum + beforeSum;
        }
        
      return ans;
                
    }
}
