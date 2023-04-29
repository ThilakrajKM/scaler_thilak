package in.thilakraj;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Problem Description
 * You are given an array A of integers of size N.
 * <p>
 * Your task is to find the equilibrium index of the given array
 * <p>
 * The equilibrium index of an array is an index such that the sum of elements at lower indexes is equal to the sum of elements at higher indexes.
 * <p>
 * If there are no elements that are at lower indexes or at higher indexes, then the corresponding sum of elements is considered as 0.
 * <p>
 * Note:
 * <p>
 * Array indexing starts from 0.
 * If there is no equilibrium index then return -1.
 * If there are more than one equilibrium indexes then return the minimum index.
 * <p>
 * Problem Constraints
 * 1 <= N <= 10^5
 * -10^5 <= A[i] <= 10^5
 * <p>
 * Input Format
 * First arugment is an array A .
 * <p>
 * Output Format
 * Return the equilibrium index of the given array. If no such index is found then return -1.
 * <p>
 * Example Input
 * Input 1:
 * A = [-7, 1, 5, 2, -4, 3, 0]
 * Input 2:
 * <p>
 * A = [1, 2, 3]
 * Example Output
 * Output 1:
 * 3
 * Output 2:
 * <p>
 * -1
 */
public class Equilibrium {

    public static void main(String[] args) {

        System.out.println("Equilibrium index = " + equilibrium(Arrays.asList(-7, 1, 5, 2, -4, 3, 0)));
    }

    private static int equilibrium(List<Integer> A) {

        List<Integer> prefixSum = new ArrayList<>();
        prefixSum.add(A.get(0));

        for (int i = 1; i < A.size(); i++) {
            prefixSum.add(prefixSum.get(i - 1) + A.get(i));
        }

        for (int i = 0; i < A.size(); i++) {

            int leftSum = i == 0 ? 0 : prefixSum.get(i - 1);
            int rightSum = i == A.size() - 1 ? 0 : prefixSum.get(A.size() - 1) - prefixSum.get(i);

            if (leftSum == rightSum) {
                return i;
            }
        }


        return -1;
    }
}
