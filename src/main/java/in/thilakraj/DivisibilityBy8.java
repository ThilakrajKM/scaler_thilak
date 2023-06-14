package in.thilakraj;

/**
 * Problem Description
 * You are given a number A in the form of a string. Check if the number is divisible by eight or not.
 * <p>
 * Return 1 if it is divisible by eight else, return 0.
 * <p>
 * <p>
 * Problem Constraints
 * 1 <= length of the String <= 100000
 * '0' <= A[i] <= '9'
 * <p>
 * <p>
 * Input Format
 * The only argument given is a string A.
 * <p>
 * <p>
 * Output Format
 * Return 1 if it is divisible by eight else return 0.
 * <p>
 * <p>
 * Example Input
 * Input 1:
 * A = "16"
 * Input 2:
 * <p>
 * A = "123"
 * <p>
 * <p>
 * Example Output
 * Output 1:
 * 1
 * Output 2:
 * <p>
 * 0
 * <p>
 * <p>
 * Example Explanation
 * Explanation 1:
 * 16 = 8 * 2
 * Explanation 2:
 * <p>
 * 123 = 15 * 8 + 3
 */
public class DivisibilityBy8 {

    public static void main(String[] args) {

    }

    public int solve(String A) {
        String lastThreeDigit = A.length() > 3 ? A.substring(A.length() - 4) : A;
        Integer value = Integer.valueOf(lastThreeDigit);
        return value % 8 == 0 ? 1 : 0;
    }
}
