package in.thilakraj;

/**
 * Problem Description
 * Given a string A of size N, find and return the longest palindromic substring in A.
 * <p>
 * Substring of string A is A[i...j] where 0 <= i <= j < len(A)
 * <p>
 * Palindrome string:
 * A string which reads the same backwards. More formally, A is palindrome if reverse(A) = A.
 * <p>
 * Incase of conflict, return the substring which occurs first ( with the least starting index).
 * <p>
 * <p>
 * <p>
 * Problem Constraints
 * 1 <= N <= 6000
 * <p>
 * <p>
 * <p>
 * Input Format
 * First and only argument is a string A.
 * <p>
 * <p>
 * <p>
 * Output Format
 * Return a string denoting the longest palindromic substring of string A.
 * <p>
 * <p>
 * <p>
 * Example Input
 * Input 1:
 * A = "aaaabaaa"
 * Input 2:
 * A = "abba
 * <p>
 * <p>
 * Example Output
 * Output 1:
 * "aaabaaa"
 * Output 2:
 * "abba"
 * <p>
 * <p>
 * Example Explanation
 * Explanation 1:
 * We can see that longest palindromic substring is of length 7 and the string is "aaabaaa".
 * Explanation 2:
 * We can see that longest palindromic substring is of length 4 and the string is "abba".
 */
public class LongestPalindromicString {

    public static void main(String[] args) {
        System.out.println("Ans : " + longestPalindrome("abb"));
        //System.out.println("Ans : " + longestPalindrome("abdbc"));
    }

    public static String longestPalindrome(String A) {

        int ansP1 = 0, ansP2 = 0, ansLen = 0;

        //odd length
        for (int i = 0; i < A.length(); i++) {
            int p1 = i, p2 = i;
            while (p1 >= 0 && p2 < A.length() && A.charAt(p1) == A.charAt(p2)) {
                p1 = p1 - 1;
                p2 = p2 + 1;
            }
            p1++;
            p2--;
            int len = p2 - p1 + 1;
            if (len > ansLen && p2 < A.length() && p1 >= 0) {
                ansLen = len;
                ansP1 = p1;
                ansP2 = p2;
            }
        }

        //even length
        for (int i = 0; i < A.length(); i++) {
            int p1 = i, p2 = i + 1;
            while (p1 >= 0 && p2 < A.length() && A.charAt(p1) == A.charAt(p2)) {
                p1 = p1 - 1;
                p2 = p2 + 1;
            }
            p1++;
            p2--;
            int len = p2 - p1 + 1;
            if (len > ansLen && p2 < A.length() && p1 >= 0) {
                ansLen = len;
                ansP1 = p1;
                ansP2 = p2;
            }
        }

        char[] resultArray = new char[ansP2 - ansP1 + 1];
        for (int i = ansP1; i <= ansP2; i++) {
            resultArray[i - ansP1] = A.charAt(i);
        }
        return new String(resultArray);
    }
}
