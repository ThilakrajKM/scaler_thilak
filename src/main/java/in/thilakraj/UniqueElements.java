package in.thilakraj;

import java.util.Arrays;

/**
 * Problem Description
 * You are given an array A of N elements. You have to make all elements unique. To do so, in one step you can increase any number by one.
 * <p>
 * Find the minimum number of steps.
 * <p>
 * <p>
 * <p>
 * Problem Constraints
 * 1 <= N <= 105
 * 1 <= A[i] <= 109
 * <p>
 * <p>
 * <p>
 * Input Format
 * The only argument given is an Array A, having N integers.
 * <p>
 * <p>
 * <p>
 * Output Format
 * Return the minimum number of steps required to make all elements unique.
 * <p>
 * <p>
 * <p>
 * Example Input
 * Input 1:
 * <p>
 * A = [1, 1, 3]
 * Input 2:
 * <p>
 * A = [2, 4, 5]
 * <p>
 * <p>
 * Example Output
 * Output 1:
 * <p>
 * 1
 * Output 2:
 * <p>
 * 0
 * <p>
 * <p>
 * Example Explanation
 * Explanation 1:
 * <p>
 * We can increase the value of 1st element by 1 in 1 step and will get all unique elements. i.e [2, 1, 3].
 * Explanation 2:
 * <p>
 * All elements are distinct.
 * <p>
 * <p>
 * //Insertion sort method
 */
public class UniqueElements {

    public static void main(String[] args) {
        //int[] numbers = new int[]{1, 1, 3}; //1
        int[] numbers = new int[]{2, 4, 3, 4, 5, 3}; //6
        System.out.println(solve(numbers));
    }

    public static int solve(int[] A) {
        /*int result = 0;
        int[] sortedArray = new int[A.length];
        for(int i=0; i<A.length; i++) {
            int  j= i-1;
            int num = A[i];
            for(; j>=0; j--) {
                if(sortedArray[j]>num) {
                    sortedArray[j+1] = sortedArray[j];
                    sortedArray[j]=0;
                } else if (sortedArray[j] == num) {
                    num++;
                    result++;
                    j=i;
                } else if (sortedArray[j]<num) {
                    break;
                }
            }
            sortedArray[j+1] = num;
        }
        System.out.println(sortedArray);
        return result;*/

        Arrays.sort(A);
        int result = 0;
        for (int i = 1; i < A.length; i++) {
            if (A[i - 1] == A[i]) {
                A[i]++;
                result++;
            } else if (A[i - 1] > A[i]) {
                result += (A[i - 1] - A[i] + 1);
                A[i] = A[i - 1] + 1;
            }
        }

        return result;
    }

}
