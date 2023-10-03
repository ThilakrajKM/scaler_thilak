package in.thilakraj;

/**
 * Problem Description
 * Given two integers A and B. Find the value of A-1 mod B where B is a prime number and gcd(A, B) = 1.
 * <p>
 * A-1 mod B is also known as modular multiplicative inverse of A under modulo B.
 * <p>
 * <p>
 * <p>
 * Problem Constraints
 * 1 <= A <= 109
 * 1<= B <= 109
 * B is a prime number
 * <p>
 * <p>
 * <p>
 * Input Format
 * First argument is an integer A.
 * Second argument is an integer B.
 * <p>
 * <p>
 * <p>
 * Output Format
 * Return an integer denoting the modulor inverse
 * <p>
 * <p>
 * <p>
 * Example Input
 * Input 1:
 * <p>
 * A = 3
 * B = 5
 * Input 2:
 * <p>
 * A = 6
 * B = 23
 * <p>
 * <p>
 * Example Output
 * Output 1:
 * <p>
 * 2
 * Output 2:
 * <p>
 * 4
 * <p>
 * <p>
 * Example Explanation
 * Explanation 1:
 * <p>
 * Let's say A-1 mod B = X, then (A * X) % B = 1.
 * 3 * 2 = 6, 6 % 5 = 1.
 * Explanation 2:
 * <p>
 * Similarly, (6 * 4) % 23 = 1.
 */
public class PrimeModuloInverse {

    public static void main(String[] args) {
        /*System.out.println(solve(3,5));
        System.out.println(solve(3,11));
        System.out.println(solve(6,23));*/
        System.out.println(solve(12, 55557209));   //32408372
    }

    public static int solve(int A, int B) {

        if (gcd(A, B) == 1) {
            return (int) (power(A, B - 2, B) % B);
        }

        return -1;
    }

    /*static int power(int x, int y, int M)
    {
        if (y == 0)
            return 1;
        int p = power(x, y / 2, M) % M;
        p = (int)((p * (long)p) % M);
        if (y % 2 == 0)
            return p;
        else
            return (int)((x * (long)p) % M);
    }*/

    static long power(int a, int b, int B) {
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


    //check is modulo inverse is present if 1 then modulo inverse is present
    static int gcd(int a, int b) {
        if (a == 0) {
            return b;
        }
        return gcd(b % a, a);
    }
}
