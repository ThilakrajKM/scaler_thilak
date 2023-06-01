package in.thilakraj;

import java.util.Arrays;
import java.util.List;

/**
 * Subarray with least average
 * Problem Description
 * Given an array of size N, find the subarray of size K with the least average.
 * Problem Constraints
 * 1<=k<=N<=1e5
 * -1e5<=A[i]<=1e5
 * Input Format
 * First argument contains an array A of integers of size N.
 * Second argument contains integer k.
 * Output Format
 * Return the index of the first element of the subarray of size k that has least average.
 * Array indexing starts from 0.
 * <p>
 * Example Input
 * Input 1:
 * A=[3, 7, 90, 20, 10, 50, 40]
 * B=3
 * Input 2:
 * <p>
 * A=[3, 7, 5, 20, -10, 0, 12]
 * B=2
 * <p>
 * Example Output
 * Output 1:
 * 3
 * Output 2:
 * <p>
 * 4
 */
public class SubArrayLeastAverage {

    public static void main(String[] args) {
        //System.out.println("Ans = " + solve(Arrays.asList(15,7,11,7,9,8,18,1,16,18,6,1,1,4,18), 6));
        System.out.println("Ans = " + solve(Arrays.asList(15, 3, 15, 6, 9, 14, 8, 10, 9, 17), 1));
    }

    public static int solve(List<Integer> A, int B) {

        int minSum = 0;
        int minIndex = 0;
        int sum;

        for (int i = 0; i < B; i++) {
            minSum += A.get(i);
        }

        sum = minSum;

        for (int i = 1; B + i - 1 < A.size(); i++) {
            sum = sum - A.get(i - 1) + A.get(B + i - 1);
            if (minSum > sum) {
                minSum = sum;
                minIndex = i;
            }
        }

        return minIndex;
    }
}
