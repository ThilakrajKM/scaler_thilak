package in.thilakraj;

/**
 * Problem Description
 * Given a sorted array of integers A where every element appears twice except for one element which appears once, find and return this single element that appears only once.
 * <p>
 * Elements which are appearing twice are adjacent to each other.
 * <p>
 * NOTE: Users are expected to solve this in O(log(N)) time.
 * <p>
 * <p>
 * <p>
 * Problem Constraints
 * 1 <= |A| <= 100000
 * <p>
 * 1 <= A[i] <= 10^9
 * <p>
 * <p>
 * <p>
 * Input Format
 * The only argument given is the integer array A.
 * <p>
 * <p>
 * <p>
 * Output Format
 * Return the single element that appears only once.
 * <p>
 * <p>
 * <p>
 * Example Input
 * Input 1:
 * <p>
 * A = [1, 1, 7]
 * Input 2:
 * <p>
 * A = [2, 3, 3]
 * <p>
 * <p>
 * Example Output
 * Output 1:
 * <p>
 * 7
 * Output 2:
 * <p>
 * 2
 * <p>
 * <p>
 * Example Explanation
 * Explanation 1:
 * <p>
 * 7 appears once
 * Explanation 2:
 * <p>
 * 2 appears once
 */
public class SingleElementInSortedArray {

    public static void main(String[] args) {
        //[1,1,2,2,3,4,4]
        //[1,1,2,3,3,4,4,5,5]

        solve(new int[]{25, 25, 42, 42, 70, 70, 82, 82, 118, 118, 139, 139, 191, 191, 208, 257, 257, 264, 264, 278, 278, 334, 334, 406, 406, 430, 430, 436, 436, 484, 484});
    }

    //solve in log(n) complexity
    public static int solve(int[] A) {

        int low = 0, high = A.length - 1, ans = -1;
        int mid = (low + high) / 2;
        while (low <= high) {
            mid = (low + high) / 2;

            if (mid % 2 == 0) {

                if (mid + 1 < A.length && A[mid] == A[mid + 1]) {
                    low = mid + 1;
                } else if (mid - 1 >= 0 && A[mid] == A[mid - 1]) {
                    high = mid - 1;
                } else {
                    break;
                }
            } else {
                if (mid + 1 < A.length && A[mid] == A[mid + 1]) {
                    high = mid - 1;
                } else if (mid - 1 >= 0 && A[mid] == A[mid - 1]) {
                    low = mid + 1;
                } else {
                    break;
                }
            }
        }

        return A[mid];
    }
}
