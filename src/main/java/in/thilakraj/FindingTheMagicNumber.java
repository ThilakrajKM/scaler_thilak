package in.thilakraj;

/**
 * Problem Description
 * Given an integer A, find and return the Ath magic number.
 * <p>
 * A magic number is defined as a number that can be expressed as a power of 5 or a sum of unique powers of 5.
 * <p>
 * First few magic numbers are 5, 25, 30(5 + 25), 125, 130(125 + 5), ….
 * <p>
 * <p>
 * <p>
 * Problem Constraints
 * 1 <= A <= 5000
 * <p>
 * <p>
 * <p>
 * Input Format
 * The only argument given is integer A.
 * <p>
 * <p>
 * <p>
 * Output Format
 * Return the Ath magic number.
 * <p>
 * <p>
 * <p>
 * Example Input
 * Example Input 1:
 * <p>
 * A = 3
 * Example Input 2:
 * <p>
 * A = 10
 * <p>
 * <p>
 * Example Output
 * Example Output 1:
 * <p>
 * 30
 * Example Output 2:
 * <p>
 * 650
 * <p>
 * <p>
 * Example Explanation
 * Explanation 1:
 * <p>
 * Magic Numbers in increasing order are [5, 25, 30, 125, 130, ...]
 * 3rd element in this is 30
 * Explanation 2:
 * <p>
 * In the sequence shown in explanation 1, 10th element will be 650.
 */
public class FindingTheMagicNumber {
    public static void main(String[] args) {
        System.out.println("Ans : " + solve(10));
    }

    public static int solve(int A) {
        int result = 0;
        int index = 0;

        while (A != 0) {
            if ((A & 1) == 1) {
                result += Math.pow(5, index);
            }
            index++;
            A = A >> 1;
        }

        return result;
    }
}
