package in.thilakraj;

/**
 * Q3. First Missing Integer
 * Unsolved
 * feature icon
 * Using hints is now penalty free
 * Use Hint
 * Problem Description
 * Given an unsorted integer array, A of size N. Find the first missing positive integer.
 * <p>
 * Note: Your algorithm should run in O(n) time and use constant space.
 * <p>
 * <p>
 * <p>
 * Problem Constraints
 * 1 <= N <= 1000000
 * <p>
 * -109 <= A[i] <= 109
 * <p>
 * <p>
 * <p>
 * Input Format
 * First argument is an integer array A.
 * <p>
 * <p>
 * <p>
 * Output Format
 * Return an integer denoting the first missing positive integer.
 * <p>
 * <p>
 * <p>
 * Example Input
 * Input 1:
 * <p>
 * [1, 2, 0]
 * Input 2:
 * <p>
 * [3, 4, -1, 1]
 * Input 3:
 * <p>
 * [-8, -7, -6]
 * <p>
 * <p>
 * Example Output
 * Output 1:
 * <p>
 * 3
 * Output 2:
 * <p>
 * 2
 * Output 3:
 * <p>
 * 1
 * <p>
 * <p>
 * Example Explanation
 * Explanation 1:
 * <p>
 * A = [1, 2, 0]
 * First positive integer missing from the array is 3.
 */
public class FindFirstMissingNumber {

    public static void main(String[] args) {
        System.out.println(firstMissingPositive(new int[]{4, 2, 1}));
        System.out.println(firstMissingPositive(new int[]{-4, 3, 2, 1, -5}));
    }


    public static int firstMissingPositive(int[] A) {

        int i = 0, n = A.length;

        while (i < n) {
            if (A[i] >= 1 && A[i] <= n) {
                int corIndx = A[i] - 1;
                if (A[i] != A[corIndx]) {
                    int temp = A[i];
                    A[i] = A[corIndx];
                    A[corIndx] = temp;
                } else {
                    i++;
                }
            } else {
                i++;
            }
        }

        int val = 1;
        for (int k = 0; k < n; k++, val++) {

            if (A[k] != val) {
                break;
            }
        }

        return val;
    }
}
