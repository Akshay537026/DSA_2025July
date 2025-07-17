// https://www.geeksforgeeks.org/problems/max-sum-subarray-of-size-k5313/1

public class MaxSumOfSubArraySizeK {
    public static void main(String[] args) {
        int[] arr={100, 200, 300, 400};
        int k=2;

        MaxSumOfSubArraySizeK m=new MaxSumOfSubArraySizeK();
        System.out.println(m.maximumSumSubarray(arr, k));
    }

    public int maximumSumSubarray(int[] arr, int k) {
        
        int max=0, sum=0;
        
        for(int i=0; i<k; i++) {
            sum+=arr[i];
        }
        
        max=Math.max(max,sum);
        
        for(int i=k; i<arr.length; i++) {
            sum+=arr[i]-arr[i-k];
            max=Math.max(max,sum);
        }
        
        return max;
    }

}
