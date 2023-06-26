package in.thilakraj;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * Problem Description
 * Given an integer array A containing N distinct integers.
 * <p>
 * Find the number of unique pairs of integers in the array whose XOR is equal to B.
 * <p>
 * NOTE:
 * <p>
 * Pair (a, b) and (b, a) is considered to be the same and should be counted once.
 * <p>
 * <p>
 * Problem Constraints
 * 1 <= N <= 105
 * <p>
 * 1 <= A[i], B <= 107
 * <p>
 * <p>
 * <p>
 * Input Format
 * The first argument is an integer array A.
 * <p>
 * The second argument is an integer B.
 * <p>
 * <p>
 * <p>
 * Output Format
 * Return a single integer denoting the number of unique pairs of integers in the array A whose XOR is equal to B.
 * <p>
 * <p>
 * <p>
 * Example Input
 * Input 1:
 * <p>
 * A = [5, 4, 10, 15, 7, 6]
 * B = 5
 * Input 2:
 * <p>
 * A = [3, 6, 8, 10, 15, 50]
 * B = 5
 * <p>
 * <p>
 * Example Output
 * Output 1:
 * <p>
 * 1
 * Output 2:
 * <p>
 * 2
 * <p>
 * <p>
 * Example Explanation
 * Explanation 1:
 * <p>
 * (10 ^ 15) = 5
 * Explanation 2:
 * <p>
 * (3 ^ 6) = 5 and (10 ^ 15) = 5
 */
public class PairWithGivenXOR {
    public static void main(String[] args) {
        System.out.println("Ans : " + solve(Arrays.asList(3, 6, 8, 10, 15, 50), 5));
    }

    public static int solve(List<Integer> A, int B) {

        HashMap<Integer, Integer> numFreq = new HashMap<>();

        for (int i = 0; i < A.size(); i++) {
            if (numFreq.containsKey(A.get(i))) {
                numFreq.put(A.get(i), numFreq.get(A.get(i)) + 1);
            } else {
                numFreq.put(A.get(i), 1);
            }
        }

        int result = 0;
        for (int i = 0; i < A.size(); i++) {
            int xorNum = (B ^ A.get(i));
            if (numFreq.containsKey(xorNum) &&
                    ((xorNum == A.get(i) && numFreq.get(xorNum) > 1) || (xorNum != A.get(i)))) {
                result++;
            }
        }
        return result / 2;
    }
}
