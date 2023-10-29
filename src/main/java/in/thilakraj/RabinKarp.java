package in.thilakraj;

/**
 * Problem Description
 * Given two string A and B of length N and M respectively consisting of lowercase letters. Find the number of occurrences of B in A.
 * <p>
 * <p>
 * Problem Constraints
 * 1 <= M <= N <= 105
 * <p>
 * <p>
 * <p>
 * Input Format
 * Two argument A and B are strings
 * <p>
 * <p>
 * Output Format
 * Return an integer denoting the number of occurrences of B in A
 * <p>
 * <p>
 * Example Input
 * Input 1:
 * A = "acbac"
 * B = "ac"
 * Input 2:
 * A = "aaaa"
 * B = "aa"
 * <p>
 * <p>
 * Example Output
 * Output 1:
 * 2
 * Output 2:
 * 3
 * <p>
 * <p>
 * Example Explanation
 * For Input 1:
 * The string "ac" occurs twice in "acbac".
 * For Input 2:
 * The string "aa" occurs thrice in "aaaa".
 */
public class RabinKarp {

    public int solve(String A, String B) {
        int result = 0;
        long bHashValue = 0;
        long aHashValue = 0;
        long pValue = 1;
        long lastValue = 0;

        for (int i = B.length() - 1; i >= 0; i--) {
            bHashValue += ((B.charAt(i) - 'a') * pValue);
            aHashValue += ((A.charAt(i) - 'a') * pValue);
            lastValue = pValue;
            pValue *= 29;
        }

        if (bHashValue == aHashValue) {
            result++;
        }

        for (int i = B.length(); i < A.length(); i++) {
            aHashValue = ((aHashValue - ((A.charAt(i - B.length()) - 'a') * lastValue)) * 29 + (A.charAt(i) - 'a'));
            if (aHashValue == bHashValue) {
                result++;
            }
        }

        return result;
    }
}
