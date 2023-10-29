package in.thilakraj;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Problem Description
 * Given two arrays of integers A and B of size N each, where each pair (A[i], B[i]) for 0 <= i < N represents a unique point (x, y) in 2D Cartesian plane.
 * <p>
 * Find and return the number of unordered triplets (i, j, k) such that (A[i], B[i]), (A[j], B[j]) and (A[k], B[k]) form a right-angled triangle with the triangle having one side parallel to the x-axis and one side parallel to the y-axis.
 * <p>
 * NOTE: The answer may be large so return the answer modulo (109 + 7).
 * <p>
 * <p>
 * <p>
 * Problem Constraints
 * 1 <= N <= 105
 * <p>
 * 0 <= A[i], B[i] <= 109
 * <p>
 * <p>
 * <p>
 * Input Format
 * The first argument given is an integer array A.
 * The second argument given is the integer array B.
 * <p>
 * <p>
 * <p>
 * Output Format
 * Return the number of unordered triplets that form a right angled triangle modulo (109 + 7).
 * <p>
 * <p>
 * <p>
 * Example Input
 * Input 1:
 * <p>
 * A = [1, 1, 2]
 * B = [1, 2, 1]
 * Input 2:
 * <p>
 * A = [1, 1, 2, 3, 3]
 * B = [1, 2, 1, 2, 1]
 * <p>
 * <p>
 * Example Output
 * Output 1:
 * <p>
 * 1
 * Output 2:
 * <p>
 * 6
 * <p>
 * <p>
 * Example Explanation
 * Explanation 1:
 * <p>
 * All three points make a right angled triangle. So return 1.
 * Explanation 2:
 * <p>
 * 6 triplets which make a right angled triangle are:    (1, 1), (1, 2), (2, 1)
 * (1, 1), (3, 1), (1, 2)
 * (1, 1), (3, 1), (3, 2)
 * (2, 1), (3, 1), (3, 2)
 * (1, 1), (1, 2), (3, 2)
 * (1, 2), (3, 1), (3, 2)
 */

public class CountRightTriangles {

    public int solve(ArrayList<Integer> A, ArrayList<Integer> B) {
        HashMap<Integer, Integer> hm1 = new HashMap<>();
        HashMap<Integer, Integer> hm2 = new HashMap<>();

        int mod = (int) 1e9 + 7;
        int count = 0;

        for (int i = 0; i < A.size(); i++) {
            hm1.put(A.get(i), hm1.getOrDefault(A.get(i), 0) + 1);
            hm2.put(B.get(i), hm2.getOrDefault(B.get(i), 0) + 1);
        }
        for (int i = 0; i < A.size(); i++) {
            count += (hm1.get(A.get(i)) - 1) * (hm2.get(B.get(i)) - 1);
        }
        return count % mod;
    }
}
