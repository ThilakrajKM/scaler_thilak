package in.thilakraj;

import java.util.HashMap;
import java.util.List;

/**
 * Problem Description
 * Given an Array of integers B, and a target sum A.
 * Check if there exists a pair (i,j) such that Bi + Bj = A and i!=j.
 * <p>
 * <p>
 * Problem Constraints
 * 1<= Length of array B <= 103
 * 0<= Bi <=109
 * 0<= A <=109
 * <p>
 * <p>
 * Input Format
 * First argument A is the Target sum, and second argument is the array B
 * <p>
 * <p>
 * Output Format
 * Return an integer value 1 if there exists such pair, else return 0.
 * <p>
 * <p>
 * Example Input
 * Input 1:
 * <p>
 * A = 8
 * B = [3, 5, 1, 2, 1, 2]
 * Input 2:
 * <p>
 * A = 21
 * B = [9, 10, 7, 10, 9, 1, 5, 1, 5]
 * <p>
 * <p>
 * Example Output
 * Output 1:
 * <p>
 * 1
 * Output 2:
 * <p>
 * 0
 * <p>
 * <p>
 * Example Explanation
 * Example 1:
 * It is possible to obtain sum 8 using 3 and 5.
 * Example 2:
 * There is no such pair exists.
 */
public class CheckPairSum {


    public static int solve(int A, List<Integer> B) {
        HashMap<Integer, Integer> numFreq = new HashMap<>();

        for (int i = 0; i < B.size(); i++) {
            if (numFreq.containsKey(B.get(i))) {
                numFreq.put(B.get(i), numFreq.get(B.get(i)) + 1);
            } else {
                numFreq.put(B.get(i), 1);
            }
        }

        for (int i = 0; i < B.size(); i++) {
            int diff = A - B.get(i);
            if (numFreq.containsKey(diff) &&
                    ((diff == B.get(i) && numFreq.get(diff) > 1) || (diff != B.get(i)))) {
                return 1;
            }
        }

        return 0;
    }
}
