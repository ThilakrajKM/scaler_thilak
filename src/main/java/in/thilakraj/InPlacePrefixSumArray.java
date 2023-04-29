package in.thilakraj;

import java.util.Arrays;
import java.util.List;

/**
 * In-place Prefix Sum
 * <p>
 * Problem Description
 * Given an array A of N integers. Construct prefix sum of the array in the given array itself.
 * <p>
 * Problem Constraints
 * 1 <= N <= 105
 * 1 <= A[i] <= 103
 * <p>
 * Input Format
 * Only argument A is an array of integers.
 * <p>
 * Output Format
 * Return an array of integers denoting the prefix sum of the given array.
 * <p>
 * <p>
 * Example Input
 * Input 1:
 * <p>
 * A = [1, 2, 3, 4, 5]
 * Input 2:
 * <p>
 * A = [4, 3, 2]
 * <p>
 * Example Output
 * Output 1:
 * <p>
 * [1, 3, 6, 10, 15]
 * Output 2:
 * <p>
 * [4, 7, 9]
 */
public class InPlacePrefixSumArray {

    public static void main(String[] args) {


        System.out.println("Max Min Array = " + solve(Arrays.asList(7, 3, 1, 5, 5, 5, 1, 2, 4, 5)));
    }

    public static List<Integer> solve(List<Integer> A) {
        for (int i = 0; i < A.size(); i++) {
            A.set(i, A.get(i) + (i == 0 ? 0 : A.get(i - 1)));
        }

        return A;
    }

}

/*

public class Solution {
    public ArrayList<Integer> solve(ArrayList<Integer> A, ArrayList<ArrayList<Integer>> B) {

        List<Integer> prefixFiveDivisible = new ArrayList<>();
        ArrayList<Integer> result = new ArrayList<>();

        int totalNumberDivisibleByFive = 0;
        for(int i = 0; i< A.size() ; i++) {
            totalNumberDivisibleByFive = ( A.get(i)%5 == 0 ? totalNumberDivisibleByFive + 1 : totalNumberDivisibleByFive);
            prefixFiveDivisible.add( totalNumberDivisibleByFive );
        }


        for(int i=0; i<B.size() ; i++) {
            int left = B.get(i).get(0);
            int right = B.get(i).get(1);

            if(left == 0){
                result.add(prefixFiveDivisible.get(right));
            } else {
                result.add(prefixFiveDivisible.get(right) - prefixFiveDivisible.get(left-1) );
            }

        }

        return result;

    }
}



public class Solution {
    public int solve(ArrayList<Integer> A) {

        int max = 0;
        int count = 0;

        for(int i =0; i<A.size() ; i++ ) {

            if(A.get(i)%2 == 0){
                if(max < count) {
                    max = count;
                }
                count =0;
            } else {
                count++;
            }
        }

        return (count > max ? count : max);
    }
}
*/

