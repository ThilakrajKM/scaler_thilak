package in.thilakraj;

import java.util.Arrays;
import java.util.List;

/**
 * Problem Description
 * Find the Bth smallest element in given array A .
 * <p>
 * NOTE: Users should try to solve it in less than equal to B swaps.
 * <p>
 * <p>
 * <p>
 * Problem Constraints
 * 1 <= |A| <= 100000
 * <p>
 * 1 <= B <= min(|A|, 500)
 * <p>
 * 1 <= A[i] <= 109
 * <p>
 * <p>
 * <p>
 * Input Format
 * The first argument is an integer array A.
 * <p>
 * The second argument is integer B.
 * <p>
 * <p>
 * <p>
 * Output Format
 * Return the Bth smallest element in given array.
 * <p>
 * <p>
 * <p>
 * Example Input
 * Input 1:
 * <p>
 * A = [2, 1, 4, 3, 2]
 * B = 3
 * Input 2:
 * <p>
 * A = [1, 2]
 * B = 2
 * <p>
 * <p>
 * Example Output
 * Output 1:
 * <p>
 * 2
 * Output 2:
 * <p>
 * 2
 * <p>
 * <p>
 * Example Explanation
 * Explanation 1:
 * <p>
 * 3rd element after sorting is 2.
 * Explanation 2:
 * <p>
 * 2nd element after sorting is 2.
 */
public class KthSmallestElement {

    public static void main(String[] args) {

        List items = Arrays.asList(8, 16, 80, 55, 32, 8, 38, 40, 65, 18, 15, 45, 50, 38, 54, 52, 23, 74, 81, 42, 28, 16, 66, 35, 91, 36, 44, 9, 85, 58, 59, 49, 75, 20, 87, 60, 17, 11, 39, 62, 20, 17, 46, 26, 81, 92);

        System.out.println(kthsmallest(items, 9));//17
    }

    public static int kthsmallest(final List<Integer> A, int B) {

        Integer[] result = A.stream().toArray(Integer[]::new);

        for (int i = 0; i < B; i++) {
            int min = result[i];
            int minIndex = i;
            for (int j = i + 1; j < A.size(); j++) {
                if (result[j] < min) {
                    min = result[j];
                    minIndex = j;
                }
            }
            swap(result, i, minIndex);
        }

        return result[B - 1];
    }

    private static void swap(Integer[] result, int i, int minIndex) {
        int temp = result[i];
        result[i] = result[minIndex];
        result[minIndex] = temp;
    }
}
