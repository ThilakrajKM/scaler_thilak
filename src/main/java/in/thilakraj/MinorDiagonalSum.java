package in.thilakraj;

/**
 * Problem Description
 * You are given a N X N integer matrix. You have to find the sum of all the minor diagonal elements of A.
 * <p>
 * Minor diagonal of a M X M matrix A is a collection of elements A[i, j] such that i + j = M + 1 (where i, j are 1-based).
 * <p>
 * <p>
 * <p>
 * Problem Constraints
 * 1 <= N <= 103
 * <p>
 * -1000 <= A[i][j] <= 1000
 * <p>
 * <p>
 * <p>
 * Input Format
 * First and only argument is a 2D integer matrix A.
 * <p>
 * <p>
 * <p>
 * Output Format
 * Return an integer denoting the sum of minor diagonal elements.
 * <p>
 * <p>
 * <p>
 * Example Input
 * Input 1:
 * <p>
 * A = [[1, -2, -3],
 * [-4, 5, -6],
 * [-7, -8, 9]]
 * Input 2:
 * <p>
 * A = [[3, 2],
 * [2, 3]]
 * <p>
 * <p>
 * Example Output
 * Output 1:
 * <p>
 * -5
 * Output 2:
 * <p>
 * 4
 * <p>
 * <p>
 * Example Explanation
 * Explanation 1:
 * <p>
 * A[1][3] + A[2][2] + A[3][1] = (-3) + 5 + (-7) = -5
 * Explanation 2:
 * <p>
 * A[1][2] + A[2][1] = 2 + 2 = 4
 */
public class MinorDiagonalSum {

    public int solve(final int[][] A) {
        int result = 0;

        for (int i = 0; i < A.length; i++) {
            result += A[A.length - i][i];
        }

        return result;
    }
}
