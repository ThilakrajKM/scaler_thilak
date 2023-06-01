package in.thilakraj;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Problem Description
 * Given an array, arr[] of size N, the task is to find the count of array indices such that removing an element from these indices makes the sum of even-indexed and odd-indexed array elements equal.
 * Problem Constraints
 * 1 <= n <= 10^5
 * -10^5 <= A[i] <= 10^5
 *
 *Input Format
 *First argument contains an array A of integers of size N
 *Output Format
 * Return the count of array indices such that removing an element from these indices makes the sum of even-indexed and odd-indexed array elements equal.
 * Example Input
 * Input 1:
 * A=[2, 1, 6, 4]
 * Input 2:
 *
 * A=[1, 1, 1]
 *
 * Example Output
 * Output 1:
 * 1
 * Output 2:
 *
 * 3
 * Example Explanation
 * Explanation 1:
 * Removing arr[1] from the array modifies arr[] to { 2, 6, 4 } such that, arr[0] + arr[2] = arr[1].
 * Therefore, the required output is 1.
 * Explanation 2:
 *
 * Removing arr[0] from the given array modifies arr[] to { 1, 1 } such that arr[0] = arr[1]
 * Removing arr[1] from the given array modifies arr[] to { 1, 1 } such that arr[0] = arr[1]
 * Removing arr[2] from the given array modifies arr[] to { 1, 1 } such that arr[0] = arr[1]
 * Therefore, the required output is 3.
 */
public class SpecialIndex {

    public static void main(String[] args) {
        System.out.println("Ans = " + solve(Arrays.asList(1,1,1)));
    }

    public static  int solve(List<Integer> A) {

        ArrayList<Integer> evenPrefixSum = new ArrayList<>();
        ArrayList<Integer> oddPrefixSum = new ArrayList<>();

        int result = 0;

        for(int i=0; i<A.size(); i++) {
            if(i%2==0) {
                evenPrefixSum.add( i==0? A.get(i) : evenPrefixSum.get(i-1) + A.get(i));
                oddPrefixSum.add( i==0? 0 : oddPrefixSum.get(i-1));
            } else {
                oddPrefixSum.add( i==1? A.get(i) : oddPrefixSum.get(i-1) + A.get(i));
                evenPrefixSum.add(evenPrefixSum.get(i-1));
            }
        }

        if(evenPrefixSum.get(A.size()-1) == oddPrefixSum.get(A.size()-1)) {
            result++;
        }

        for(int i=0; i<A.size(); i++) {

            int evenSum = (i==0 ? 0 : evenPrefixSum.get(i-1)) +  oddPrefixSum.get(A.size()-1)  - (i==0 ? 0 : oddPrefixSum.get(i));
            int oddSum  = (i==0 ? 0 : oddPrefixSum.get( i-1)) +  evenPrefixSum.get(A.size()-1) - evenPrefixSum.get(i);

            if(evenSum == oddSum) {
                result++;
            }
        }

        return result;
    }
}


