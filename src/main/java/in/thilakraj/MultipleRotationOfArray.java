package in.thilakraj;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Problem Description
 * Given an array of integers A and multiple values in B, which represents the number of times array A needs to be left rotated.
 * <p>
 * Find the rotated array for each value and return the result in the from of a matrix where ith row represents the rotated array for the ith value in B.
 * <p>
 * <p>
 * <p>
 * Problem Constraints
 * 1 <= length of both arrays <= 2000 -10^9 <= A[i] <= 10^9 0 <= B[i] <= 2000
 * <p>
 * <p>
 * Input Format
 * The first argument given is the integer array A.
 * The second argument given is the integer array B.
 * <p>
 * <p>
 * Output Format
 * Return the resultant matrix.
 * <p>
 * <p>
 * Example Input
 * Input 1:
 * <p>
 * A = [1, 2, 3, 4, 5]
 * B = [2, 3]
 * <p>
 * Input 2:
 * <p>
 * <p>
 * A = [5, 17, 100, 11]
 * B = [1]
 * <p>
 * <p>
 * <p>
 * <p>
 * Example Output
 * Output 1:
 * <p>
 * [ [3, 4, 5, 1, 2]
 * [4, 5, 1, 2, 3] ]
 * <p>
 * <p>
 * Output 2:
 * <p>
 * <p>
 * [ [17, 100, 11, 5] ]
 * <p>
 * <p>
 * <p>
 * Example Explanation
 * for input 1 -> B[0] = 2 which requires 2 times left rotations
 * <p>
 * 1: [2, 3, 4, 5, 1]
 * <p>
 * 2: [3, 4, 5, 1, 2]
 * <p>
 * B[1] = 3 which requires 3 times left rotation
 * <p>
 * 1: [2, 3, 4, 5, 1]
 * <p>
 * 2: [3, 4, 5, 1, 2]
 * <p>
 * 2: [4, 5, 1, 2, 4]
 */
public class MultipleRotationOfArray {

    public static void main(String[] args) {
        System.out.println(" Ans : " + solve(Arrays.asList(1, 2, 3, 4, 5), Arrays.asList(2, 3)));
    }

    public static ArrayList<ArrayList<Integer>> solve(List<Integer> A, List<Integer> B) {

        ArrayList<ArrayList<Integer>> result = new ArrayList<>();

        int inputSize = A.size();
        for (int i = 0; i < B.size(); i++) {
            ArrayList<Integer> row = new ArrayList<>();
            int intRotationIndex = (B.get(i) % inputSize);
            for (int j = intRotationIndex; j < A.size(); j++) {
                row.add(A.get(j));
            }
            for (int j = 0; j < intRotationIndex; j++) {
                row.add(A.get(j));
            }
            result.add(row);
        }

        return result;
    }
}
