package in.thilakraj;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Problem Description
 * Given an array A of non-negative integers, arrange them such that they form the largest number.
 * <p>
 * Note: The result may be very large, so you need to return a string instead of an integer.
 * <p>
 * <p>
 * <p>
 * Problem Constraints
 * 1 <= len(A) <= 100000
 * 0 <= A[i] <= 2*109
 * <p>
 * <p>
 * <p>
 * Input Format
 * The first argument is an array of integers.
 * <p>
 * <p>
 * <p>
 * Output Format
 * Return a string representing the largest number.
 * <p>
 * <p>
 * <p>
 * Example Input
 * Input 1:
 * <p>
 * A = [3, 30, 34, 5, 9]
 * Input 2:
 * <p>
 * A = [2, 3, 9, 0]
 * <p>
 * <p>
 * Example Output
 * Output 1:
 * <p>
 * "9534330"
 * Output 2:
 * <p>
 * "9320"
 * <p>
 * <p>
 * Example Explanation
 * Explanation 1:
 * <p>
 * Reorder the numbers to [9, 5, 34, 3, 30] to form the largest number.
 * Explanation 2:
 * <p>
 * Reorder the numbers to [9, 3, 2, 0] to form the largest number 9320.
 */
public class LargestNumber {

    public static void main(String[] args) {
        System.out.println(" Ans : " + largestNumber(Arrays.asList(3, 30, 34, 5, 9)));
        System.out.println(" Ans : " + largestNumber(Arrays.asList(8, 89)));
    }

    public static String largestNumber(final List<Integer> A) {

        List<String> stringNumbers = A.stream().map(String::valueOf).collect(Collectors.toList());

        Comparator<String> largestNumberComparator = (left, right) -> {
            String leftSide = left + right;
            String rightSide = right + left;
            return rightSide.compareTo(leftSide);
        };

        Collections.sort(stringNumbers, largestNumberComparator);

        String result = "";
        int zeroCount = 0;
        for (int i = 0; i < stringNumbers.size(); i++) {
            result += stringNumbers.get(i);
            if (A.get(i) == 0) {
                zeroCount++;
            }
        }

        return zeroCount == A.size() ? "0" : result;
    }
}
