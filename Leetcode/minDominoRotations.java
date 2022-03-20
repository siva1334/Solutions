/*
In a row of dominoes, tops[i] and bottoms[i] represent the top and bottom halves of the ith domino. 
(A domino is a tile with two numbers from 1 to 6 - one on each half of the tile.)

We may rotate the ith domino, so that tops[i] and bottoms[i] swap values.

Return the minimum number of rotations so that all the values in tops are the same, or all the values in bottoms are the same.

If it cannot be done, return -1.
*/

class Solution {
    public int minDominoRotations(int[] tops, int[] bottoms) {
        int topTemp[] = new int[7];
        int bottomTemp[] = new int[7];
        
        
        int n = tops.length;
        
        for(int i = 0; i < tops.length; i++){
            topTemp[tops[i]]++;
            bottomTemp[bottoms[i]]++;
        }
        
        
        int ans = -1;
        
        for(int i = 1; i < 7; i++){
            
            boolean flag = true;
            
            for(int j = 0; j < n; j++){
                
               if(tops[j] != i && bottoms[j] != i){
                   flag = false;
                   break;                   
               }
                
            }
            
            if(flag){
               int val = n - Math.max(topTemp[i] , bottomTemp[i]);
                
                if(ans == -1){
                    ans = val;
                }
                else{
                ans = Math.min(ans , val);
                }
            }
        }
        
        return ans;

    }
}
