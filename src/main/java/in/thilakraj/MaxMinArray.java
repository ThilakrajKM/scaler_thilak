package in.thilakraj;

import java.util.Arrays;
import java.util.List;

/**
 * Q1. Max Min of an Array
 * Problem Description
 * Given an array A of size N. You need to find the sum of Maximum and Minimum element in the given array.
 * <p>
 * Problem Constraints
 * 1 <= N <= 10^5
 * -10^9 <= A[i] <= 10^9
 * <p>
 * Input Format
 * First argument A is an integer array.
 * <p>
 * Output Format
 * Return the sum of maximum and minimum element of the array
 */
public class MaxMinArray {

    public static void main(String[] args) {
        System.out.println("Max Min Array = " + solve(Arrays.asList(1, 2, 3, 2, 1)));
        System.out.println("Max Min Array = " + solve(Arrays.asList(1, 1, 10)));
    }

    public static int solve(List<Integer> A) {
        Integer min = A.get(0), max = A.get(0);

        for (int i = 1; i < A.size(); i++) {
            if (A.get(i) > max) {
                max = A.get(i);
            }
            if (A.get(i) < min) {
                min = A.get(i);
            }
        }

        return max + min;
    }
}
