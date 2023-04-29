package in.thilakraj;

import java.util.Arrays;
import java.util.List;

/**
 * Linear Search - Multiple Occurences
 * <p>
 * Problem Description
 * <p>
 * Given an array A and an integer B, find the number of occurrences of B in A.
 * <p>
 * Problem Constraints
 * <p>
 * 1 <= B, Ai <= 10^9
 * 1 <= |A| <= 10^5
 * <p>
 * Input Format
 * <p>
 * Given an integer array A and an integer B.
 * <p>
 * Output Format
 * <p>
 * Return an integer, number of occurrences of B in A.
 */
public class LinearSearchMultipleOccurrence {

    public static void main(String[] args) {
        System.out.println("Max Min Array = " + solve(Arrays.asList(1, 2, 3, 2, 1), 2));
        System.out.println("Max Min Array = " + solve(Arrays.asList(1, 1, 10), 11));
    }

    public static int solve(List<Integer> A, int B) {
        int count = 0;

        for (int i = 0; i < A.size(); i++) {
            if (A.get(i) == B) {
                count++;
            }
        }

        return count++;
    }
}
