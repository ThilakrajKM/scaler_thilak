package in.thilakraj;

import java.util.ArrayList;

/**
 * Problem Description
 * Given an integer array A of size N. You have to delete one element such that the GCD(Greatest common divisor) of the remaining array is maximum.
 * <p>
 * Find the maximum value of GCD.
 * <p>
 * <p>
 * <p>
 * Problem Constraints
 * 2 <= N <= 105
 * 1 <= A[i] <= 109
 * <p>
 * <p>
 * <p>
 * Input Format
 * First argument is an integer array A.
 * <p>
 * <p>
 * <p>
 * Output Format
 * Return an integer denoting the maximum value of GCD.
 * <p>
 * <p>
 * <p>
 * Example Input
 * Input 1:
 * <p>
 * A = [12, 15, 18]
 * Input 2:
 * <p>
 * A = [5, 15, 30]
 * <p>
 * <p>
 * Example Output
 * Output 1:
 * <p>
 * 6
 * Output 2:
 * <p>
 * 15
 * <p>
 * <p>
 * Example Explanation
 * Explanation 1:
 * <p>
 * If you delete 12, gcd will be 3.
 * If you delete 15, gcd will be 6.
 * If you delete 18, gcd will 3.
 * Maximum value of gcd is 6.
 * Explanation 2:
 * <p>
 * If you delete 5, gcd will be 15.
 * If you delete 15, gcd will be 5.
 * If you delete 30, gcd will be 5.
 * Maximum value of gcd is 15.
 */
public class DeleteOne_MaxGCDDelete {
    public int solve(ArrayList<Integer> A) {

        int[] prefixGCDArray = new int[A.size()];
        prefixGCDArray[0] = A.get(0);
        int[] suffixGCDArray = new int[A.size()];
        suffixGCDArray[A.size() - 1] = A.get(A.size() - 1);

        for (int i = 1; i < A.size(); i++) {
            prefixGCDArray[i] = gcd(prefixGCDArray[i - 1], A.get(i));
        }

        for (int i = A.size() - 2; i >= 0; i--) {
            suffixGCDArray[i] = gcd(suffixGCDArray[i + 1], A.get(i));
        }

        int ans = 0;
        for (int i = 0; i < A.size(); i++) {

            int leftGCD = i > 0 ? prefixGCDArray[i - 1] : 0;
            int rightGCD = i != A.size() - 1 ? suffixGCDArray[i + 1] : 0;

            int gcdVal = gcd(leftGCD, rightGCD);
            ans = Math.max(ans, gcdVal);
        }

        return ans;

    }

    int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}
