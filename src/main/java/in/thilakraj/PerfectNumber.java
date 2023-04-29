package in.thilakraj;

/**
 * 4. Find the Perfect Number
 * <p>
 * You are given an integer A. You have to tell whether it is a perfect number or not.
 *
 * <b>Perfect number</b> is a positive integer which is equal to the sum of its proper positive divisors. </br>
 * <p>
 * A <b>proper divisor</b> of a natural number is the divisor that is strictly less than the number.
 * <p>
 * Problem Constraints
 * 1 <= A <= 106
 * <p>
 * <p>
 * <p>
 * Input Format
 * First and only argument contains a single positive integer A.
 * <p>
 * <p>
 * <p>
 * Output Format
 * Return 1 if A is a perfect number and 0 otherwise.
 */
public class PerfectNumber {

    public static void main(String[] args) {

        System.out.println("4 is perfect number = " + solve(4)); //0
        System.out.println("6 is perfect number = " + solve(6)); //1
        System.out.println("1 is perfect number = " + solve(1)); //0
    }

    public static int solve(int A) {
        int sumOfFactors = 0;

        for (int i = 1; i <= A / i; i++) {

            if (A % i == 0) {
                if (i * i == A) {
                    sumOfFactors += i;
                } else if (A % i == 0) {
                    sumOfFactors += i;
                    sumOfFactors += A / i;
                }
            }
        }

        return sumOfFactors - A == A ? 1 : 0;
    }
}
