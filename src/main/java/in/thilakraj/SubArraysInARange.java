package in.thilakraj;

import java.util.ArrayList;

/**
 * Problem Description
 * Given an array A of length N, return the subarray from B to C.
 * <p>
 * <p>
 * Problem Constraints
 * 1 <= N <= 105
 * <p>
 * 1 <= A[i] <= 109
 * <p>
 * 0 <= B <= C < N
 * <p>
 * <p>
 * <p>
 * Input Format
 * The first argument A is an array of integers
 * <p>
 * The remaining argument B and C are integers.
 * <p>
 * <p>
 * <p>
 * Output Format
 * Return a subarray
 */
public class SubArraysInARange {

    public static void main(String[] args) {

    }

    public ArrayList<Integer> solve(ArrayList<Integer> A, int B, int C) {
        ArrayList<Integer> subarray = new ArrayList<>();

        for (int i = B; i <= C; i++) {
            subarray.add(A.get(i));
        }

        return subarray;
    }
}
