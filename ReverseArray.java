import java.util.Arrays;
public class ReverseArray {

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4 };
        reverseArray(arr);
    }

    public static void reverseArray(int arr[]) {
        int temp, j;
        int n = arr.length;

        System.out.println("\nThe array given as ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        for (int i = 0; i < n; i++) {
            j = n - i - 1;
            if (i < j) {
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            } else
                break;
        }

        System.out.println("\nThe reverse array is ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

    }

}
