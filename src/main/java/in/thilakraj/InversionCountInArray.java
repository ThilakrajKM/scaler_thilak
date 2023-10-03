package in.thilakraj;

import java.util.Arrays;
import java.util.List;

/**
 * Problem Description
 * Given an array of integers A. If i < j and A[i] > A[j], then the pair (i, j) is called an inversion of A. Find the total number of inversions of A modulo (109 + 7).
 * <p>
 * <p>
 * <p>
 * Problem Constraints
 * 1 <= length of the array <= 105
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
 * Return the number of inversions of A modulo (109 + 7).
 * <p>
 * <p>
 * <p>
 * Example Input
 * Input 1:
 * <p>
 * A = [1, 3, 2]
 * Input 2:
 * <p>
 * A = [3, 4, 1, 2]
 * <p>
 * <p>
 * Example Output
 * Output 1:
 * <p>
 * 1
 * Output 2:
 * <p>
 * 4
 * <p>
 * <p>
 * Example Explanation
 * Explanation 1:
 * <p>
 * The pair (1, 2) is an inversion as 1 < 2 and A[1] > A[2]
 * Explanation 2:
 * <p>
 * The pair (0, 2) is an inversion as 0 < 2 and A[0] > A[2]
 * The pair (0, 3) is an inversion as 0 < 3 and A[0] > A[3]
 * The pair (1, 2) is an inversion as 1 < 2 and A[1] > A[2]
 * The pair (1, 3) is an inversion as 1 < 3 and A[1] > A[3]
 */
public class InversionCountInArray {

    public static void main(String[] args) {
//        System.out.println(solve(Arrays.asList(45,10,15,25,50)));
        System.out.println(solve(Arrays.asList(28, 18, 44, 49, 41, 14)));
    }

    public static int solve(List<Integer> A) {
        int mod = 1000000007;
        long result = mergeSort(A, 0, A.size() - 1);
        System.out.println(A);
        return (int) (result % mod);
    }

    static long mergeSort(List<Integer> A, int low, int high) {

        if (low == high) {
            return 0;
        }

        int mid = (low + high) / 2;
        long leftInversionCount = mergeSort(A, low, mid);
        long rightInversionCount = mergeSort(A, mid + 1, high);
        long inversionCount = merge(A, low, high);

        return leftInversionCount + rightInversionCount + inversionCount;
    }

    static long merge(List<Integer> A, int low, int high) {

        if (low == high) {
            return 0;
        }

        int mid = (low + high) / 2;
        int pointA = low;
        int pointB = mid + 1;

        long result = 0;

        while (pointA <= mid && pointB <= high) {
            if (A.get(pointA) < A.get(pointB)) {
                pointA++;
            } else {
                System.out.println(A.get(pointA) + "->" + A.get(pointB));
                int temp = A.get(pointA);
                A.set(pointA, A.get(pointB));
                A.set(pointB, temp);
                result++;
            }
        }


        if (pointB < high) {
            result = result + mergeSort(A, pointB, high);
        }

        return result;
    }


}


class Solution {
    public static long count = 0;

    public static void mergeSort(int[] A, int s, int e) {
        if (s == e) {
            return;
        }

        int m = (s + e) / 2;

        mergeSort(A, s, m);
        mergeSort(A, m + 1, e);
        merge(A, s, m, e);
    }

    public static void merge(int[] A, int s, int m, int e) {
        int p1 = s;
        int p2 = m + 1;
        int index = 0;

        int[] arr = new int[e - s + 1];

        while (p1 <= m && p2 <= e) {
            if (A[p1] <= A[p2]) {
                arr[index] = A[p1];
                p1++;
                index++;
            } else {
                arr[index] = A[p2];
                p2++;
                index++;
                count = count + m - p1 + 1;
            }
        }

        while (p1 <= m) {
            arr[index] = A[p1];
            p1++;
            index++;
        }

        while (p2 <= e) {
            arr[index] = A[p2];
            p2++;
            index++;
        }

        index = 0;

        for (int i = s; i <= e; i++) {
            A[i] = arr[index];
            index++;
        }
    }

    public int solve(int[] A) {
        mergeSort(A, 0, A.length - 1);
        int mod = 1000000007;
        long ans = ((count % mod) + mod) % mod;
        count = 0; // reinitialize count with 0
        return (int) ans;
    }
}

