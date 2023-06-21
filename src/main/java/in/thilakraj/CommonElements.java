package in.thilakraj;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Problem Description
 * Given two integer arrays, A and B of size N and M, respectively. Your task is to find all the common elements in both the array.
 * <p>
 * NOTE:
 * <p>
 * Each element in the result should appear as many times as it appears in both arrays.
 * The result can be in any order.
 * <p>
 * <p>
 * Problem Constraints
 * 1 <= N, M <= 105
 * <p>
 * 1 <= A[i] <= 109
 * <p>
 * <p>
 * <p>
 * Input Format
 * First argument is an integer array A of size N.
 * <p>
 * Second argument is an integer array B of size M.
 * <p>
 * <p>
 * <p>
 * Output Format
 * Return an integer array denoting the common elements.
 * <p>
 * <p>
 * <p>
 * Example Input
 * Input 1:
 * <p>
 * A = [1, 2, 2, 1]
 * B = [2, 3, 1, 2]
 * Input 2:
 * <p>
 * A = [2, 1, 4, 10]
 * B = [3, 6, 2, 10, 10]
 * <p>
 * <p>
 * Example Output
 * Output 1:
 * <p>
 * [1, 2, 2]
 * Output 2:
 * <p>
 * [2, 10]
 * <p>
 * <p>
 * Example Explanation
 * Explanation 1:
 * <p>
 * Elements (1, 2, 2) appears in both the array. Note 2 appears twice in both the array.
 * Explantion 2:
 * <p>
 * Elements (2, 10) appears in both the array.
 */
public class CommonElements {

    public ArrayList<Integer> solve(ArrayList<Integer> A, ArrayList<Integer> B) {

        Map<Integer, Integer> numFreq = new HashMap<>();
        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < A.size(); i++) {
            if (numFreq.containsKey(A.get(i))) {
                Integer freq = numFreq.get(A.get(i));
                numFreq.put(A.get(i), ++freq);
            } else {
                numFreq.put(A.get(i), 0);
            }
        }

        for (int i = 0; i < B.size(); i++) {
            if (numFreq.containsKey(B.get(i)) && numFreq.get(B.get(i)) > 0) {
                result.add(B.get(i));
                Integer freq = numFreq.get(B.get(i));
                numFreq.put(B.get(i), --freq);
            }

        }

        return result;
    }
}
