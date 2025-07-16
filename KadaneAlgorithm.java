public class KadaneAlgorithm {
    public static void main(String[] args) {
        int[] arr={2, 3, -8, 7, -1, 2, 3};
        System.out.println("Maximum element can we get from subarray is " +maxSubarraySum(arr));



    }

    static int maxSubarraySum(int[] arr) {
        int endHere = arr[0];
        int maxSoFar = arr[0];

        for (int i = 1; i < arr.length; i++) {
            endHere = Math.max(arr[i], endHere + arr[i]);

            maxSoFar = Math.max(maxSoFar, endHere);
        }

        return maxSoFar;
    };

}
