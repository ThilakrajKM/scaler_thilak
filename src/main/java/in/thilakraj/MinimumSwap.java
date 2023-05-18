package in.thilakraj;

import java.util.Arrays;
import java.util.List;

/**
 * Problem Description
 * <p>
 * Given an array of integers A and an integer B, find and return the minimum number of swaps required to bring all the numbers less than or equal to B together.
 * <p>
 * Note: It is possible to swap any two elements, not necessarily consecutive.
 * Problem Constraints
 * <p>
 * 1 <= length of the array <= 100000
 * -109 <= A[i], B <= 109
 * <p>
 * <p>
 * <p>
 * Input Format
 * <p>
 * The first argument given is the integer array A.
 * The second argument given is the integer B.
 * <p>
 * <p>
 * <p>
 * Output Format
 * <p>
 * Return the minimum number of swaps.
 * <p>
 * <p>
 * <p>
 * Example Input
 * <p>
 * Input 1:
 * <p>
 * A = [1, 12, 10, 3, 14, 10, 5]
 * B = 8
 * Input 2:
 * <p>
 * A = [5, 17, 100, 11]
 * B = 20
 * <p>
 * <p>
 * Example Output
 * <p>
 * Output 1:
 * <p>
 * 2
 * Output 2:
 * <p>
 * 1
 */
public class MinimumSwap {

    public static void main(String[] args) {
        System.out.println("min swap = " + minSwap(Arrays.asList(7, 10, 3, 1), 1));
    }

    public static int minSwap(List<Integer> A, int B) {

        int itemsLessThanB = 0;
        int badElements = 0;
        int minSwap = Integer.MAX_VALUE;

        for (int i = 0; i < A.size(); i++) {
            if (A.get(i) <= B) {
                itemsLessThanB++;
            }
        }

        if (itemsLessThanB == 1 || itemsLessThanB == A.size()) {
            return 0;
        }

        for (int i = 0; i < itemsLessThanB; i++) {
            if (A.get(i) > B) {
                badElements++;
            }
        }

        if (minSwap > badElements) {
            minSwap = badElements;
        }

        for (int i = 1; i < A.size() - itemsLessThanB; i++) {

            if (A.get(i - 1) > B) {
                badElements--;
            }

            if (A.get(itemsLessThanB + i - 1) > B) {
                badElements++;
            }

            if (minSwap > badElements) {
                minSwap = badElements;
            }
        }

        return minSwap;
    }
}
