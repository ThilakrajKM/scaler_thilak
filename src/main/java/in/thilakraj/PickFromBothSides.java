package in.thilakraj;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Problem Description
 * You are given an integer array A of size N.
 * <p>
 * You have to perform B operations. In one operation, you can remove either the leftmost or the rightmost element of the array A.
 * <p>
 * Find and return the maximum possible sum of the elements that were removed after B operations.
 * <p>
 * NOTE: Suppose B = 4, and array A contains 10 elements, then
 * <p>
 * You can remove the first four elements or can remove the last four elements, or can remove 1 from front and 3 from the back, etc. You need to return the maximum possible sum of elements you can remove.
 * <p>
 * Problem Constraints
 * 1 <= N <= 10^5
 * <p>
 * 1 <= B <= N
 * <p>
 * -10^3 <= A[i] <= 10^3
 * <p>
 * Input Format
 * First argument is an integer array A.
 * <p>
 * Second argument is an integer B.
 * <p>
 * Output Format
 * Return an integer denoting the maximum possible sum of elements you removed.
 * <p>
 * Example Input
 * Input 1:
 * <p>
 * A = [5, -2, 3 , 1, 2]
 * B = 3
 * Input 2:
 * <p>
 * A = [ 2, 3, -1, 4, 2, 1 ]
 * B = 4
 * <p>
 * <p>
 * Example Output
 * Output 1: 8
 * Output 2: 9
 */
public class PickFromBothSides {

    public static void main(String[] args) {
        System.out.println("Pick from both Sides = " + solve(Arrays.asList(5, -2, 3, 1, 2), 5));
        System.out.println("Pick from both Sides = " + solve(Arrays.asList(2, 3, -1, 4, 2, 1), 4));
    }

    public static int solve(List<Integer> A, int B) {

        ArrayList<Integer> pSum = new ArrayList<>();
        Integer totSum = 0;
        for (int i = 0; i < A.size(); i++) {
            totSum = totSum + A.get(i);
            pSum.add(totSum);
        }

        Integer maxSum = Integer.MIN_VALUE;

        System.out.println("B " + B);
        for (int i = 0; i < B; i++) {
            int leftSum = pSum.get(B - i - 1) + (i != 0 ? (pSum.get(A.size() - 1) - pSum.get(A.size() - i - 1)) : 0);

            int rightSum = (i != 0 ? pSum.get(i - 1) : 0) + (pSum.get(A.size() - 1) - ((A.size() - B + i - 1) < 0 ? 0 : pSum.get(A.size() - B + i - 1)));

            if (leftSum > maxSum) {
                maxSum = leftSum;
            }

            if (rightSum > maxSum) {
                maxSum = rightSum;
            }
        }

        return maxSum;
    }

    /*public static  int solve(List<Integer> A, int B) {

        ArrayList<Integer> pSum = new ArrayList<>();
        Integer totSum = 0;
        for(int i=0; i<A.size(); i++){
            totSum = totSum + A.get(i);
            pSum.add( totSum );
        }

        Integer maxSum = Integer.MIN_VALUE;
        for (int i=0; i<B; i++) {

            int leftSum     = pSum.get(B-i-1)               + ( i != 0  ? ( pSum.get(A.size()-1) - pSum.get(A.size() -i -1)) : 0);
            int rightSum    = ( i!=0 ? pSum.get(i -1) : 0 ) + ( pSum.get(A.size()-1) - pSum.get(A.size() -B +i -1));

            if(leftSum > maxSum) {
                maxSum = leftSum;
            }

            if(rightSum > maxSum) {
                maxSum = rightSum;
            }
        }

        return maxSum;
    }*/
}

/*
Method 1:

public class Solution {
    public int solve(int[] A, int B) {
        int n = A.length;
        int []suff = new int[n + 1];
        suff[n] = 0;
        suff[n - 1] = A[n - 1];
        for(int i = n - 2; i >= 0; i--){
            suff[i] = A[i] + suff[i + 1];
        }
        int pref_sum = 0;
        int ans = suff[n - B];
        for(int i = 0; i < B; i++){
            pref_sum = pref_sum + A[i];
            int suff_sum = suff[n - B + (i + 1)];
            ans = Math.max(ans, pref_sum + suff_sum);
        }
        return ans;
    }
}

Method 2:

public class Solution {
    public int solve(int[] A, int B) {
        int n = A.length;
        int cur = 0;
        for(int i = 0; i < B; i++){
            cur += A[i];
        }
        int back = B - 1;
        int ans = cur;
        for(int j = n - 1 ; j >= n-B; j--){
            cur += A[j];
            cur -= A[back];
            back--;
            ans = Math.max(ans, cur);
        }
        return ans;
    }
}
 */