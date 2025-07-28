import java.util.HashMap;

public class CountSubArrays {
    public static void main(String[] args) {
        int[] arr = { 10, 2, -2, -20, 10 };
        int k = -10;
        System.out.println(cntSubarrays(arr, k));

        int[] arr1 = {-86,86,58,69,13,-66,-33,-1,36,-88,26};
        int k1 = 14;
        System.out.println(cntSubarrays(arr1, k1));

    }

    public static int cntSubarrays(int[] arr, int k) {
        HashMap<Integer, Integer> hmPrefixSum = new HashMap<>();
        int prefixSum = 0, count = 0;

        for (int i = 0; i < arr.length; i++) {
            prefixSum += arr[i];

            if (prefixSum == k) {
                count++;
            }

            if (hmPrefixSum.containsKey(prefixSum - k))
                count += hmPrefixSum.get(prefixSum - k);

            hmPrefixSum.put(prefixSum, hmPrefixSum.getOrDefault(prefixSum, 0) + 1);
        }

        return count;
    }
}

// -86 86 58 69 13 -66 -33 -1 36 -88 26 k=14
// -86 0 58 127 140 74 41 40 76 -12 14

// 10, 2, -2, -20, 10. k = -10. Count=0 1 2 3
// 10, 12, 10, -10, 0

// 9, 4, 20, 3, 10, 5. k = 33. Count= 0 1 2
// 9, 13, 33, 36, 46, 51

// If we are looking from prefixSumArray to given array we have to add the index
// from prefixSumArray to given array by 1 so we can get sum. Accordingly if we
// want see from normal array to prefixSumArray we have to delete index by 1 in
// order to see sum.