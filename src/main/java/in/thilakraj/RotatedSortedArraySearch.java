package in.thilakraj;

/**
 * Problem Description
 * Given a sorted array of integers A of size N and an integer B,
 * where array A is rotated at some pivot unknown beforehand.
 * <p>
 * For example, the array [0, 1, 2, 4, 5, 6, 7] might become [4, 5, 6, 7, 0, 1, 2].
 * <p>
 * Your task is to search for the target value B in the array. If found, return its index; otherwise, return -1.
 * <p>
 * You can assume that no duplicates exist in the array.
 * <p>
 * NOTE: You are expected to solve this problem with a time complexity of O(log(N)).
 * <p>
 * <p>
 * Problem Constraints
 * 1 <= N <= 1000000
 * 1 <= A[i] <= 109
 * All elements in A are Distinct.
 * <p>
 * <p>
 * Input Format
 * The First argument given is the integer array A.
 * The Second argument given is the integer B.
 * <p>
 * <p>
 * Output Format
 * Return index of B in array A, otherwise return -1
 * <p>
 * <p>
 * Example Input
 * Input 1:
 * <p>
 * A = [4, 5, 6, 7, 0, 1, 2, 3]
 * B = 4
 * Input 2:
 * <p>
 * A : [ 9, 10, 3, 5, 6, 8 ]
 * B : 5
 * <p>
 * <p>
 * Example Output
 * Output 1:
 * <p>
 * 0
 * Output 2:
 * <p>
 * 3
 */
public class RotatedSortedArraySearch {

    public static void main(String[] args) {
        int[] ar = new int[]{101, 103, 106, 109, 158, 164, 182, 187, 202, 205, 2, 3, 32, 57, 69, 74, 81, 99, 100};
        System.out.println(search(ar, 202));
    }

    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public static int search(final int[] A, int B) {

        int low = 0, high = A.length - 1;

        while (low <= high) {

            int mid = (low + high) / 2;

            if (A[mid] == B) {
                return mid;
            }

            if (A[low] < A[mid]) {
                if (A[low] <= B && B < A[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else {
                if (A[mid] < B && B <= A[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }

        return -1;
    }
}
