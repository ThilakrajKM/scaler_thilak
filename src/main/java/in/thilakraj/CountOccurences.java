package in.thilakraj;

/**
 * Problem Description
 * Find the number of occurrences of bob in string A consisting of lowercase English alphabets.
 * <p>
 * <p>
 * <p>
 * Problem Constraints
 * 1 <= |A| <= 1000
 * <p>
 * <p>
 * Input Format
 * The first and only argument contains the string A, consisting of lowercase English alphabets.
 * <p>
 * <p>
 * Output Format
 * Return an integer containing the answer.
 * <p>
 * <p>
 * Example Input
 * Input 1:
 * <p>
 * "abobc"
 * Input 2:
 * <p>
 * "bobob"
 * <p>
 * <p>
 * Example Output
 * Output 1:
 * <p>
 * 1
 * Output 2:
 * <p>
 * 2
 * <p>
 * <p>
 * Example Explanation
 * Explanation 1:
 * <p>
 * The only occurrence is at second position.
 * Explanation 2:
 * <p>
 * Bob occures at first and third position.
 */
public class CountOccurences {

    public int solve(String A) {
        int result = 0;
        for (int i = 0; i < A.length() - 3; i++) {
            if (A.charAt(i) == 'b' && A.charAt(i + 1) == '0' && A.charAt(i + 2) == 'b') {
                result++;
            }
        }
        return result;
    }
}
