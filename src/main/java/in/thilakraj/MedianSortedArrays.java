package in.thilakraj;

import java.util.List;

/**
 * Problem Description
 * There are two sorted arrays A and B of sizes N and M respectively.
 * <p>
 * Find the median of the two sorted arrays ( The median of the array formed by merging both the arrays ).
 * <p>
 * NOTE:
 * <p>
 * The overall run time complexity should be O(log(m+n)).
 * IF the number of elements in the merged array is even, then the median is the average of (n/2)th and (n/2+1)th element. For example, if the array is [1 2 3 4], the median is (2 + 3) / 2.0 = 2.5.
 * <p>
 * <p>
 * Problem Constraints
 * 1 <= N + M <= 2*106
 * <p>
 * <p>
 * <p>
 * Input Format
 * The first argument is an integer array A of size N.
 * The second argument is an integer array B of size M.
 * <p>
 * <p>
 * <p>
 * Output Format
 * Return a decimal value denoting the median of two sorted arrays.
 * <p>
 * <p>
 * <p>
 * Example Input
 * Input 1:
 * <p>
 * A = [1, 4, 5]
 * B = [2, 3]
 * Input 2:
 * <p>
 * A = [1, 2, 3]
 * B = [4]
 * <p>
 * <p>
 * Example Output
 * Output 1:
 * <p>
 * 3.0
 * Output 2:
 * <p>
 * 2.5
 * <p>
 * <p>
 * Example Explanation
 * Explanation 1:
 * <p>
 * The median of both the sorted arrays will be 3.0.
 * Explanation 2:
 * <p>
 * The median of both the sorted arrays will be (2+3)/2 = 2.5.
 */
public class MedianSortedArrays {

    //TODO:
    public double findMedianSortedArrays(final List<Integer> a, final List<Integer> b) {

        if (a.size() < b.size()) {
            return findMedianSortedArrays(b, a);
        }

        double result;

        int low = 0, high = a.size() - 1, n = a.size() + b.size();

        while (low <= high) {
            int mid = (low + high) / 2;

            //int l1 = mid-1, r1 = mid,


        }


        return 0;//result;
    }
}
