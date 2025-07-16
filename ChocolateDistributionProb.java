// https://www.geeksforgeeks.org/problems/chocolate-distribution-problem3825/1

import java.util.ArrayList;
import java.util.Collections;

public class ChocolateDistributionProb {
        public int findMinDiff(ArrayList<Integer> arr, int m) {
        Collections.sort(arr);  // use in ArrayList
        
        int minValue=arr.get(m-1)-arr.get(0);
        int overAllMinValue=minValue;
        
        int j=1;
        int i=m;
        
        while(i<arr.size()) {
            
            minValue=arr.get(i)-arr.get(j);
            
            overAllMinValue=Math.min(overAllMinValue,minValue);
            
            i++;
            j++;
        }
        
        return overAllMinValue;
    }
}

// 1 3 4 7 9 9 12 56

// 2 3 4 7 9 12 56

