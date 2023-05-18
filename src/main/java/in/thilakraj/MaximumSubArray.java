package in.thilakraj;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Problem Description
 * You are given an integer array C of size A. Now you need to find a subarray (contiguous elements) so that the sum of contiguous elements is maximum.
 * But the sum must not exceed B.
 * Problem Constraints
 * 1 <= A <= 10^3
 * 1 <= B <= 10^9
 * 1 <= C[i] <= 10^6
 * <p>
 * <p>
 * Input Format
 * The first argument is the integer A.
 * The second argument is the integer B.
 * The third argument is the integer array C.
 * <p>
 * <p>
 * Output Format
 * Return a single integer which denotes the maximum sum.
 * <p>
 * Example Input
 * Input 1:
 * A = 5
 * B = 12
 * C = [2, 1, 3, 4, 5]
 * Input 2:
 * <p>
 * A = 3
 * B = 1
 * C = [2, 2, 2]
 * <p>
 * <p>
 * Run a for loop for i [0, N]
 * Add arr[i] * (i+1) * (N-i) into the answer at each iteration
 */
public class MaximumSubArray {

    public static void main(String[] args) {
        System.out.println("max Sub Array = " + maxSubarray(1, 75, List.of(4)));
        System.out.println("max Sub Array = " + maxSubarray(4, 11, Arrays.asList(7, 10, 3, 1)));
    }

    public static int maxSubarray(int A, int B, List<Integer> C) {
        int result = 0;

        ArrayList<Integer> prefixSum = new ArrayList<>();
        for (int i = 0; i < C.size(); i++) {
            prefixSum.add(C.get(i) + ((i == 0) ? 0 : prefixSum.get(i - 1)));
        }

        for (int i = 0; i < C.size(); i++) {
            for (int j = i; j < C.size(); j++) {
                if (i == 0) {
                    if (B >= prefixSum.get(j) && prefixSum.get(j) > result) {
                        result = prefixSum.get(j);
                    }
                } else if (B >= (prefixSum.get(j) - prefixSum.get(i - 1)) && (prefixSum.get(j) - prefixSum.get(i - 1)) > result) {
                    result = (prefixSum.get(j) - prefixSum.get(i - 1));
                }
            }
        }

        return result;
    }
}
