package in.thilakraj;

/**
 * Problem Description
 * Given an array of integers A, find and return the peak element in it.
 * An array element is considered a peak if it is not smaller than its neighbors. For corner elements, we need to consider only one neighbor.
 * <p>
 * NOTE:
 * <p>
 * It is guaranteed that the array contains only a single peak element.
 * Users are expected to solve this in O(log(N)) time. The array may contain duplicate elements.
 * <p>
 * <p>
 * Problem Constraints
 * 1 <= |A| <= 100000
 * <p>
 * 1 <= A[i] <= 109
 * <p>
 * <p>
 * <p>
 * Input Format
 * The only argument given is the integer array A.
 * <p>
 * <p>
 * <p>
 * Output Format
 * Return the peak element.
 * <p>
 * <p>
 * <p>
 * Example Input
 * Input 1:
 * <p>
 * A = [1, 2, 3, 4, 5]
 * Input 2:
 * <p>
 * A = [5, 17, 100, 11]
 * <p>
 * <p>
 * Example Output
 * Output 1:
 * <p>
 * 5
 * Output 2:
 * <p>
 * 100
 * <p>
 * <p>
 * Example Explanation
 * Explanation 1:
 * <p>
 * 5 is the peak.
 * Explanation 2:
 * <p>
 * 100 is the peak.
 */
public class FindAPeakElement {

    public static void main(String[] args) {
        System.out.println(solve(new int[]{1, 2, 3, 4, 5}));
        System.out.println(solve(new int[]{5, 17, 100, 11}));
        System.out.println(solve(new int[]{2, 3}));
        System.out.println(solve(new int[]{3, 2}));
    }

    public static int solve(int[] A) {

        if (A.length == 1) {
            return A[0];
        }
        if (A[0] > A[1]) {
            return A[0];
        }
        if (A[A.length - 1] > A[A.length - 2]) {
            return A[A.length - 1];
        }

        int low = 0, high = A.length - 1, mid = 0;

        while (low <= high) {
            mid = (low + high) / 2;
            if (mid - 1 >= 0 && mid + 1 < A.length && A[mid] > A[mid - 1] && A[mid] > A[mid + 1]) {
                return A[mid];
            } else if (mid - 1 >= 0 && A[mid - 1] < A[mid]) {
                low = mid + 1;
            } else if (mid - 1 >= 0 && A[mid - 1] > A[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return A[mid];

    }

}
