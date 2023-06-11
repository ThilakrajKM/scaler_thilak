package in.thilakraj;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Problem Description
 * Given an array A of non-negative integers, arrange them such that they form the largest number.
 *
 * Note: The result may be very large, so you need to return a string instead of an integer.
 *
 *
 *
 * Problem Constraints
 * 1 <= len(A) <= 100000
 * 0 <= A[i] <= 2*109
 *
 *
 *
 * Input Format
 * The first argument is an array of integers.
 *
 *
 *
 * Output Format
 * Return a string representing the largest number.
 *
 *
 *
 * Example Input
 * Input 1:
 *
 *  A = [3, 30, 34, 5, 9]
 * Input 2:
 *
 *  A = [2, 3, 9, 0]
 *
 *
 * Example Output
 * Output 1:
 *
 *  "9534330"
 * Output 2:
 *
 *  "9320"
 *
 *
 * Example Explanation
 * Explanation 1:
 *
 * Reorder the numbers to [9, 5, 34, 3, 30] to form the largest number.
 * Explanation 2:
 *
 * Reorder the numbers to [9, 3, 2, 0] to form the largest number 9320.
 */
public class LargestNumber {

    public static void main(String[] args) {
        System.out.println(" Ans : "+ largestNumber(Arrays.asList(3,30,34,5,9)));
        System.out.println(" Ans : "+ largestNumber(Arrays.asList(8, 89)));
    }

    public static String largestNumber(final List<Integer> A) {

        List<String> stringNumbers = A.stream().map(String::valueOf).collect(Collectors.toList());

        Comparator<String> largestNumberComparator = (left, right) -> {
            String leftSide = left + right;
            String rightSide = right  + left;
            return rightSide.compareTo(leftSide);
        };

        Collections.sort(stringNumbers, largestNumberComparator);

        String result = "";
        int zeroCount = 0;
        for(int i=0;i< stringNumbers.size(); i++) {
            result += stringNumbers.get(i);
            if(A.get(i)==0){
                zeroCount++;
            }
        }

        return zeroCount == A.size() ? "0" : result;
    }
}
