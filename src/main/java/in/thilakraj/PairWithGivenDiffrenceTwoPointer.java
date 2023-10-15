package in.thilakraj;

import java.util.Arrays;
import java.util.HashSet;

/**
 * Problem Description
 * Given an one-dimensional integer array A of size N and an integer B.
 * <p>
 * Count all distinct pairs with difference equal to B.
 * <p>
 * Here a pair is defined as an integer pair (x, y), where x and y are both numbers in the array and their absolute difference is B.
 * <p>
 * <p>
 * <p>
 * Problem Constraints
 * 1 <= N <= 104
 * <p>
 * 0 <= A[i], B <= 105
 * <p>
 * <p>
 * <p>
 * Input Format
 * First argument is an one-dimensional integer array A of size N.
 * <p>
 * Second argument is an integer B.
 * <p>
 * <p>
 * <p>
 * Output Format
 * Return an integer denoting the count of all distinct pairs with difference equal to B.
 * <p>
 * <p>
 * <p>
 * Example Input
 * Input 1:
 * <p>
 * A = [1, 5, 3, 4, 2]
 * B = 3
 * Input 2:
 * <p>
 * A = [8, 12, 16, 4, 0, 20]
 * B = 4
 * Input 3:
 * <p>
 * A = [1, 1, 1, 2, 2]
 * B = 0
 * <p>
 * <p>
 * Example Output
 * Output 1:
 * <p>
 * 2
 * Output 2:
 * <p>
 * 5
 * Output 3:
 * <p>
 * 2
 * <p>
 * <p>
 * Example Explanation
 * Explanation 1:
 * <p>
 * There are 2 unique pairs with difference 3, the pairs are {1, 4} and {5, 2}
 * Explanation 2:
 * <p>
 * There are 5 unique pairs with difference 4, the pairs are {0, 4}, {4, 8}, {8, 12}, {12, 16} and {16, 20}
 * Explanation 3:
 * <p>
 * There are 2 unique pairs with difference 0, the pairs are {1, 1} and {2, 2}.
 */
public class PairWithGivenDiffrenceTwoPointer {

    public static void main(String[] args) {
        int[] a = new int[]{8, 5, 1, 10, 5, 9, 9, 3, 5, 6, 6, 2, 8, 2, 2, 6, 3, 8, 7, 2, 5, 3, 4, 3, 3, 2, 7, 9, 6, 8, 7, 2, 9, 10, 3, 8, 10, 6, 5, 4, 2, 3};
        System.out.println(solve(a, 3));
    }

    public static int solve(int[] A, int B) {

        HashSet<Integer> numberSets = new HashSet<>();
        int result = 0;

        int left = 0, right = 1;
        Arrays.sort(A);

        while (right < A.length) {
            if (((A[left] - A[right] == B) || (A[right] - A[left] == B)) &&
                    (!numberSets.contains(A[left]) || !numberSets.contains(A[right]))) {
                result++;
                numberSets.add(A[left]);
                numberSets.add(A[right]);
                left++;
                right++;
            } else if (A[right] - A[left] < B) {
                right++;
            } else {
                left++;
                if (left == right) {
                    right++;
                }
            }
        }


        return result;
    }
}

/**
 * Soln by Scaler
 * public class Solution {
 * public int solve(ArrayList<Integer> A, int B) {
 * Collections.sort(A);
 * int i = 0, j = 1;
 * long ans = 0;
 * while(j < A.size()) {
 * if(j == i) {
 * j++;
 * continue;
 * }
 * int x = A.get(i), y = A.get(j);
 * if(y - x == B) {
 * // count the pair A[i], A[j] only once
 * ans++;
 * while(i < A.size() && A.get(i) == x) i++;
 * while(j < A.size() && A.get(j) == y) j++;
 * }
 * else if(y - x > B){
 * i++;
 * }
 * else j++;
 * }
 * return (int)ans;
 * }
 * }
 */
