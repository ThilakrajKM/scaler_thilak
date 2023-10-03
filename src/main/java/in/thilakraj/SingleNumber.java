package in.thilakraj;

/**
 * Q3. Single Number
 * Solved
 * feature icon
 * Using hints is now penalty free
 * Use Hint
 * Problem Description
 * Given an array of integers A, every element appears twice except for one. Find that integer that occurs once.
 * <p>
 * NOTE: Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
 * <p>
 * <p>
 * <p>
 * Problem Constraints
 * 1 <= |A| <= 2000000
 * <p>
 * 0 <= A[i] <= INTMAX
 * <p>
 * <p>
 * <p>
 * Input Format
 * The first and only argument of input contains an integer array A.
 * <p>
 * <p>
 * <p>
 * Output Format
 * Return a single integer denoting the single element.
 * <p>
 * <p>
 * <p>
 * Example Input
 * Input 1:
 * <p>
 * A = [1, 2, 2, 3, 1]
 * Input 2:
 * <p>
 * A = [1, 2, 2]
 * <p>
 * <p>
 * Example Output
 * Output 1:
 * <p>
 * 3
 * Output 2:
 * <p>
 * 1
 * <p>
 * <p>
 * Example Explanation
 * Explanation 1:
 * <p>
 * 3 occurs once.
 * Explanation 2:
 * <p>
 * 1 occurs once.
 */

import java.util.Arrays;
import java.util.List;

public class SingleNumber {

    public static void main(String[] args) {
        System.out.println("Ans = " + singleNumber(Arrays.asList(1, 5, 6, 6, 2, 1, 5)));
    }

    public static int singleNumber(final List<Integer> A) {

        int result = 0;

        for (int i = 0; i < A.size(); i++) {

            result = A.get(i) ^ result;
        }

        return result;

    }

}
