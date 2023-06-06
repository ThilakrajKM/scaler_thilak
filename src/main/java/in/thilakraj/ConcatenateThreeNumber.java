package in.thilakraj;

import java.util.Arrays;

/**
 * Problem Description
 * Given three 2-digit integers, A, B, and C, find out the minimum number obtained by concatenating them in any order.
 * <p>
 * Return the minimum result obtained.
 * <p>
 * <p>
 * <p>
 * Problem Constraints
 * 10 <= A, B, C <= 99
 * <p>
 * <p>
 * <p>
 * Input Format
 * The first argument of input contains an integer, A.
 * <p>
 * The second argument of input contains an integer, B.
 * <p>
 * The third argument of input contains an integer, C.
 * <p>
 * <p>
 * <p>
 * Output Format
 * Return an integer representing the answer.
 * <p>
 * <p>
 * <p>
 * Example Input
 * Input 1:
 * <p>
 * A = 10
 * B = 20
 * C = 30
 * Input 2:
 * <p>
 * A = 55
 * B = 43
 * C = 47
 * <p>
 * <p>
 * Example Output
 * Output 1:
 * <p>
 * 102030
 * Output 2:
 * <p>
 * 434755
 * <p>
 * <p>
 * Example Explanation
 * Explanation 1:
 * <p>
 * 10 + 20 + 30 = 102030
 * Explanation 2:
 * <p>
 * 43 + 47 + 55 = 434755
 */
public class ConcatenateThreeNumber {

    public static void main(String[] args) {
        System.out.println("Ans : " + solve(97, 32, 28));
    }

    public static int solve(int A, int B, int C) {

        int[] num = {A, B, C};
        Arrays.sort(num);

        return num[0] * 10000 + num[1] * 100 + num[2];

    }
}
