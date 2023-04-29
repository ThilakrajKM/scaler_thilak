package in.thilakraj;

/**
 * 3.
 * Problem Description
 * <p>
 * Given a number A. Return square root of the number if it is perfect square otherwise return -1.
 * <p>
 * Problem Constraints
 * <p>
 * 1 <= A <= 10^8
 * Input Format
 * <p>
 * First and the only argument is an integer A.
 * Output Format
 * <p>
 * Return an integer which is the square root of A if A is perfect square otherwise return -1.
 */
public class SqrtN {

    public static void main(String[] args) {

        System.out.println("Sqrt of 4 = " + solve(4));
        System.out.println("Sqrt of 1001 = " + solve(1001));
        System.out.println("Sqrt of 84630800 = " + solve(84630800));
    }

    public static int solve(int A) {
        for (int i = 1; i <= A / i; i++) {
            if (i * i == A) {
                return i;
            }
        }
        return -1;
    }
}
