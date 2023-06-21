package in.thilakraj;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * Problem Description
 * Given an one-dimensional unsorted array A containing N integers.
 * <p>
 * You are also given an integer B, find if there exists a pair of elements in the array whose difference is B.
 * <p>
 * Return 1 if any such pair exists else return 0.
 * <p>
 * <p>
 * <p>
 * Problem Constraints
 * 1 <= N <= 105
 * -103 <= A[i] <= 103
 * -105 <= B <= 105
 * <p>
 * <p>
 * Input Format
 * First argument is an integer array A of size N.
 * <p>
 * Second argument is an integer B.
 * <p>
 * <p>
 * <p>
 * Output Format
 * Return 1 if any such pair exists else return 0.
 * <p>
 * <p>
 * <p>
 * Example Input
 * Input 1:
 * <p>
 * A = [5, 10, 3, 2, 50, 80]
 * B = 78
 * Input 2:
 * <p>
 * A = [-10, 20]
 * B = 30
 * Input 2=3:
 * <p>
 * A = [-100, 20, 80]
 * B = 9
 * <p>
 * <p>
 * Example Output
 * Output 1:
 * <p>
 * 1
 * Output 2:
 * <p>
 * 1
 * Output 3:
 * <p>
 * 0
 * <p>
 * <p>
 * Example Explanation
 * Explanation 1:
 * <p>
 * Pair (80, 2) gives a difference of 78.
 * Explanation 2:
 * <p>
 * Pair (20, -10) gives a difference of 30 i.e 20 - (-10) => 20 + 10 => 30
 * Explanation 3:
 * <p>
 * There is no such pairs, that has a difference of 9.
 */
public class PairWithGivenDiffrence {

    public int solve(ArrayList<Integer> A, int B) {
        HashSet<Integer> numberSets = new HashSet<>(A);

        for (int i = 0; i < A.size(); i++) {
            int diff = A.get(i) - B;
            if (numberSets.contains(diff) && A.get(i) != diff) {
                return 1;
            }
        }

        return 0;
    }
}
