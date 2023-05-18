package in.thilakraj;

import java.util.Arrays;
import java.util.List;

/**
 * Subarray with given sum and length
 * Problem Description
 * Given an array A of length N. Also given are integers B and C.
 * <p>
 * Return 1 if there exists a subarray with length B having sum C and 0 otherwise
 * Problem Constraints
 * 1 <= N <= 105
 * <p>
 * 1 <= A[i] <= 10^4
 * <p>
 * 1 <= B <= N
 * <p>
 * 1 <= C <= 10^9
 * <p>
 * Input Format
 * First argument A is an array of integers.
 * <p>
 * The remaining arguments B and C are integers
 * Output Format
 * Return 1 if such a subarray exist and 0 otherwise
 * <p>
 * Example Input
 * Input 1:
 * A = [4, 3, 2, 6, 1]
 * B = 3
 * C = 11
 * Input 2:
 * <p>
 * A = [4, 2, 2, 5, 1]
 * B = 4
 * C = 6
 * <p>
 * <p>
 * Example Output
 * Output 1:
 * 1
 * Output 2:
 * <p>
 * 0
 */
public class SubArrayWithLengthSum {

    public static void main(String[] args) {
        System.out.println("Ans = " + solve(Arrays.asList(4, 3, 2, 6, 1), 3, 11));
        System.out.println("Ans = " + solve(Arrays.asList(6, 4, 9, 5, 6, 1, 9), 7, 9));
    }

    public static int solve(List<Integer> A, int B, int C) {

        int initSum = 0;

        for (int i = 0; i < B; i++) {
            initSum += A.get(i);
        }

        if (initSum == C) {
            return 1;
        }

        for (int i = 1; i < A.size() - B; i++) {
            initSum = initSum - A.get(i - 1) + A.get(B + i - 1);
            if (initSum == C) {
                return 1;
            }
        }

        return 0;
    }
}
