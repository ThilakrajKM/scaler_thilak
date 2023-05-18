package in.thilakraj;

import java.util.Arrays;
import java.util.List;

/**
 * Problem Description
 * Given an array A, find the size of the smallest subarray such that it contains at least one occurrence of
 * the maximum value of the array and at least one occurrence of the minimum value of the array.
 * <p>
 * Problem Constraints
 * 1 <= |A| <= 2000
 * <p>
 * Input Format
 * First and only argument is vector A
 * <p>
 * Output Format
 * Return the length of the smallest subarray which has at least one occurrence of minimum and maximum element of the array
 * <p>
 * Input 1:
 * A = [1, 3, 2]
 * Input 2:
 * A = [2, 6, 1, 6, 9]
 * <p>
 * Example Output
 * Output 1:
 * 2
 * Output 2:
 * 3
 */
public class ClosestMinMax {

    public static void main(String[] args) {
        System.out.println("Closest Min Max = " + solve(Arrays.asList(7, 3, 5, 1, 5, 1, 2, 4, 5, 7, 1)));
        int[] a = {7, 3, 5, 1, 5, 1, 2, 4, 5, 7, 1};
        System.out.println("Closest Min Max = " + solve(a));
    }

    //mine
    public static int solve(List<Integer> A) {
        int max = A.get(0), min = A.get(0), minIndex = 0, maxIndex = 0;

        for (int i = 1; i < A.size(); i++) {
            if (A.get(i) > max) {
                max = A.get(i);
                maxIndex = i;
            }
            if (A.get(i) < min) {
                min = A.get(i);
                minIndex = i;
            }
        }

        if (min == max) {
            return 1;
        }

        int ans = maxIndex > minIndex ? maxIndex - minIndex + 1 : minIndex - maxIndex + 1;
        for (int i = 0; i < A.size(); i++) {
            if (A.get(i) == min) {
                minIndex = i;
                ans = Integer.min(ans, maxIndex > minIndex ? maxIndex - minIndex + 1 : minIndex - maxIndex + 1);
            }
            if (A.get(i) == max) {
                maxIndex = i;
                ans = Integer.min(ans, maxIndex > minIndex ? maxIndex - minIndex + 1 : minIndex - maxIndex + 1);
            }

        }
        return ans;
    }

    //in code by scaler
    public static int solve(int[] A) {

        int min_ele = Integer.MAX_VALUE, max_ele = Integer.MIN_VALUE;   // min and max value of the array
        int min_Index = -1, max_Index = -1; // index of the last element having value equal to min_ele and max_ele

        int ans = Integer.MAX_VALUE;
        for (int x : A) {
            min_ele = Math.min(min_ele, x);
            max_ele = Math.max(max_ele, x);
        }

        for (int i = 0; i < A.length; i++) {
            if (A[i] == min_ele) min_Index = Math.max(min_Index, i);
            if (A[i] == max_ele) max_Index = Math.max(max_Index, i);

            if (min_Index != -1 && max_Index != -1) {
                int len = Math.abs(max_Index - min_Index) + 1;
                ans = Math.min(ans, len);
            }
        }

        return ans;
    }
}
