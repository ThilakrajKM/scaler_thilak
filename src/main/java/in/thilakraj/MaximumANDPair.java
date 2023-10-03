package in.thilakraj;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Q2. Maximum AND Pair
 * Unsolved
 * feature icon
 * Using hints is now penalty free
 * Use Hint
 * Problem Description
 * Given an array A. For every pair of indices i and j (i != j), find the maximum A[i] & A[j].
 * <p>
 * <p>
 * Problem Constraints
 * 1 <= len(A) <= 105
 * 1 <= A[i] <= 109
 * <p>
 * <p>
 * Input Format
 * The first argument is an integer array A.
 * <p>
 * <p>
 * Output Format
 * Return a single integer that is the maximum A[i] & A[j].
 * <p>
 * <p>
 * Example Input
 * Input 1:-
 * A = [53, 39, 88]
 * Input 2:-
 * A = [38, 44, 84, 12]
 * <p>
 * <p>
 * Example Output
 * Output 1:-
 * 37
 * Output 2:-
 * 36
 * <p>
 * <p>
 * Example Explanation
 * Explanation 1:-
 * 53 & 39 = 37
 * 39 & 88 = 0
 * 53 & 88 = 16
 * Maximum among all these pairs is 37
 * Explanation 2:-
 * Maximum bitwise and among all pairs is (38, 44) = 36
 */
public class MaximumANDPair {

    public static void main(String[] args) {
        System.out.println(solveBetterSoln(Arrays.asList(13, 18, 23, 56, 81, 20, 4, 24, 93)));
    }

    public static int solveBetterSoln(List<Integer> A) {

        int result = 0;

        for (int i = 31; i >= 0; i--) {

            int count = 0, cValue = (result | (1 << i));

            for (int j = 0; j < A.size(); j++) {
                if ((A.get(j) & cValue) == cValue) {
                    count++;
                }
            }

            if (count >= 2) {
                result = cValue;
            }
        }

        return result;
    }


    public int solve(ArrayList<Integer> A) {

        int result = 0;

        for (int i = 0; i < A.size() - 1; i++) {
            for (int j = i + 1; j < A.size(); i++) {
                int val = A.get(i) & A.get(j);
                if (result < val) {
                    result = val;
                }
            }
        }

        return result;
    }
}
