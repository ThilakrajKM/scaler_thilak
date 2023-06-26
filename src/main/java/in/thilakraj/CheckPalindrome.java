package in.thilakraj;

/**
 * Problem Description
 * Write a recursive function that checks whether string A is a palindrome or Not.
 * Return 1 if the string A is a palindrome, else return 0.
 * <p>
 * Note: A palindrome is a string that's the same when read forward and backward.
 * <p>
 * <p>
 * <p>
 * Problem Constraints
 * 1 <= |A| <= 50000
 * <p>
 * String A consists only of lowercase letters.
 * <p>
 * <p>
 * <p>
 * Input Format
 * The first and only argument is a string A.
 * <p>
 * <p>
 * <p>
 * Output Format
 * Return 1 if the string A is a palindrome, else return 0.
 * <p>
 * <p>
 * <p>
 * Example Input
 * Input 1:
 * <p>
 * A = "naman"
 * Input 2:
 * <p>
 * A = "strings"
 * <p>
 * <p>
 * Example Output
 * Output 1:
 * <p>
 * 1
 * Output 2:
 * <p>
 * 0
 * <p>
 * <p>
 * Example Explanation
 * Explanation 1:
 * <p>
 * "naman" is a palindomic string, so return 1.
 * Explanation 2:
 * <p>
 * "strings" is not a palindrome, so return 0.
 */
public class CheckPalindrome {

    public static void main(String[] args) {
        System.out.println("Ans " + solve("naman"));
    }

    public static int solve(String A) {
        return isAPalindrome(A, 0, A.length() - 1);
    }

    public static int isAPalindrome(String str, int s, int e) {
        if (s >= e) {
            return 1;
        }

        if (str.charAt(s) != str.charAt(e)) {
            return 0;
        }

        return isAPalindrome(str, ++s, --e);
    }
}
