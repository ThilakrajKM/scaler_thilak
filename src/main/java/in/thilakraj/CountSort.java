package in.thilakraj;

import java.util.ArrayList;

/**
 * Problem Description
 * Given an array A. Sort this array using Count Sort Algorithm and return the sorted array.
 * <p>
 * <p>
 * Problem Constraints
 * 1 <= |A| <= 10^5
 * 1 <= A[i] <= 10^5
 * <p>
 * <p>
 * Input Format
 * The first argument is an integer array A.
 * <p>
 * <p>
 * Output Format
 * Return an integer array that is the sorted array A.
 * <p>
 * <p>
 * Example Input
 * Input 1:
 * A = [1, 3, 1]
 * Input 2:
 * A = [4, 2, 1, 3]
 * <p>
 * <p>
 * Example Output
 * Output 1:
 * [1, 1, 3]
 * Output 2:
 * [1, 2, 3, 4]
 * <p>
 * <p>
 * Example Explanation
 * For Input 1:
 * The array in sorted order is [1, 1, 3].
 * For Input 2:
 * The array in sorted order is [1, 2, 3, 4].
 */
public class CountSort {

    public ArrayList<Integer> solve(ArrayList<Integer> A) {

        int[] freqArray = new int[100000];
        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < A.size(); i++) {
            freqArray[A.get(i)]++;
        }

        for (int i = 0; i < 100000; i++) {
            for (int j = 0; j < freqArray[i]; j++) {
                result.add(i);
            }
        }

        return result;
    }
}
