package in.thilakraj;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Even numbers in a range
 * Problem Description
 * You are given an array A of length N and Q queries given by the 2D array B of size Q×2.
 *
 * Each query consists of two integers B[i][0] and B[i][1].
 *
 * For every query, your task is to find the count of even numbers in the range from A[B[i][0]] to A[B[i][1]].
 * Problem Constraints
 * 1 <= N <= 10^5
 * 1 <= Q <= 10^5
 * 1 <= A[i] <= 10^9
 * 0 <= B[i][0] <= B[i][1] < N
 *
 * Input Format
 * First argument A is an array of integers.
 * Second argument B is a 2D array of integers.
 *
 * Output Format
 * Return an array of integers.
 * Input 1:
 * A = [1, 2, 3, 4, 5]
 * B = [   [0, 2]
 *         [2, 4]
 *         [1, 4]   ]
 * Input 2:
 * A = [2, 1, 8, 3, 9, 6]
 * B = [   [0, 3]
 *         [3, 5]
 *         [1, 3]
 *         [2, 4]   ]
 *
 * Example Output
 * Output 1:
 * [1, 1, 2]
 * Output 2:
 * [2, 1, 1, 1]
 */
public class EvenNumberInARange {

    public static void main(String[] args) {


        System.out.println("Max Min Array = " + solve(Arrays.asList(7, 3, 1, 5, 5, 5, 1, 2, 4, 5),
                Arrays.asList(Arrays.asList(6,9), Arrays.asList(2,9), Arrays.asList(2,4), Arrays.asList(0,9))));
    }

    public static ArrayList<Integer> solve(List<Integer> A, List<List<Integer>> B) {

        List<Integer> prefixEvenSum = new ArrayList<>();
        ArrayList<Integer> result = new ArrayList<>();

        int totalNumberDivisibleByTwo = 0;
        for(int i = 0; i< A.size() ; i++) {
            totalNumberDivisibleByTwo = ( A.get(i)%2 == 0 ? totalNumberDivisibleByTwo + 1 : totalNumberDivisibleByTwo);
            prefixEvenSum.add( totalNumberDivisibleByTwo );
        }


        for(int i=0; i<B.size() ; i++) {
            int left = B.get(i).get(0);
            int right = B.get(i).get(1);

            if(left == 0){
                result.add(prefixEvenSum.get(right));
            } else {
                result.add(prefixEvenSum.get(right) - prefixEvenSum.get(left-1) );
            }

        }

        return result;

    }
}
