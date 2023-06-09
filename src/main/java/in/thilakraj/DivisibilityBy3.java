package in.thilakraj;

import java.util.ArrayList;

/**
 * Problem Description
 * Given a number in the form of an array A of size N. Each of the digits of the number is represented by A[i]. Check if the number is divisible by 3.
 * <p>
 * <p>
 * Problem Constraints
 * 1 <= N <= 105
 * <p>
 * 0 <= A[i] <= 9
 * <p>
 * A[1] ≠ 0
 * <p>
 * <p>
 * <p>
 * Input Format
 * Given an integer array representing the number
 * <p>
 * <p>
 * <p>
 * Output Format
 * Return 1 if the number is divisible by 3 and return 0 otherwise.
 * <p>
 * <p>
 * <p>
 * Example Input
 * Input 1:
 * A = [1, 2, 3]
 * Input 2:
 * A = [1, 0, 0, 1, 2]
 * <p>
 * <p>
 * Example Output
 * Output 1:
 * 1
 * Output 2:
 * 0
 * <p>
 * <p>
 * Example Explanation
 * For Input 1:
 * The number 123 is divisible by 3.
 * For Input 2:
 * The number 10012 is not divisible by 3.
 */
public class DivisibilityBy3 {

    public static void main(String[] args) {

    }

    public int solve(ArrayList<Integer> A) {
        int sumOfDigits = 0;
        for (int i = 0; i < A.size(); i++) {
            sumOfDigits += A.get(i);
        }
        return sumOfDigits % 3;
    }
}
