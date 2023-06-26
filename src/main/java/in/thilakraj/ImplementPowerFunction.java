package in.thilakraj;

/**
 * Problem Description
 * Implement pow(A, B) % C.
 * In other words, given A, B and C, Find (AB % C).
 * Note: The remainders on division cannot be negative. In other words, make sure the answer you return is non-negative.
 * <p>
 * <p>
 * Problem Constraints
 * -109 <= A <= 109
 * 0 <= B <= 109
 * 1 <= C <= 109
 * <p>
 * <p>
 * Input Format
 * Given three integers A, B, C.
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
 * A = 3
 * B = 3
 * C = 1
 * <p>
 * <p>
 * Example Output
 * Output 1:
 * 2
 * Output 2:
 * 0
 * <p>
 * <p>
 * Example Explanation
 * Explanation 1:
 * 23 % 3 = 8 % 3 = 2
 * Explanation 2:
 * 33 % 1 = 27 % 1 = 0
 */
public class ImplementPowerFunction {

    public int pow(int A, int B, int C) {

        if (A == 0) {
            return 0;
        }

        if (A < 0 && B % 2 != 0) {
            int value = recursivePow(A * -1, B, C);
            return C - value;
        } else {
            int value = recursivePow(A * -1, B, C);
            if (value < 0) {
                value = value * -1;
            }
            return value;
        }

    }

    public int recursivePow(int a, int b, int m) {
        if (b == 0) {
            return 1;
        }

        long x = recursivePow(a, b / 2, m);

        if (b % 2 == 0) {
            return (int) ((x * x) % m);
        } else {

            return (int) ((((x * x) % m) * (a % m)) % m);
        }
    }

}
