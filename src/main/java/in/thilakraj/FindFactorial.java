package in.thilakraj;

/**
 * Problem Description
 * Write a program to find the factorial of the given number A using recursion.
 * <p>
 * Note: The factorial of a number N is defined as the product of the numbers from 1 to N.
 * <p>
 * <p>
 * Problem Constraints
 * 0 <= A <= 12
 * <p>
 * <p>
 * <p>
 * Input Format
 * First and only argument is an integer A.
 * <p>
 * <p>
 * <p>
 * Output Format
 * Return an integer denoting the factorial of the number A.
 * <p>
 * <p>
 * <p>
 * Example Input
 * Input 1:
 * <p>
 * A = 4
 * Input 2:
 * <p>
 * A = 1
 * <p>
 * <p>
 * Example Output
 * Output 1:
 * <p>
 * 24
 * Output 2:
 * <p>
 * 1
 * <p>
 * <p>
 * Example Explanation
 * Explanation 1:
 * <p>
 * Factorial of 4 = 4 * 3 * 2 * 1 = 24
 * Explanation 2:
 * <p>
 * Factorial of 1 = 1
 */
public class FindFactorial {
    public int solve(int A) {
        if (A == 1) {
            return 1;
        }

        return solve(A - 1) * A;
    }
}
