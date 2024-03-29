package in.thilakraj;

import java.util.ArrayList;
import java.util.List;

/**
 * Problem Description
 * Given an array with N objects colored red, white, or blue, sort them so that objects of the same color are adjacent, with the colors in the order red, white, and blue.
 * <p>
 * We will represent the colors as,
 * <p>
 * red -> 0
 * white -> 1
 * blue -> 2
 * <p>
 * Note: Using the library sort function is not allowed.
 * <p>
 * <p>
 * <p>
 * Problem Constraints
 * 1 <= N <= 1000000
 * 0 <= A[i] <= 2
 * <p>
 * <p>
 * Input Format
 * First and only argument of input contains an integer array A.
 * <p>
 * <p>
 * Output Format
 * Return an integer array in asked order
 * <p>
 * <p>
 * Example Input
 * Input 1 :
 * A = [0, 1, 2, 0, 1, 2]
 * Input 2:
 * <p>
 * A = [0]
 * <p>
 * <p>
 * Example Output
 * Output 1:
 * [0, 0, 1, 1, 2, 2]
 * Output 2:
 * <p>
 * [0]
 * <p>
 * <p>
 * Example Explanation
 * Explanation 1:
 * [0, 0, 1, 1, 2, 2] is the required order.
 * Explanation 2:
 * [0] is the required order
 */
public class SortByColor {

    public static void main(String[] args) {
        System.out.println("Ans " + sortColors(List.of(0)));
    }

    public static ArrayList<Integer> sortColors(List<Integer> A) {
        int countRed = 0;
        int countWhite = 0;
        int countBlue = 0;

        for (int i = 0; i < A.size(); i++) {
            if (A.get(i) == 0) {
                countRed++;
            } else if (A.get(i) == 1) {
                countWhite++;
            } else if (A.get(i) == 2) {
                countBlue++;
            }
        }

        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < A.size(); i++) {
            if (countRed > 0) {
                result.add(0);
                countRed--;
            } else if (countWhite > 0) {
                result.add(1);
                countWhite--;
            } else if (countBlue > 0) {
                result.add(2);
                countBlue--;
            }
        }

        return result;
    }
}
