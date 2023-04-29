package in.thilakraj;

import java.util.Arrays;
import java.util.List;

/**
 * Count of elements
 * Problem Description
 * Given an array A of N integers. Count the number of elements that have at least 1 elements
 * greater than itself.
 * <p>
 * Problem Constraints
 * 1 <= N <= 10^5
 * 1 <= A[i] <= 10^9
 * <p>
 * Input Format
 * First and only argument is an array of integers A.
 * Output Format
 * Return the count of elements.
 */
public class CountOfElements {


    public static void main(String[] args) {

        System.out.println("Count of Max Elements = " + solve(Arrays.asList(3, 2, 1)));
        System.out.println("Count of max Elements = " + solve(Arrays.asList(5, 5, 3)));
    }

    public static int solve(List<Integer> A) {
        int freq = 0, max = 0;

        for (int i = 0; i < A.size(); i++) {
            if (max < A.get(i)) {
                max = A.get(i);
                freq = 1;
            } else if (max == A.get(i)) {
                freq++;
            }
        }

        return A.size() - freq;
    }
}
