package in.thilakraj;

import java.util.ArrayList;
import java.util.List;

/**
 * Problem Description
 * Given two sorted integer arrays A and B, merge B and A as one sorted array and return it as an output.
 * <p>
 * Note: A linear time complexity is expected and you should avoid use of any library function.
 * <p>
 * <p>
 * Problem Constraints
 * -2×109 <= A[i], B[i] <= 2×109
 * 1 <= |A|, |B| <= 5×104
 * <p>
 * <p>
 * Input Format
 * First Argument is a 1-D array representing  A.
 * Second Argument is also a 1-D array representing B.
 * <p>
 * <p>
 * Output Format
 * Return a 1-D vector which you got after merging A and B.
 * <p>
 * <p>
 * Example Input
 * Input 1:
 * <p>
 * A = [4, 7, 9]
 * B = [2, 11, 19]
 * Input 2:
 * <p>
 * A = [1]
 * B = [2]
 * <p>
 * <p>
 * Example Output
 * Output 1:
 * <p>
 * [2, 4, 7, 9, 11, 19]
 * Output 2:
 * <p>
 * [1, 2]
 */

public class MergeTwoSortedArray {

    public static void main(String[] args) {

    }

    public ArrayList<Integer> solve(final List<Integer> A, final List<Integer> B) {

        ArrayList<Integer> result = new ArrayList<>();
        int pointA = 0, pointB = 0;

        while (pointA < A.size() && pointB < B.size()) {
            if (A.get(pointA) < B.get(pointB)) {
                result.add(A.get(pointA));
                pointA++;
            } else {
                result.add(B.get(pointB));
                pointB++;
            }
        }

        while (pointA < A.size()) {
            result.add(A.get(pointA));
            pointA++;
        }

        while (pointB < B.size()) {
            result.add(B.get(pointA));
            pointB++;
        }

        return result;
    }
}
