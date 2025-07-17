// https://www.geeksforgeeks.org/problems/subarray-with-given-sum-1587115621/1

import java.util.ArrayList;
import java.util.Collections;

public class IndexesOfSubArraySum {

    public static void main(String[] args) {
        int[] arr={1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target=15;

        System.out.println(subarraySum(arr, target));
    }


    static ArrayList<Integer> subarraySum(int[] arr, int target) {
        ArrayList<Integer> res=new ArrayList<Integer>();
        
        int start=0, end=0;
        int sum=0;
        
        while(start<arr.length && end<arr.length && start<=end) {
            if(target>sum) {
                sum+=arr[end];
            }
            if(target<sum) {
                sum-=arr[start];
                start++;
            }
            
            if(target==sum) {
                Collections.addAll(res, start+1,end+1);
                return res;
            }
            else if(target>sum) end++;
        }
        
        res.add(-1);
        return res;
    }
}

// 1 3 9 16 21

// 1, 2, 3, 4, 5, 6, 7, 8, 9, 10
// 1  3  6  10 15 21 28 36 45 55

// 1, 2, 3, 7, 5
// 1 3 9 16 21