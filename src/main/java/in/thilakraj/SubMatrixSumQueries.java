package in.thilakraj;

/**
 * Problem Description
 * Given a matrix of integers A of size N x M and multiple queries Q, for each query, find and return the submatrix sum.
 * <p>
 * Inputs to queries are top left (b, c) and bottom right (d, e) indexes of submatrix whose sum is to find out.
 * <p>
 * NOTE:
 * <p>
 * Rows are numbered from top to bottom, and columns are numbered from left to right.
 * The sum may be large, so return the answer mod 109 + 7.
 * Also, select the data type carefully, if you want to store the addition of some elements.
 * Indexing given in B, C, D, and E arrays is 1-based.
 * Top Left 0-based index = (B[i] - 1, C[i] - 1)
 * Bottom Right 0-based index = (D[i] - 1, E[i] - 1)
 * <p>
 * <p>
 * Problem Constraints
 * 1 <= N, M <= 1000
 * -100000 <= A[i] <= 100000
 * 1 <= Q <= 100000
 * 1 <= B[i] <= D[i] <= N
 * 1 <= C[i] <= E[i] <= M
 * <p>
 * <p>
 * <p>
 * Input Format
 * The first argument given is the integer matrix A.
 * The second argument given is the integer array B.
 * The third argument given is the integer array C.
 * The fourth argument given is the integer array D.
 * The fifth argument given is the integer array E.
 * (B[i], C[i]) represents the top left corner of the i'th query.
 * (D[i], E[i]) represents the bottom right corner of the i'th query.
 * <p>
 * <p>
 * <p>
 * Output Format
 * Return an integer array containing the submatrix sum for each query.
 * <p>
 * <p>
 * <p>
 * Example Input
 * Input 1:
 * <p>
 * A = [   [1, 2, 3]
 * [4, 5, 6]
 * [7, 8, 9]   ]
 * B = [1, 2]
 * C = [1, 2]
 * D = [2, 3]
 * E = [2, 3]
 * Input 2:
 * <p>
 * A = [   [5, 17, 100, 11]
 * [0, 0,  2,   8]    ]
 * B = [1, 1]
 * C = [1, 4]
 * D = [2, 2]
 * E = [2, 4]
 * <p>
 * <p>
 * Example Output
 * Output 1:
 * <p>
 * [12, 28]
 * Output 2:
 * <p>
 * [22, 19]
 * <p>
 * <p>
 * Example Explanation
 * Explanation 1:
 * <p>
 * For query 1: Submatrix contains elements: 1, 2, 4 and 5. So, their sum is 12.
 * For query 2: Submatrix contains elements: 5, 6, 8 and 9. So, their sum is 28.
 * Explanation 2:
 * <p>
 * For query 1: Submatrix contains elements: 5, 17, 0 and 0. So, their sum is 22.
 * For query 2: Submatrix contains elements: 11 and 8. So, their sum is 19.
 */
public class SubMatrixSumQueries {

    public static void main(String[] args) {
        solve(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}, new int[]{1, 2}, new int[]{1, 2}, new int[]{2, 3}, new int[]{2, 3});
    }

    public static long[] solve(int[][] A, int[] B, int[] C, int[] D, int[] E) {
        long[] result = new long[B.length];

        int n = A.length;
        int m = A[0].length;
        /*int[][] prefixSumMat = new int[n][m];

        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                int val = 0 ;
                if (i == 0 && j==0) {
                    val = A[i][j];
                } else if(i==0) {
                    val = prefixSumMat[i][j-1] + A[i][j];
                } else if(j==0) {
                    val = prefixSumMat[i-1][j] + A[i][j];
                } else {
                    val = prefixSumMat[i-1][j] + prefixSumMat[i][j-1] + A[i][j];
                }

                prefixSumMat[i][j] = val;
            }
        }*/

        long[][] prefixSumMat = prefixSum(A, n, m);

        for (int i = 0; i < B.length; i++) {
            long val = prefixSumMat[D[i] - 1][E[i] - 1] - (C[i] - 2 >= 0 ? prefixSumMat[D[i] - 1][C[i] - 2] : 0)
                    - ((B[i] - 2 >= 0 && E[i] - 2 >= 0) ? prefixSumMat[B[i] - 2][E[i] - 2] : 0) + prefixSumMat[B[i] - 1][C[i] - 1];
            result[i] = val;
        }

        return result;
    }

    public static long[][] prefixSum(int[][] A, int n, int m) {
        long[][] ps = new long[n][m];
        // row wise sum
        for (int i = 0; i < n; i++) {
            ps[i][0] = A[i][0];
            for (int j = 1; j < m; j++) {
                ps[i][j] = ps[i][j - 1] + A[i][j];
            }
        }

        // col wise sum
        for (int j = 0; j < m; j++) {
            for (int i = 1; i < n; i++) {
                ps[i][j] = ps[i - 1][j] + ps[i][j];
            }
        }

        return ps;
    }


    public class Solution {
        public int[] solve(int[][] A, int[] B, int[] C, int[] D, int[] E) {
            int n = A.length;
            int m = A[0].length;

            long[][] p = new long[n][m];
            // calculate prefix sum in 2 steps.
            // step 0 - copy all elements from original array to prefix array.
            // step 1 - calculate initial prefix sum using row wise prefix sum.
            // step 2 - calculate final prefix using the column wise prefix sum.

            // row wise and column wise are similar to 1D Arrays prefix sum calculation.
            // ie., p[i] = p[i-1] + A[i];

            // step 0.

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    p[i][j] = A[i][j];
                }
            }

            // step 1.
            for (int i = 0; i < n; i++) {
                for (int j = 1; j < m; j++) {
                    p[i][j] = p[i][j - 1] + p[i][j];
                }
            }

            // step 2.
            for (int j = 0; j < m; j++) {
                for (int i = 1; i < n; i++) {
                    p[i][j] = p[i - 1][j] + p[i][j];
                }
            }

            int[] ans = new int[B.length];
            long mod = 1000000007;

            // p[a2][b2] - p[a1-1][b2] - p[a2][b1-1] + p[a1-1][b1-1].
            // a1 > 0 b1 > 0 a1 > 0 && b1 > 0

            for (int i = 0; i < B.length; i++) {
                int a1 = B[i] - 1;
                int b1 = C[i] - 1;
                int a2 = D[i] - 1;
                int b2 = E[i] - 1;

                long sum = p[a2][b2];

                if (a1 > 0 && b1 > 0) {
                    sum = (sum + p[a1 - 1][b1 - 1]) % mod;
                }
                if (a1 > 0) {
                    sum = (sum - p[a1 - 1][b2]) % mod;
                }

                if (b1 > 0) {
                    sum = (sum - p[a2][b1 - 1]) % mod;
                }

                if (sum < 0) {
                    sum = (sum + mod) % mod;
                }

                ans[i] = (int) sum;
            }

            return ans;
        }
    }
}
