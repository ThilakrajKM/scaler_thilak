package in.thilakraj;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * Problem Description
 * You are given an array A of N elements. Sort the given array in increasing order of number of distinct factors of each element, i.e., element having the least number of factors should be the first to be displayed and the number having highest number of factors should be the last one. If 2 elements have same number of factors, then number with less value should come first.
 * <p>
 * Note: You cannot use any extra space
 * <p>
 * <p>
 * Problem Constraints
 * 1 <= N <= 104
 * 1 <= A[i] <= 104
 * <p>
 * <p>
 * Input Format
 * First argument A is an array of integers.
 * <p>
 * <p>
 * Output Format
 * Return an array of integers.
 * <p>
 * <p>
 * Example Input
 * Input 1:
 * A = [6, 8, 9]
 * Input 2:
 * A = [2, 4, 7]
 * <p>
 * <p>
 * Example Output
 * Output 1:
 * [9, 6, 8]
 * Output 2:
 * [2, 7, 4]
 * <p>
 * <p>
 * Example Explanation
 * For Input 1:
 * The number 9 has 3 factors, 6 has 4 factors and 8 has 4 factors.
 * For Input 2:
 * The number 2 has 2 factors, 7 has 2 factors and 4 has 3 factors.
 */
public class FactorsNumberBasedSort {

    public ArrayList<Integer> solve(ArrayList<Integer> A) {

        Comparator<Integer> factorComparator = (left, right) -> {

            int leftFactor = numberOfFactors(left);
            int rightFactor = numberOfFactors(right);

            int result = Integer.compare(leftFactor, rightFactor);

            if (result == 0) {
                result = left - right;
            }

            return result;
        };

        A.sort(factorComparator);

        return A;
    }

    public int numberOfFactors(Integer num) {
        int factorCount = 0;
        for (int i = 1; i * i <= num; i++) {
            if (num % i == 0) {
                if (i == num / i) {
                    factorCount++;
                } else {
                    factorCount += 2;
                }
            }
        }
        return factorCount;
    }

}
