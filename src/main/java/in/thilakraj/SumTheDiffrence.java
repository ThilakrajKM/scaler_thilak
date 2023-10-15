package in.thilakraj;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Problem Description
 * Given an integer array, A of size N.
 * You have to find all possible non-empty subsequences of the array of numbers and then,
 * for each subsequence, find the difference between the largest and smallest number in that subsequence.
 * Then add up all the differences to get the number.
 * <p>
 * As the number may be large, output the number modulo 1e9 + 7 (1000000007).
 * <p>
 * NOTE: Subsequence can be non-contiguous.
 * <p>
 * <p>
 * <p>
 * Problem Constraints
 * 1 <= N <= 10000
 * <p>
 * 1<= A[i] <=1000
 * <p>
 * <p>
 * <p>
 * Input Format
 * First argument is an integer array A.
 * <p>
 * <p>
 * <p>
 * Output Format
 * Return an integer denoting the output.
 * <p>
 * <p>
 * <p>
 * Example Input
 * Input 1:
 * <p>
 * A = [1, 2]
 * Input 2:
 * <p>
 * A = [3, 5, 10]
 * <p>
 * <p>
 * Example Output
 * Output 1:
 * <p>
 * 1
 * Output 2:
 * <p>
 * 21
 * <p>
 * <p>
 * Example Explanation
 * Explanation 1:
 * <p>
 * All possible non-empty subsets are:
 * [1]     largest-smallest = 1 - 1 = 0
 * [2]     largest-smallest = 2 - 2 = 0
 * [1, 2]  largest-smallest = 2 - 1 = 1
 * Sum of the differences = 0 + 0 + 1 = 1
 * So, the resultant number is 1
 * Explanation 2:
 * <p>
 * All possible non-empty subsets are:
 * [3]         largest-smallest = 3 - 3 = 0
 * [5]         largest-smallest = 5 - 5 = 0
 * [10]        largest-smallest = 10 - 10 = 0
 * [3, 5]      largest-smallest = 5 - 3 = 2
 * [3, 10]     largest-smallest = 10 - 3 = 7
 * [5, 10]     largest-smallest = 10 - 5 = 5
 * [3, 5, 10]  largest-smallest = 10 - 3 = 7
 * Sum of the differences = 0 + 0 + 0 + 2 + 7 + 5 + 7 = 21
 * So, the resultant number is 21
 **/

public class SumTheDiffrence {
    public static void main(String[] args) {

    }

    public int solve(ArrayList<Integer> A) {
        int mod = 1000000007;
        int n = A.size();
        long maxSumResult = 0;
        long minSumResult = 0;

        Collections.sort(A);

        for (int i = 0; i < A.size(); i++) {
            maxSumResult = (maxSumResult % mod + (A.get(i) * power(2, i, mod)) % mod) % mod;
            minSumResult = (minSumResult % mod + (A.get(i) * power(2, n - i - 1, mod)) % mod) % mod;
        }


        return (int) (maxSumResult - minSumResult + mod) % mod;
    }

    long power(int a, long b, int mod) {
        if (b == 0) {
            return 1L;
        }
        long p = power(a, b / 2, mod) % mod;
        p = (p * p) % mod;
        if (b % 2 == 0) {
            return p;
        } else {
            return (a * p) % mod;
        }
    }
}
