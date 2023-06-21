package in.thilakraj;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * Problem Description
 * You are given an array of N integers, A1, A2 ,..., AN and an integer B. Return the of count of distinct numbers in all windows of size B.
 * <p>
 * Formally, return an array of size N-B+1 where i'th element in this array contains number of distinct elements in sequence Ai, Ai+1 ,..., Ai+B-1.
 * <p>
 * NOTE: if B > N, return an empty array.
 * <p>
 * <p>
 * <p>
 * Problem Constraints
 * 1 <= N <= 106
 * <p>
 * 1 <= A[i] <= 109
 * <p>
 * <p>
 * Input Format
 * First argument is an integer array A
 * Second argument is an integer B.
 * <p>
 * <p>
 * <p>
 * Output Format
 * Return an integer array.
 * <p>
 * <p>
 * <p>
 * Example Input
 * Input 1:
 * <p>
 * A = [1, 2, 1, 3, 4, 3]
 * B = 3
 * Input 2:
 * <p>
 * A = [1, 1, 2, 2]
 * B = 1
 * <p>
 * <p>
 * Example Output
 * Output 1:
 * <p>
 * [2, 3, 3, 2]
 * Output 2:
 * <p>
 * [1, 1, 1, 1]
 * <p>
 * <p>
 * Example Explanation
 * Explanation 1:
 * <p>
 * A=[1, 2, 1, 3, 4, 3] and B = 3
 * All windows of size B are
 * [1, 2, 1]
 * [2, 1, 3]
 * [1, 3, 4]
 * [3, 4, 3]
 * So, we return an array [2, 3, 3, 2].
 * Explanation 2:
 * <p>
 * Window size is 1, so the output array is [1, 1, 1, 1].
 */
public class DistinctNumberInAWindow {

    public static void main(String[] args) {
        //System.out.println("Ans : " + dNums(Arrays.asList(1,2,1,3,4,3), 3));
        System.out.println("Ans : " + dNums(Arrays.asList(98, 83, 98, 83, 98, 98, 59, 80, 16, 59, 59, 59), 5));
    }

    public static ArrayList<Integer> dNums(List<Integer> A, int B) {
        ArrayList<Integer> results = new ArrayList<>();
        HashMap<Integer, Integer> dElements = new HashMap<>();

        for (int i = 0; i < B; i++) {
            if (dElements.containsKey(A.get(i))) {
                dElements.put(A.get(i), dElements.get(A.get(i)) + 1);
            } else {
                dElements.put(A.get(i), 1);
            }
        }

        int freq = dElements.size();
        results.add(freq);

        for (int i = B; i < A.size(); i++) {

            if (dElements.containsKey(A.get(i - B))) {
                int numFreq = dElements.get(A.get(i - B)) - 1;
                dElements.put(A.get(i - B), numFreq);
                if (numFreq == 0) {
                    freq--;
                }
            }

            if (dElements.containsKey(A.get(i))) {
                int numFreq = dElements.get(A.get(i));
                if (numFreq == 0) {
                    freq++;
                    dElements.put(A.get(i), 1);
                } else {
                    dElements.put(A.get(i), numFreq + 1);
                }
            } else {
                freq++;
                dElements.put(A.get(i), 1);
            }

            results.add(freq);
        }

        return results;
    }

}
