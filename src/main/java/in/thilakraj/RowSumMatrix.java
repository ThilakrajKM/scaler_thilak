package in.thilakraj;

/**
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
 * First argument A is a 2D array of integers.(2D matrix).
 * <p>
 * <p>
 * <p>
 * Output Format
 * Return an array containing row-wise sums of original matrix.
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
 * [10,26,18]
 * <p>
 * <p>
 * Example Explanation
 * Explanation 1
 * <p>
 * Row 1 = 1+2+3+4 = 10
 * Row 2 = 5+6+7+8 = 26
 * Row 3 = 9+2+3+4 = 18
 */
public class RowSumMatrix {
    public int[] solve(int[][] A) {

        int[] rowSum = new int[A.length];

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                rowSum[i] += A[i][j];
            }
        }

        return rowSum;

    }
}
