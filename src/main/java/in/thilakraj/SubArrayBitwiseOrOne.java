package in.thilakraj;

import java.util.Arrays;
import java.util.List;

/**
 * Q3. Subarrays with Bitwise OR 1
 * Problem Description
 * Given an array B of length A with elements 1 or 0. Find the number of subarrays such that the bitwise OR of all the elements present in the subarray is 1.
 * Note : The answer can be large. So, return type must be long.
 * <p>
 * Problem Constraints
 * 1 <= A <= 105
 * <p>
 * <p>
 * Input Format
 * The first argument is a single integer A.
 * The second argument is an integer array B.
 * <p>
 * <p>
 * Output Format
 * Return the number of subarrays with bitwise array 1.
 * <p>
 * <p>
 * Example Input
 * Input 1:
 * A = 3
 * B = [1, 0, 1]
 * Input 2:
 * A = 2
 * B = [1, 0]
 * <p>
 * <p>
 * Example Output
 * Output 1:
 * 5
 * Output2:
 * 2
 * <p>
 * <p>
 * Example Explanation
 * Explanation 1:
 * The subarrays are :- [1], [0], [1], [1, 0], [0, 1], [1, 0, 1]
 * Except the subarray [0] all the other subarrays has a Bitwise OR = 1
 * Explanation 2:
 * The subarrays are :- [1], [0], [1, 0]
 * Except the subarray [0] all the other subarrays has a Bitwise OR = 1
 */
public class SubArrayBitwiseOrOne {

    public static void main(String[] args) {
        System.out.println("Ans " + solve(5, Arrays.asList(0, 1, 1, 0, 1)));
    }

    public static Long solve(int A, List<Integer> B) {

        int zerosCount = 0;
        long zeroSubArrayCount = 0;

        for (int i = 0; i < A; i++) {

            if (B.get(i) == 0) {
                zerosCount++;
            } else {
                zeroSubArrayCount += zerosCount * (zerosCount + 1L) / 2L;
                zerosCount = 0;
            }
        }
        zeroSubArrayCount += zerosCount * (zerosCount + 1L) / 2L;

        Long totalNumberOfSubArray = (A * (A + 1L)) / 2L;

        return totalNumberOfSubArray - zeroSubArrayCount;
    }

}


/**
 * HINT
 * If the array size is A -
 * Total number of subarrays are = A(A+1)/2
 * <p>
 * To find the number of subarrays with bitwise OR 0, find the subarrays with all elements equal to 0.
 * So, basically consider group of consecutive 0’s and their contribution in the count of subarrays.
 * <p>
 * Let’s assume the given array is - [1, 0, 0, 0, 1]
 * There is one group with three consecutive zeroes. Out of this group, number of subarrays with all elements equal to zero are 3*(3+1)/2 = 6.
 * And the 6 subarrays are -
 * subarray from index 1 to 1
 * subarray from index 1 to 2
 * subarray from index 1 to 3
 * subarray from index 2 to 2
 * subarray from index 2 to 3
 * subarray from index 3 to 3
 * <p>
 * So, if there are x consecutive zeroes, add x(x+1)/2 in the count of subarrays with all elements equal to 0.
 * <p>
 * So, finally the approach is -
 * <p>
 * count = 0 (count is representing the count of subarrays with bitwise OR 0)
 * zeroes = 0 (zeroes is representing the count of continuous zeroes)
 * iterate on all the elements of the array
 * if ith element is 0 -> zeroes += 1
 * if ith element is 1 -> count += (zeroes * (zeroes + 1)) / 2 and reset zeroes to 0
 * Final ans will be A(A+1)/2 - count
 */
