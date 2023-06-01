package in.thilakraj;

/**
 * Problem Description
 * You are given two integers A and B.
 * Set the A-th bit and B-th bit in 0, and return output in decimal Number System.
 *
 * Note:
 * The bit positions are 0-indexed, which means that the least significant bit (LSB) has index 0.
 *
 * Problem Constraints
 * 0 <= A <= 30
 * 0 <= B <= 30
 *
 *
 * Input Format
 * First argument A is an integer.
 * Second argument B is an integer.
 *
 *
 * Output Format
 * Return an integer.
 *
 * Example Input
 * Input 1:
 * A = 3
 * B = 5
 * Input 2:
 * A = 4
 * B = 4
 *
 *
 * Example Output
 * Output 1:
 * 40
 * Output 2:
 * 16
 */
public class SetBit {
    public static void main(String[] args) {
        System.out.println("Ans : "+ solve(3, 5));
        System.out.println("Ans : "+ solve(4, 4));
    }

    public static int solve(int A, int B) {
        return (1<<A)|(1<<B);
    }
}
