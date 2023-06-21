package in.thilakraj;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Problem Description
 * Given the array of strings A, you need to find the longest string S, which is the prefix of ALL the strings in the array.
 * <p>
 * The longest common prefix for a pair of strings S1 and S2 is the longest string S which is the prefix of both S1 and S2.
 * <p>
 * Example: the longest common prefix of "abcdefgh" and "abcefgh" is "abc".
 * <p>
 * <p>
 * <p>
 * Problem Constraints
 * 0 <= sum of length of all strings <= 1000000
 * <p>
 * <p>
 * <p>
 * Input Format
 * The only argument given is an array of strings A.
 * <p>
 * <p>
 * <p>
 * Output Format
 * Return the longest common prefix of all strings in A.
 * <p>
 * <p>
 * <p>
 * Example Input
 * Input 1:
 * <p>
 * A = ["abcdefgh", "aefghijk", "abcefgh"]
 * Input 2:
 * <p>
 * A = ["abab", "ab", "abcd"];
 * <p>
 * <p>
 * Example Output
 * Output 1:
 * <p>
 * "a"
 * Output 2:
 * <p>
 * "ab"
 * <p>
 * <p>
 * Example Explanation
 * Explanation 1:
 * <p>
 * Longest common prefix of all the strings is "a".
 * Explanation 2:
 * <p>
 * Longest common prefix of all the strings is "ab".
 */
public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] A) {

        int maxPointerIndex = Arrays.stream(A).map(String::length).min(Integer::compareTo).get();
        List<Character> characterList = new ArrayList<>();

        for (int i = 0; i < maxPointerIndex; i++) {
            char value = A[0].charAt(i);
            int count = 0;
            for (int j = 1; j < A.length; j++) {
                if (value == A[j].charAt(i)) {
                    count++;
                }
            }
            if (count == A.length - 2) {
                characterList.add(value);
            } else {
                break;
            }
        }

        char[] result = new char[characterList.size()];
        for (int i = 0; i < characterList.size(); i++) {
            result[i] = characterList.get(i);
        }

        return new String(result);
    }

}
