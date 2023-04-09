package in.thilakraj;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Q3. Range Sum Query
 * Problem Description
 * You are given an integer array A of length N.
 * You are also given a 2D integer array B with dimensions M x 2, where each row denotes a [L, R] query.
 * For each query, you have to find the sum of all elements from L to R indices in A (0 - indexed).
 * More formally, find A[L] + A[L + 1] + A[L + 2] +... + A[R - 1] + A[R] for each query.
 *
 * Problem Constraints
 * 1 <= N, M <= 10^5
 * 1 <= A[i] <= 10^9
 * 0 <= L <= R < N
 *
 * Input Format
 * The first argument is the integer array A.
 * The second argument is the 2D integer array B.
 *
 * Output Format
 * Return an integer array of length M where ith element is the answer for ith query in B.
 *
 * Input 1:
 * A = [1, 2, 3, 4, 5]
 * B = [[0, 3], [1, 2]]
 * Input 2:
 *
 * A = [2, 2, 2]
 * B = [[0, 0], [1, 2]]
 *
 * Example Output
 * Output 1:
 * [10, 5]
 * Output 2:
 *
 * [2, 4]
 *
 *
 *
 * --------
 *
 * A : [ 7, 3, 1, 5, 5, 5, 1, 2, 4, 5 ]
 * B :
 * [
 *   [6, 9]
 *   [2, 9]
 *   [2, 4]
 *   [0, 9]
 * ]
 *
 * Test As Custom Input
 * The expected return value:
 * 12 28 11 38
 */
public class RangeSumQuery {

    public static void main(String[] args) {


        System.out.println("Max Min Array = " + rangeSum(Arrays.asList(7, 3, 1, 5, 5, 5, 1, 2, 4, 5),
                Arrays.asList(Arrays.asList(6,9), Arrays.asList(2,9), Arrays.asList(2,4), Arrays.asList(0,9))));
    }

    public static ArrayList<Long> rangeSum(List<Integer> A, List<List<Integer>> B) {
        ArrayList<Long> resultList = new ArrayList<>();
        ArrayList<Long> prefixSumList = new ArrayList<>();

        for(int i=0; i<A.size(); i++) {
            prefixSumList.add(A.get(i) + ( i==0 ? 0 : prefixSumList.get(i-1)));
        } 

        for(int i=0; i<B.size(); i++) {
            int startIndex = B.get(i).get(0);
            int endIndex = B.get(i).get(1);

            if(startIndex == 0) {
                resultList.add(prefixSumList.get(endIndex));
            } else {
                resultList.add(prefixSumList.get(endIndex) - prefixSumList.get(startIndex -1));
            }
        }

        return resultList;
    }
}
