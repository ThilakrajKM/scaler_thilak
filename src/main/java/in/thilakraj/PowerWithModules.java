package in.thilakraj;

/**
 * Problem Description
 * You are given A, B and C .
 * Calculate the value of (A ^ B) % C
 * <p>
 * <p>
 * Problem Constraints
 * 1 <= A <= 109
 * 0 <= B <= 105
 * 1 <= C <= 109
 * <p>
 * <p>
 * Input Format
 * Given three integers A, B and C.
 * <p>
 * <p>
 * Output Format
 * Return an integer.
 * <p>
 * <p>
 * Example Input
 * Input 1:
 * A = 2
 * B = 3
 * C = 3
 * Input 2:
 * A = 5
 * B = 2
 * C = 4
 * <p>
 * <p>
 * Example Output
 * Output 1:
 * 2
 * Output 2:
 * 1
 * <p>
 * <p>
 * Example Explanation
 * For Input 1:
 * (2 ^ 3) % 3 = 8 % 3 = 2
 * For Input 2:
 * (5 ^ 2) % 4 = 25 % 4 = 1
 */
public class PowerWithModules {

    public static void main(String[] args) {
        System.out.println("Ans " + solve(55711, 284, 64649));
    }

    public static int solve(int A, int B, int C) {

        long result = 1;
        while (B > 0) {
            result = (result * A) % C;
            B--;
        }

        return (int) result;
    }
}
