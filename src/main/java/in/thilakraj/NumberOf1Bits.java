package in.thilakraj;

/**
 * Problem Description
 * Write a function that takes an integer and returns the number of 1 bits present in its binary representation.
 * <p>
 * <p>
 * Problem Constraints
 * 1 <= A <= 109
 * <p>
 * <p>
 * Input Format
 * First and only argument contains integer A
 * <p>
 * <p>
 * Output Format
 * Return an integer
 * <p>
 * <p>
 * Example Input
 * Input 1:
 * 11
 * Input 2:
 * 6
 * <p>
 * <p>
 * Example Output
 * Output 1:
 * 3
 * Output 2:
 * 2
 * <p>
 * <p>
 * Example Explanation
 * Explaination 1:
 * 11 is represented as 1011 in binary.
 * Explaination 2:
 * 6 is represented as 110 in binary.
 */
public class NumberOf1Bits {

    public static void main(String[] args) {

    }

    public int numSetBits(int A) {
        int result = 0;

        while (A > 0) {
            if ((A & 1) == 1) {
                result++;
            }
            A = A >> 1;
        }
        return result;
    }
}
