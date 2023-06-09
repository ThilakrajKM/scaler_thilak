package in.thilakraj;

import java.util.Arrays;
import java.util.List;

/**
 * Q3. Second Largest
 * <p>
 * Problem Description
 * You are given an integer array A. You have to find the second largest element/value in the array
 * or report that no such element exists.
 * <p>
 * Problem Constraints
 * 1 <= |A| <= 10^5
 * 0 <= A[i] <= 10^9
 * <p>
 * Input Format
 * The first argument is an integer array A.
 * <p>
 * Output Format
 * Return the second-largest element. If no such element exist then return -1.
 * <p>
 * <p>
 * Example Input
 * Input 1:
 * <p>
 * A = [2, 1, 2]
 * Input 2:
 * <p>
 * A = [2]
 * <p>
 * Example Output
 * Output 1:
 * <p>
 * 1
 * Output 2:
 * <p>
 * -1
 */
public class SecondLargest {

    public static void main(String[] args) {
        System.out.println("Second Largest Array = " + solve(Arrays.asList(1, 2, 3, 2, 1)));
        System.out.println("Second Largest Array = " + solve(Arrays.asList(1, 1, 10)));
        System.out.println("Second Largest Array = " + solve(List.of(2)));
    }

    public static int solve(List<Integer> A) {
        int max = A.get(0), secondMax = -1;

        for (int i = 1; i < A.size(); i++) {
            if (A.get(i) < max && A.get(i) > secondMax) {
                secondMax = A.get(i);
            }

            if (A.get(i) > max) {
                secondMax = max;
                max = A.get(i);
            }
        }

        return max == secondMax ? -1 : secondMax;
    }
}

