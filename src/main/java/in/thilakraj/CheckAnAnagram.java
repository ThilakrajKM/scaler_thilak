package in.thilakraj;

/**
 * Problem Description
 * You are given two lowercase strings A and B each of length N. Return 1 if they are anagrams to each other and 0 if not.
 * <p>
 * Note : Two strings A and B are called anagrams to each other if A can be formed after rearranging the letters of B.
 * <p>
 * <p>
 * Problem Constraints
 * 1 <= N <= 105
 * A and B are lowercase strings
 * <p>
 * <p>
 * Input Format
 * Both arguments A and B are a string.
 * <p>
 * <p>
 * Output Format
 * Return 1 if they are anagrams and 0 if not
 * <p>
 * <p>
 * Example Input
 * Input 1:
 * A = "cat"
 * B = "bat"
 * Input 2:
 * A = "secure"
 * B = "rescue"
 * <p>
 * <p>
 * Example Output
 * Output 1:
 * 0
 * Output 2:
 * 1
 * <p>
 * <p>
 * Example Explanation
 * For Input 1:
 * The words cannot be rearranged to form the same word. So, they are not anagrams.
 * For Input 2:
 * They are an anag
 */
public class CheckAnAnagram {

    public int solve(String A, String B) {

        int[] charFreq = new int[26];

        for (int i = 0; i < A.length(); i++) {
            charFreq[A.charAt(i) - 'a']++;
        }

        for (int i = 0; i < B.length(); i++) {
            charFreq[B.charAt(i) - 'a']--;
        }

        for (int i = 0; i < 26; i++) {
            if (charFreq[i] > 0) {
                return 0;
            }
        }

        return 1;
    }
}
