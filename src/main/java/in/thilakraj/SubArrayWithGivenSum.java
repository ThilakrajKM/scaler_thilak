package in.thilakraj;

import java.util.ArrayList;

/**
 * Problem Description
 * Given an array of positive integers A and an integer B, find and return first continuous subarray which adds to B.
 * <p>
 * If the answer does not exist return an array with a single integer "-1".
 * <p>
 * First sub-array means the sub-array for which starting index in minimum.
 * <p>
 * <p>
 * <p>
 * Problem Constraints
 * 1 <= length of the array <= 100000
 * 1 <= A[i] <= 109
 * 1 <= B <= 109
 * <p>
 * <p>
 * <p>
 * Input Format
 * The first argument given is the integer array A.
 * <p>
 * The second argument given is integer B.
 * <p>
 * <p>
 * <p>
 * Output Format
 * Return the first continuous sub-array which adds to B and if the answer does not exist return an array with a single integer "-1".
 * <p>
 * <p>
 * <p>
 * Example Input
 * Input 1:
 * <p>
 * A = [1, 2, 3, 4, 5]
 * B = 5
 * Input 2:
 * <p>
 * A = [5, 10, 20, 100, 105]
 * B = 110
 * <p>
 * <p>
 * Example Output
 * Output 1:
 * <p>
 * [2, 3]
 * Output 2:
 * <p>
 * [-1]
 * <p>
 * <p>
 * Example Explanation
 * Explanation 1:
 * <p>
 * [2, 3] sums up to 5.
 * Explanation 2:
 * <p>
 * No subarray sums up to required number.
 */

public class SubArrayWithGivenSum {

    public static void main(String[] args) {

    }

    public ArrayList<Integer> solve(ArrayList<Integer> A, int B) {

        int left = 0, right = 0, sum = A.get(0);

        while (right < A.size()) {
            if (sum == B) {
                ArrayList<Integer> val = new ArrayList<>();
                val.add(left + 1);
                val.add(right + 1);
                return val;
            } else if (sum > B) {
                sum -= A.get(left);
                left++;
            } else {
                right++;
                if (right == A.size()) {
                    break;
                }
                sum += A.get(right);
            }


        }

        ArrayList<Integer> val = new ArrayList<>();
        val.add(-1);
        return val;

    }
}
