package in.thilakraj;

/**
 * Problem Description
 * You are given an integer A, print 1 to A using using recursion.
 * <p>
 * Note :- After printing all the numbers from 1 to A, print a new line.
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
 * Print A space-separated integers 1 to A.
 * Note: There should be exactly one space after each integer. After printing all the integers, print a new line
 * <p>
 * <p>
 * <p>
 * Example Input
 * Input 1:
 * <p>
 * A = 10
 * Input 2:
 * <p>
 * A = 5
 * <p>
 * <p>
 * Example Output
 * Output 1:
 * <p>
 * 1 2 3 4 5 6 7 8 9 10
 * Output 2:
 * <p>
 * 1 2 3 4 5
 * <p>
 * <p>
 * Example Explanation
 * Explanation 1:
 * <p>
 * Print 1 to 10 space separated integers.
 * Explanation 2:
 * <p>
 * Print 1 to 5 space separated integers.
 */
public class Print1toAFunction {

    public static void main(String[] args) {
        solve(9);
    }

    public static void solve(int A) {
        elementPrint(A);
        System.out.println();
    }

    public static void elementPrint(int A) {
        if (A == 0) {
            return;
        }
        elementPrint(A - 1);
        System.out.print(A + " ");
    }
}
