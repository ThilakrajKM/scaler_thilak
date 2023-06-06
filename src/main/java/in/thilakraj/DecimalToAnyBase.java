package in.thilakraj;

/**
 * Q8. Decimal to Any Base
 * Problem Description
 * Given a decimal number A and a base B, convert it into its equivalent number in base B.
 * Problem Constraints
 * 0 <= A <= 512
 * 2 <= B <= 10
 * Input Format
 * The first argument will be decimal number A.
 * The second argument will be base B.
 * Output Format
 * Return the conversion of A in base B.
 * Example Input
 * Input 1:
 * A = 4
 * B = 3
 * Input 2:
 * A = 4
 * B = 2
 * Example Output
 * Output 1:
 * 11
 * Output 2:
 * 100
 */
public class DecimalToAnyBase {

    public int DecimalToAnyBase(int A, int B) {
        int result = 0;
        int rem = 0;
        int mul = 1;
        while (A > 0) {
            rem = A % B;
            result = result + (rem * mul);
            A = A / B;
            mul = mul * 10;
        }
        return result;
    }
}
