package in.thilakraj;

/**
 * Problem Description
 * Given N non-negative integers A[0], A[1], ..., A[N-1] , where each represents a point at coordinate (i, A[i]).
 * <p>
 * N vertical lines are drawn such that the two endpoints of line i is at (i, A[i]) and (i, 0).
 * <p>
 * Find two lines, which together with x-axis forms a container, such that the container contains the most water. You need to return this maximum area.
 * <p>
 * Note: You may not slant the container. It is guaranteed that the answer will fit in integer limits.
 * <p>
 * <p>
 * <p>
 * Problem Constraints
 * 1 <= N <= 105
 * <p>
 * 1 <= A[i] <= 105
 * <p>
 * <p>
 * <p>
 * Input Format
 * Single Argument representing a 1-D array A.
 * <p>
 * <p>
 * <p>
 * Output Format
 * Return single Integer denoting the maximum area you can obtain.
 * <p>
 * <p>
 * <p>
 * Example Input
 * Input 1:
 * <p>
 * A = [1, 5, 4, 3]
 * Input 2:
 * <p>
 * A = [1]
 * <p>
 * <p>
 * Example Output
 * Output 1:
 * <p>
 * 6
 * Output 2:
 * <p>
 * 0
 * <p>
 * <p>
 * Example Explanation
 * Explanation 1:
 * <p>
 * 5 and 3 are distance 2 apart. So size of the base = 2. Height of container = min(5, 3) = 3.
 * So total area = 3 * 2 = 6
 * Explanation 2:
 * <p>
 * No container is formed.
 */
public class ContainerWithMostWater {

    public int maxArea(int[] A) {

        int left = 0, right = A.length - 1, ans = 0;

        while (left <= right) {

            int width = right - left;
            int height = Math.min(A[left], A[right]);
            ans = Math.max(width * height, ans);

            if (A[left] < A[right]) {
                left++;
            } else {
                right++;
            }

        }

        return ans;
    }
}
