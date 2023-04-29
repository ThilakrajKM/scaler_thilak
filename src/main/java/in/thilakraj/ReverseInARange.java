package in.thilakraj;

import java.util.Arrays;
import java.util.List;

/**
 * Q3. Reverse in a range
 * Problem Description
 * Given an array A of N integers. Also given are two integers B and C. Reverse the array A in the given range [B, C]
 * <p>
 * <p>
 * Problem Constraints
 * 1 <= N <= 10^5
 * 1 <= A[i] <= 10^9
 * 0 <= B <= C <= N - 1
 * <p>
 * Input Format
 * The first argument A is an array of integer.
 * The second and third arguments are integers B and C
 * <p>
 * Output Format
 * Return the array A after reversing in the given range.
 */
public class ReverseInARange {

    public static void main(String[] args) {
        System.out.println("Reverse in a range = " + solve(Arrays.asList(1, 2, 3, 4), 2, 3));
        System.out.println("Reverse in a range = " + solve(Arrays.asList(2, 5, 6), 0, 2));
    }

    public static List<Integer> solve(List<Integer> A, int B, int C) {

        for (int i = 0; B + i < C - i; i++) {
            int temp = A.get(B + i);
            A.set(B + i, A.get(C - i));
            A.set(C - i, temp);
        }

        return A;
    }
}
