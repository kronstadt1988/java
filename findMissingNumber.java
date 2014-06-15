@author Alberto Martín

// Given an Array of unique numbers from 1 to N+1 it returns the missing value.

import java.util.Arrays;

class Solution {
    public int solution(int[] A) {
        
        int missingValue=-1;
        int[] sortedArray=A;
        Arrays.sort(sortedArray);
        int positionValue;
        
        for(int i=1;i<=A.length+1;i++){
            
            
            int indexValue=(Arrays.binarySearch(sortedArray,i));
            boolean isMissing= (indexValue<0) ? true:false;
            
            if (isMissing){
                missingValue=i;
            }
            
           
        }
        return missingValue;
        
    }
}
