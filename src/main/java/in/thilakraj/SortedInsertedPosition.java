package in.thilakraj;

/**
 * Problem Description
 * You are given a sorted array A of size N and a target value B.
 * Your task is to find the index (0-based indexing) of the target value in the array.
 * <p>
 * If the target value is present, return its index.
 * If the target value is not found, return the index of least element greater than equal to B.
 * Your solution should have a time complexity of O(log(N)).
 * <p>
 * <p>
 * Problem Constraints
 * 1 <= N <= 106
 * 1 <= A[i] <= 105
 * 1 <= B <= 105
 * <p>
 * <p>
 * <p>
 * Input Format
 * The first argument is an integer array A of size N.
 * The second argument is an integer B.
 * <p>
 * <p>
 * <p>
 * Output Format
 * Return an integer denoting the index of target value.
 * <p>
 * <p>
 * <p>
 * Example Input
 * Input 1:
 * <p>
 * A = [1, 3, 5, 6]
 * B = 5
 * Input 2:
 * <p>
 * A = [1, 4, 9]
 * B = 3
 * <p>
 * <p>
 * Example Output
 * Output 1:
 * <p>
 * 2
 * Output 2:
 * <p>
 * 1
 * <p>
 * <p>
 * Example Explanation
 * Explanation 1:
 * <p>
 * The target value is present at index 2.
 * Explanation 2:
 * <p>
 * The target value should be inserted at index 1.
 */
public class SortedInsertedPosition {

    public static void main(String[] args) {

    }

    public int searchInsert(int[] A, int B) {

        int low = 0, high = A.length - 1, ansIndex = A.length;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (A[mid] == B) {
                ansIndex = mid;
                return ansIndex;
            } else if (A[mid] > B) {
                ansIndex = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return ansIndex;
    }
}
