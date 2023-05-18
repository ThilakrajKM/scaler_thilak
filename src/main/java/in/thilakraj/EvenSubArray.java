package in.thilakraj;

import java.util.Arrays;
import java.util.List;

/**
 * Problem Description
 * You are given an integer array A.
 * <p>
 * Decide whether it is possible to divide the array into one or more subarrays of even length such that the first and last element of all subarrays will be even.
 * <p>
 * Return "YES" if it is possible; otherwise, return "NO" (without quotes).
 * <p>
 * Problem Constraints
 * 1 <= |A|, A[i] <= 106
 * <p>
 * Input Format
 * The first and the only input argument is an integer array, A.
 * <p>
 * Output Format
 * Return a string "YES" or "NO" denoting the answer.
 * <p>
 * Example Input
 * Input 1:
 * <p>
 * A = [2, 4, 8, 6]
 * Input 2:
 * <p>
 * A = [2, 4, 8, 7, 6]
 * <p>
 * Example Output
 * Output 1: "YES"
 * Output 2: "NO"
 */
public class EvenSubArray {

    public static void main(String[] args) {
        System.out.println("Even Sub Array = " + solve(Arrays.asList(1, 2)));
        System.out.println("Even Sub Array = " + solve(Arrays.asList(6, 2)));
        System.out.println("Even Sub Array = " + solve(Arrays.asList(2, 3, 5, 7, 9, 10)));

    }

    public static String solve(List<Integer> A) {

        if (A.size() % 2 == 0 && A.get(0) % 2 == 0 && A.get(A.size() - 1) % 2 == 0) {
            return "YES";
        }
        return "NO";
    }
}
