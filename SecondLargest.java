
public class SecondLargest {
    public static void main(String args[]) {
        int[] arr = { 5, 1, 3, 4, 5, 8, 2, 0 };
        System.out.println("The second largest number in an array: " + secondLargest(arr));

        int[] arr1 = { 10,10,10 };
        System.out.println("The second largest number in an array: " + secondLargest(arr1));
        
        int[] arr2 = { 2 };
        System.out.println("The second largest number in an array: " + secondLargest(arr2));
    }

    static int secondLargest(int[] arr) {
        if (arr == null || arr.length < 2) return -1;

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > max) {
                secondMax = max;
                max = num;
            } else if (num > secondMax && num != max) {
                secondMax = num;
            }
        }

        return (secondMax == Integer.MIN_VALUE) ? -1 : secondMax;
    }
}

