package in.thilakraj;

/**
 * Problem Description
 * Given three integers A, B, and C, where A represents n, B represents r, and C represents m, find and return the value of nCr % m where nCr % m = (n!/((n-r)!*r!))% m.
 * <p>
 * x! means factorial of x i.e. x! = 1 * 2 * 3... * x.
 * <p>
 * <p>
 * <p>
 * Problem Constraints
 * 1 <= A * B <= 106
 * <p>
 * 1 <= B <= A
 * <p>
 * 1 <= C <= 106
 * <p>
 * <p>
 * <p>
 * Input Format
 * The first argument given is integer A ( = n).
 * The second argument given is integer B ( = r).
 * The third argument given is integer C ( = m).
 * <p>
 * <p>
 * Output Format
 * Return the value of nCr % m.
 * <p>
 * <p>
 * <p>
 * Example Input
 * Input 1:
 * <p>
 * A = 5
 * B = 2
 * C = 13
 * Input 2:
 * <p>
 * A = 6
 * B = 2
 * C = 13
 * <p>
 * <p>
 * Example Output
 * Output 1:
 * <p>
 * 10
 * Output 2:
 * <p>
 * 2
 * <p>
 * <p>
 * Example Explanation
 * Explanation 1:
 * <p>
 * The value of 5C2 % 11 is 10.
 * Explanation 2:
 * <p>
 * The value of 6C2 % 13 is 2.
 * <p>
 * //nCr = n-1Cr-1 + n-1Cr.
 */

public class ComputeNCRModM {

    public static void main(String[] args) {
//        System.out.println(solve(16,16, 53));
        System.out.println(solve(5, 2, 13));
    }

    //Dynamic Programming Approach
    //nCr = n-1Cr-1 + n-1Cr.

    public static int solve(int A, int B, int C) {
        long[][] nCr = new long[A + 1][B + 1];

        for (int i = 0; i <= A; i++) {
            for (int j = 0; j <= Math.min(i, B); j++) {
                if (j == 0 || i == j) {
                    nCr[i][j] = 1;
                } else if (i - 1 >= 0 && j - 1 >= 0) {
                    nCr[i][j] = (((nCr[i - 1][j - 1]) % C) + ((nCr[i - 1][j]) % C)) % C;
                }
            }
        }

        return (int) (nCr[A][B] % C);
    }
}
