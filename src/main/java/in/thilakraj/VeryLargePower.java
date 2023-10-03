package in.thilakraj;

/**
 * Problem Description
 * Given two Integers A, B. You have to calculate (A ^ (B!)) % (1e9 + 7).
 * <p>
 * "^" means power,
 * "%" means mod, and
 * "!" means factorial.
 * <p>
 * Note: Ensure to handle integer overflow when performing the calculations.
 * <p>
 * <p>
 * Problem Constraints
 * 1 <= A, B <= 5e5
 * <p>
 * <p>
 * <p>
 * Input Format
 * First argument is the integer A
 * <p>
 * Second argument is the integer B
 * <p>
 * <p>
 * <p>
 * Output Format
 * Return one integer, the answer to the problem
 * <p>
 * <p>
 * <p>
 * Example Input
 * Input 1:
 * <p>
 * A = 1
 * B = 1
 * Input 2:
 * <p>
 * A = 2
 * B = 2
 * <p>
 * <p>
 * Example Output
 * Output 1:
 * <p>
 * 1
 * Output 2:
 * <p>
 * 4
 */
public class VeryLargePower {

    public static void main(String[] args) {

        int M = 1000000007;
        //System.out.println(power(2, factorial(2), M)%M);
        //System.out.println(factorial(68, M));
        //System.out.println(factorial(68, M-1));
        System.out.println(power(35, factorial(68, M - 1), M) % M); //798489844

    }

    static long power(int a, long b, int B) {
        if (b == 0) {
            return 1l;
        }
        long p = power(a, b / 2, B) % B;
        p = (p * p) % B;
        if (b % 2 == 0) {
            return p;
        } else {
            return (a * p) % B;
        }
    }


    public static long factorial(long b, int m) {
        if (b <= 1) {
            return 1;
        }
        return (b % m) * (factorial(b - 1, m) % m);
    }


}
