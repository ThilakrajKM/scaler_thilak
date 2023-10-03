package in.thilakraj;

/**
 * Problem Description
 * Given a row-wise and column-wise sorted matrix A of size N * M.
 * Return the maximum non-empty submatrix sum of this matrix.
 * <p>
 * <p>
 * Problem Constraints
 * 1 <= N, M <= 1000
 * -109 <= A[i][j] <= 109
 * <p>
 * <p>
 * Input Format
 * The first argument is a 2D integer array A.
 * <p>
 * <p>
 * Output Format
 * Return a single integer that is the maximum non-empty submatrix sum of this matrix.
 * <p>
 * <p>
 * Example Input
 * Input 1:-
 * -5 -4 -3
 * A = -1  2  3
 * 2  2  4
 * Input 2:-
 * 1 2 3
 * A = 4 5 6
 * 7 8 9
 * <p>
 * <p>
 * Example Output
 * Output 1:-
 * 12
 * Output 2:-
 * 45
 * <p>
 * <p>
 * Example Explanation
 * Expanation 1:-
 * The submatrix with max sum is
 * -1 2 3
 * 2 2 4
 * Sum is 12.
 * Explanation 2:-
 * The largest submatrix with max sum is
 * 1 2 3
 * 4 5 6
 * 7 8 9
 * The sum is 45.
 * <p>
 * <p>
 * Tutorial : https://youtu.be/r9W4f5UyMMM
 */

public class MaximumSubMatrix {

    public static void main(String[] args) {

        System.out.println(solve(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}));
        System.out.println(solve(new int[][]{{-83, -73, -70, -61}, {-56, -48, -13, 4}, {38, 48, 71, 71}}));
        System.out.println(solve(new int[][]{{1, 2}, {3, 4}}));
        System.out.println(solve(new int[][]{{-95}}));
    }

    public static long solve(int[][] A) {

        int m = A.length, n = A[0].length;
        long sum = Long.MIN_VALUE;
        long[] sumArray = new long[n];

        for (int c = 0; c < n; c++) {
            sumArray[c] = A[0][c];
        }
        sum = kadaneAlgoMaxSum(sumArray);

        for (int r1 = 0; r1 < m; r1++) {
            for (int c = 0; c < n && r1 >= 1; c++) {
                sumArray[c] = A[r1][c];
            }

            long newSum = kadaneAlgoMaxSum(sumArray);
            if (sum < newSum) {
                sum = newSum;
            }
            for (int r2 = r1 + 1; r2 < m; r2++) {
                for (int c = 0; c < n; c++) {
                    sumArray[c] = sumArray[c] + A[r2][c];
                }
                newSum = kadaneAlgoMaxSum(sumArray);
                if (sum < newSum) {
                    sum = newSum;
                }
            }
        }
        return sum;
    }

    private static long kadaneAlgoMaxSum(long[] sumArray) {
        long maxSum = Long.MIN_VALUE;
        long sum = 0;
        for (int i = 0; i < sumArray.length; i++) {
            sum += sumArray[i];
            if (maxSum < sum) {
                maxSum = sum;
                if (sum < 0) {
                    sum = 0;
                }
            }
        }
        return maxSum;
    }


    /*public static long  solve(int[][] A) {
        int m = A.length, n = A[0].length;
        long[][] pSum = new long[m][n];
        long maxSum = 0;
        long sum = 0;
        //row wise
        for(int i=0; i<m; i++) {
            sum = A[i][0] + sum;
            pSum[i][0] = sum > 0 ? sum : 0;
            if(sum>maxSum) {
                maxSum = sum;
            }
            for(int j=1; j<n; j++) {
                sum = (pSum[i][j-1]+A[i][j]) > 0? (pSum[i][j-1]+A[i][j]) : 0;
                pSum[i][j] = sum > 0 ? sum : 0;
                if(sum>maxSum) {
                    maxSum = sum;
                }
            }
        }

        *//*for(int i=0; i<n; i++) {
            for(int j=1; j<m; j++) {
                long sum = (pSum[j-1][i] + pSum[j][i]) > 0? (pSum[j-1][i] + pSum[j][i]) : 0;
                pSum[j][i] = sum > 0 ? sum : 0;
                if(sum>maxSum) {
                    maxSum = sum;
                }
            }
        }*//*

        return maxSum;
    }*/
}
