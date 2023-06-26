package in.thilakraj;

/**
 * Problem Description
 * You are given an integer A, print A to 1 using using recursion.
 * <p>
 * Note :- After printing all the numbers from A to 1, print a new line.
 * <p>
 * <p>
 * <p>
 * Problem Constraints
 * 1 <= A <= 104
 * <p>
 * <p>
 * <p>
 * Input Format
 * First argument A is an integer.
 * <p>
 * <p>
 * <p>
 * Output Format
 * Print A space-separated integers A to 1.
 * Note: There should be exactly one space after each integer. Print a new line after printing the A integers
 * <p>
 * <p>
 * <p>
 * Example Input
 * Input 1:
 * <p>
 * 10
 * Input 2:
 * <p>
 * 5
 * <p>
 * <p>
 * Example Output
 * Output 1:
 * <p>
 * 10 9 8 7 6 5 4 3 2 1
 * Output 2:
 * <p>
 * 5 4 3 2 1
 * <p>
 * <p>
 * Example Explanation
 * Explanation 1:
 * <p>
 * Print 10 to 1 space separated integers.
 * Explanation 2:
 * <p>
 * Print 5 to 1 space separated integers.
 */
public class PrintAto1Function {
    public void solve(int A) {
        System.out.print(A + " ");
        if (A == 1) {
            System.out.println();
            return;
        }
        solve(A - 1);
    }
}
