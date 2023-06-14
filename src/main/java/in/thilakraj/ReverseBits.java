package in.thilakraj;

/**
 * Problem Description
 * Reverse the bits of an 32 bit unsigned integer A.
 * <p>
 * <p>
 * <p>
 * Problem Constraints
 * 0 <= A <= 232
 * <p>
 * <p>
 * <p>
 * Input Format
 * First and only argument of input contains an integer A.
 * <p>
 * <p>
 * <p>
 * Output Format
 * Return a single unsigned integer denoting the decimal value of reversed bits.
 * <p>
 * <p>
 * <p>
 * Example Input
 * Input 1:
 * <p>
 * 0
 * Input 2:
 * <p>
 * 3
 * <p>
 * <p>
 * Example Output
 * Output 1:
 * <p>
 * 0
 * Output 2:
 * <p>
 * 3221225472
 * <p>
 * <p>
 * Example Explanation
 * Explanation 1:
 * <p>
 * 00000000000000000000000000000000
 * =>      00000000000000000000000000000000
 * Explanation 2:
 * <p>
 * 00000000000000000000000000000011
 * =>      11000000000000000000000000000000
 */
public class ReverseBits {

    public static void main(String[] args) {

    }

    public long reverse(long a) {

        long result = 0;
        int index = 31;

        while (a != 0) {

            if ((a & 1) == 1) {
                result += Math.pow(2L, index);
            }
            index--;
            a = (a >> 1);
        }

        return result;
    }
}
