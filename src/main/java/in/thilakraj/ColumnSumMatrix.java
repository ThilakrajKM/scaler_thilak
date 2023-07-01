package in.thilakraj;

/**
 * Problem Description
 * You are given a 2D integer matrix A, return a 1D integer array containing column-wise sums of original matrix.
 * <p>
 * <p>
 * <p>
 * Problem Constraints
 * 1 <= A.size() <= 103
 * <p>
 * 1 <= A[i].size() <= 103
 * <p>
 * 1 <= A[i][j] <= 103
 * <p>
 * <p>
 * <p>
 * Input Format
 * First argument is a 2D array of integers.(2D matrix).
 * <p>
 * <p>
 * <p>
 * Output Format
 * Return an array containing column-wise sums of original matrix.
 * <p>
 * <p>
 * <p>
 * Example Input
 * Input 1:
 * <p>
 * [1,2,3,4]
 * [5,6,7,8]
 * [9,2,3,4]
 * <p>
 * <p>
 * Example Output
 * Output 1:
 * <p>
 * {15,10,13,16}
 * <p>
 * <p>
 * Example Explanation
 * Explanation 1
 * <p>
 * Column 1 = 1+5+9 = 15
 * Column 2 = 2+6+2 = 10
 * Column 3 = 3+7+3 = 13
 * Column 4 = 4+8+4 = 16
 */
public class ColumnSumMatrix {

    public int[] solve(int[][] A) {
        int[] columSum = new int[A[0].length];

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                columSum[j] += A[i][j];
            }
        }

        return columSum;
    }
}
