package in.thilakraj;

import java.util.Arrays;

/**
 * Problem Description
 * You are given a string A of size N consisting of lowercase alphabets.
 * <p>
 * You can change at most B characters in the given string to any other lowercase alphabet such that the number of distinct characters in the string is minimized.
 * <p>
 * Find the minimum number of distinct characters in the resulting string.
 * <p>
 * <p>
 * <p>
 * Problem Constraints
 * 1 <= N <= 100000
 * <p>
 * 0 <= B <= N
 * <p>
 * <p>
 * <p>
 * Input Format
 * The first argument is a string A.
 * <p>
 * The second argument is an integer B.
 * <p>
 * <p>
 * <p>
 * Output Format
 * Return an integer denoting the minimum number of distinct characters in the string.
 * <p>
 * <p>
 * <p>
 * Example Input
 * A = "abcabbccd"
 * B = 3
 * <p>
 * <p>
 * <p>
 * Example Output
 * 2
 * <p>
 * <p>
 * <p>
 * Example Explanation
 * We can change both 'a' and one 'd' into 'b'.So the new string becomes "bbcbbbccb".
 * So the minimum number of distinct character will be 2.
 */
public class ChangeCharacter {

    public static void main(String[] args) {
        System.out.println("Ans : " + solve("umeaylnlfd", 1));
    }

    public static int solve(String A, int B) {
        int[] charFreq = new int[26];

        if (A.length() <= 1) {
            return 0;
        }

        for (int i = 0; i < A.length(); i++) {
            charFreq[A.charAt(i) - 'a']++;
        }

        Arrays.sort(charFreq);

        for (int i = 0; i < 26; i++) {
            if (charFreq[i] > 0 && charFreq[i] <= B && B > 0) {
                int tempFreq = charFreq[i];
                charFreq[i] = (charFreq[i] - B) < 0 ? 0 : charFreq[i] - B;
                B = B - tempFreq;
            }
        }

        int result = 0;
        for (int i = 0; i < 26; i++) {
            if (charFreq[i] > 0) {
                result++;
            }
        }

        return result;
    }
}
