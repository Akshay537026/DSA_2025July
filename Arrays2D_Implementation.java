// Diagonal Traversal of a Matrix I
// Given a 2D matrix of size n*m, the tasks is to print all elements of the given matrix in diagonal order.

// Example:

// Input: mat[][] = [[ 1, 2, 3, 4 ],
//                             [5, 6, 7, 8 ],
//                             [9, 10, 11, 12],
//                            [13, 14, 15, 16],
//                           [17, 18, 19, 20]]
// Output: 1 5 2 9 6 3 13 10 7 4 17 14 11 8 18 15 12 19 16 20 

public class Arrays2D_Implementation {

    public static void rec(int i, int j, int m, int n, int[][] mat) {
        if (i < 0 || j >= n)
            return;

        System.out.print(mat[i][j] + " ");

        rec(--i, ++j, m, n, mat); // Note - i-- or --i change original value -> bestToUse i-1 which jut change
                                  // value inide block

    }

    public static void main(String[] args) {
        int[][] mat = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 },
                { 17, 18, 19, 20 },
        };

        // System.out.println(Arrays.deepToString(mat)); // to print 2D Arrays

        int m = mat.length;
        int n = mat[0].length;

        for (int i = 0; i < m; i++) {
            int j = 0;

            if (i == (m - 1)) {
                while (j < n) {
                    rec(i, j, m, n, mat);
                    j++;
                }
            } else {
                rec(i, j, m, n, mat);
            }
        }
    }
}