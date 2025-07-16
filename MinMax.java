import java.util.Scanner;
import java.util.*;

public class MinMax {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int size;

        System.out.println("Enter size of an array:  ");
        size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter array:  ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int l = arr[0];
        int m = arr[0];

        for (int i = 0; i < size; i++) {
            if (arr[i] < l)
                l = arr[i];
            else if (arr[i] > m)
                m = arr[i];
        }

        System.out.println("Array you have entered: ");
        int j = 0;
        while (j < size) {
            System.out.print(arr[j]+" ");
            j++;
        }

        System.out.println("\n minimum and maximum elements of array are "+l+" and "+m);

        sc.close();
    }
}