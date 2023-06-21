package in.thilakraj;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Problem Description
 * Given an integer array A of size N, find the first repeating element in it.
 * <p>
 * We need to find the element that occurs more than once and whose index of the first occurrence is the smallest.
 * <p>
 * If there is no repeating element, return -1.
 * <p>
 * <p>
 * <p>
 * Problem Constraints
 * 1 <= N <= 105
 * <p>
 * 1 <= A[i] <= 109
 * <p>
 * <p>
 * <p>
 * Input Format
 * The first and only argument is an integer array A of size N.
 * <p>
 * <p>
 * <p>
 * Output Format
 * Return an integer denoting the first repeating element.
 * <p>
 * <p>
 * <p>
 * Example Input
 * Input 1:
 * <p>
 * A = [10, 5, 3, 4, 3, 5, 6]
 * Input 2:
 * <p>
 * A = [6, 10, 5, 4, 9, 120]
 * <p>
 * <p>
 * Example Output
 * Output 1:
 * <p>
 * 5
 * Output 2:
 * <p>
 * -1
 * <p>
 * <p>
 * Example Explanation
 * Explanation 1:
 * <p>
 * 5 is the first element that repeats
 * Explanation 2:
 * <p>
 * There is no repeating element, output -1
 */
public class FirstRepeatingElement {
    public int solve(ArrayList<Integer> A) {
        int num = -1, minIndex = A.size();
        Map<Integer, Integer> numFreq = new HashMap<>();
        for (int i = 0; i < A.size(); i++) {
            if (numFreq.containsKey(A.get(i))) {
                if (minIndex > numFreq.get(A.get(i))) {
                    minIndex = numFreq.get(A.get(i));
                    num = A.get(i);
                }
            } else {
                numFreq.put(A.get(i), i);
            }
        }
        return num;
    }
}
