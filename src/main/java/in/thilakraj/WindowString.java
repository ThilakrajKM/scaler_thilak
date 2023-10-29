package in.thilakraj;

import java.util.HashMap;

/**
 * Problem Description
 * Given a string A and a string B, find the window with minimum length in A, which will contain all the characters in B in linear time complexity.
 * Note that when the count of a character c in B is x, then the count of c in the minimum window in A should be at least x.
 * <p>
 * Note:
 * <p>
 * If there is no such window in A that covers all characters in B, return the empty string.
 * If there are multiple such windows, return the first occurring minimum window ( with minimum start index and length )
 * <p>
 * <p>
 * Problem Constraints
 * 1 <= size(A), size(B) <= 106
 * <p>
 * <p>
 * <p>
 * Input Format
 * The first argument is a string A.
 * The second argument is a string B.
 * <p>
 * <p>
 * <p>
 * Output Format
 * Return a string denoting the minimum window.
 * <p>
 * <p>
 * <p>
 * Example Input
 * Input 1:
 * <p>
 * A = "ADOBECODEBANC"
 * B = "ABC"
 * Input 2:
 * <p>
 * A = "Aa91b"
 * B = "ab"
 * <p>
 * <p>
 * Example Output
 * Output 1:
 * <p>
 * "BANC"
 * Output 2:
 * <p>
 * "a91b"
 * <p>
 * <p>
 * Example Explanation
 * Explanation 1:
 * <p>
 * "BANC" is a substring of A which contains all characters of B.
 * Explanation 2:
 * <p>
 * "a91b" is the substring of A which contains all characters of B.
 */
public class WindowString {

    public static void main(String[] args) {
        System.out.println(minWindow("ADOBECODEBANC", "ABC"));
    }

    public static String minWindow(String A, String B) {

        int[] requiredCharCount = new int[256];
        int[] currentCharCount = new int[256];

        for (int i = 0; i < B.length(); i++) {
            requiredCharCount[B.charAt(i)]++;
        }

        if (A.length() <= B.length()) {
            return "";
        }

        for (int i = 0; i < B.length() && i < A.length(); i++) {
            currentCharCount[A.charAt(i)]++;
        }

        if (validateCharCount(requiredCharCount, currentCharCount)) {
            return B;
        }


        int left = 0, right = B.length();
        currentCharCount[A.charAt(right)]++;

        long ansi = Integer.MAX_VALUE, ansj = Integer.MAX_VALUE;

        while (right < A.length()) {
            if (validateCharCount(requiredCharCount, currentCharCount)) {
                if (left + right < ansi + ansj) {
                    ansi = left;
                    ansj = right;
                }
                currentCharCount[A.charAt(left)]--;
                left++;
            } else {
                right++;
                if (right == A.length()) {
                    if (validateCharCount(requiredCharCount, currentCharCount)) {
                        if (left + right - 1 < ansi + ansj) {
                            ansi = left;
                            ansj = right - 1;
                        }
                    }
                    break;
                }
                currentCharCount[A.charAt(right)]++;
            }
        }

        char[] result = new char[((int) ansi + (int) ansj + 1)];

        for (int i = (int) ansi; i <= ansj; i++) {
            result[(int) (i - ansi)] = A.charAt(i);
        }

        return new String(result);
    }

    private static boolean validateCharCount(int[] requiredCharCount, int[] currentCharCount) {
        for (int i = 0; i < 256; i++) {
            if (requiredCharCount[i] != 0 && requiredCharCount[i] != currentCharCount[i]) {
                return false;
            }
        }
        return true;
    }


    static String minLengthSubString(String A, String B) {
        int n = A.length();
        int m = B.length();
        if (n < m)
            return "";

        HashMap<Character, Integer> A_map = new HashMap<>();
        HashMap<Character, Integer> B_map = new HashMap<>();
        for (int i = 0; i <= 255; i++) {
            char ch = (char) (i);
            A_map.put(ch, i);
            B_map.put(ch, i);
        }
        for (int i = 0; i < m; i++) {
            char ch = A.charAt(i);
            if (!A_map.containsKey(ch))
                A_map.put(ch, 1);
            else {
                int val = A_map.get(ch);
                A_map.put(ch, ++val);
            }
        }

        for (int i = 0; i < m; i++) {
            char ch = B.charAt(i);
            if (!B_map.containsKey(ch))
                B_map.put(ch, 1);
            else {
                int val = B_map.get(ch);
                B_map.put(ch, ++val);
            }
        }
        int p1 = 0;
        int p2 = m - 1;
        int startingPoint = -1;
        int endingPoint = -1;
        int ans = Integer.MAX_VALUE;
        while (p2 < n) {
            if (check(A_map, B_map)) {
                if (ans > (p2 - p1 + 1)) {
                    ans = p2 - p1 + 1;
                    startingPoint = p1;
                    endingPoint = p2;
                }
                char ch = A.charAt(p1);
                int freq = A_map.get(ch);
                freq--;
                A_map.put(ch, freq);
                if (freq == 0)
                    A_map.remove(ch);
                p1++;
            } else {
                p2++;
                if (p2 == n)
                    break;
                char ch = A.charAt(p2);
                int freq = (A_map.containsKey(ch)) ? A_map.get(ch) : 0;
                freq++;
                A_map.put(ch, freq);
            }
        }
        if (ans == Integer.MAX_VALUE)
            return "";
        return A.substring(startingPoint, endingPoint + 1);
    }

    static boolean check(HashMap<Character, Integer> A, HashMap<Character, Integer> B) {
        for (int i = 0; i <= 255; i++) {
            char ch = (char) (i);
            if (B.get(ch) > A.get(ch))
                return false;
        }
        return true;
    }

}
