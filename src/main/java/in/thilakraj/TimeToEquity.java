package in.thilakraj;

import java.util.Arrays;
import java.util.List;

/**
 * Time to equality
 * <p>
 * Problem Description
 * Given an integer array A of size N. In one second, you can increase the value of one element by 1.
 * <p>
 * Find the minimum time in seconds to make all elements of the array equal.
 * <p>
 * Problem Constraints
 * 1 <= N <= 1000000
 * 1 <= A[i] <= 1000
 * <p>
 * Input Format
 * First argument is an integer array A.
 * <p>
 * Output Format
 * Return an integer denoting the minimum time to make all elements equal.
 * <p>
 * Example Input
 * A = [2, 4, 1, 3, 2]
 * <p>
 * Example Output
 * 8
 * <p>
 * Example Explanation
 * We can change the array A = [4, 4, 4, 4, 4]. The time required will be 8 seconds.
 */
public class TimeToEquity {

    public static void main(String[] args) {
        System.out.println("Second Largest Array = " + solve(Arrays.asList(1, 2, 3, 4, 2)));
        System.out.println("Second Largest Array = " + solve(Arrays.asList(1, 1, 10)));
        System.out.println("Second Largest Array = " + solve(List.of(2)));
    }

    public static int solve(List<Integer> A) {

        int timeToEquity = 0;
        int max = A.get(0);

        for (int i = 1; i < A.size(); i++) {
            if (A.get(i) > max) {
                max = A.get(i);
            }
        }

        for (int i = 0; i < A.size(); i++) {
            timeToEquity = timeToEquity + (max == A.get(i) ? 0 : max - A.get(i));
        }

        return timeToEquity;
    }
}
