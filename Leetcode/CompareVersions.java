/*
Given two version numbers, version1 and version2, compare them.

Version numbers consist of one or more revisions joined by a dot '.'.
Each revision consists of digits and may contain leading zeros.
Every revision contains at least one character. Revisions are 0-indexed from left to right,
with the leftmost revision being revision 0, the next revision being revision 1, and so on. For example 2.5.33 and 0.1 are valid version numbers.

To compare version numbers, compare their revisions in left-to-right order.
Revisions are compared using their integer value ignoring any leading zeros.
This means that revisions 1 and 001 are considered equal.
If a version number does not specify a revision at an index,
then treat the revision as 0. For example, version 1.0 is less than version 1.1 because their revision 0s are the same,
but their revision 1s are 0 and 1 respectively, and 0 < 1.

Return the following:

If version1 < version2, return -1.
If version1 > version2, return 1.
Otherwise, return 0.
*/

class Solution {
    public int compareVersion(String version1, String version2) {
        int i = 0;
        int j = 0;
        int len1 = version1.length();
        int len2 = version2.length();
        
        while(i < len1 && j < len2 ){
            int num1 = 0;
            int num2 = 0;
            for(; i < len1; i++){
                if(version1.charAt(i) == '.'){
                    i++;
                    break;
                }
                    
                num1 = num1 * 10 + (version1.charAt(i) - '0');
            }
            
            for(; j < len2; j++){
                if(version2.charAt(j) == '.'){
                    j++;
                     break;
                }        
                num2 = num2 * 10 + (version2.charAt(j) - '0');
            }
            
            if(num1 > num2)
                return 1;
            else if(num1 < num2)
                return -1;            
            
        }
        
        for(;i < len1; i++){
            
           if(version1.charAt(i) == '.')
               continue;
            if(version1.charAt(i) - '0' > 0)
                return 1;
        }
        
        for(;j < len2; j++){
            
           if(version2.charAt(j) == '.')
               continue;
            if(version2.charAt(j) - '0' > 0)
                return -1;
        }
        
        return 0;
    }
}
