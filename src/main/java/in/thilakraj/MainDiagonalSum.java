package in.thilakraj;

/**
 * Problem Description
 * You are given a N X N integer matrix. You have to find the sum of all the main diagonal elements of A.
 * <p>
 * Main diagonal of a matrix A is a collection of elements A[i, j] such that i = j.
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
 * There are 1 lines in the input. First 2 integers R, C are the number of rows and columns. Then R * C integers follow corresponding to the rowwise numbers in the 2D array A.
 * <p>
 * <p>
 * <p>
 * Output Format
 * Return an integer denoting the sum of main diagonal elements.
 * <p>
 * <p>
 * <p>
 * Example Input
 * Input 1:
 * <p>
 * 3 3 1 -2 -3 -4 5 -6 -7 -8 9
 * Input 2:
 * <p>
 * 2 2 3 2 2 3
 * <p>
 * <p>
 * Example Output
 * Output 1:
 * <p>
 * 15
 * Output 2:
 * <p>
 * 6
 * <p>
 * <p>
 * Example Explanation
 * Explanation 1:
 * <p>
 * The size of matrix is 3.
 * So, considering the indexing from 0.
 * Main diagonal elements will be A[0][0], A[1][1] and A[2][2]
 * A[1][1] + A[2][2] + A[3][3] = 1 + 5 + 9 = 15
 * Explanation 2:
 * <p>
 * The size of matrix is 2.
 * So, considering the indexing from 0.
 * Main diagonal elements will be A[0][0] and A[1][1].
 * A[1][1] + A[2][2] = 3 + 3 = 6
 */
public class MainDiagonalSum {

    public int solve(final int[][] A) {
        int result = 0;

        for (int i = 0; i < A.length; i++) {
            result += A[i][i];
        }

        return result;
    }

}
