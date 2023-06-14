package in.thilakraj;

/**
 * Q1. Toggle i-th bit
 * Problem Description
 * You are given two integers A and B.
 * If B-th bit in A is set, make it unset
 * If B-th bit in A is unset, make it set
 * Return the updated A value
 * <p>
 * <p>
 * Problem Constraints
 * 1 <= A <= 10^9
 * 0 <= B <= 30
 * <p>
 * Input Format
 * First argument A is an integer.
 * Second argument B is an integer.
 * <p>
 * <p>
 * Output Format
 * Return an integer.
 * <p>
 * Example Input
 * Input 1:
 * A = 4
 * B = 1
 * Input 2:
 * A = 5
 * B = 2
 * <p>
 * <p>
 * Example Output
 * Output 1:
 * 6
 * Output 2:
 * 1
 */
public class ToggleIthBit {

    public static void main(String[] args) {
        System.out.println("Ans : " + solve(4, 1));
    }

    public static int solve(int A, int B) {
        return A ^ (1 << B);
    }
}
