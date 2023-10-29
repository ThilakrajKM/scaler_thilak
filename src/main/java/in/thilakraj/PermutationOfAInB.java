package in.thilakraj;

import java.util.HashMap;

/**
 * Problem Description
 * You are given two strings, A and B, of size N and M, respectively.
 * <p>
 * You have to find the count of all permutations of A present in B as a substring. You can assume a string will have only lowercase letters.
 * <p>
 * <p>
 * <p>
 * Problem Constraints
 * 1 <= N < M <= 105
 * <p>
 * <p>
 * <p>
 * Input Format
 * Given two arguments, A and B of type String.
 * <p>
 * <p>
 * <p>
 * Output Format
 * Return a single integer, i.e., number of permutations of A present in B as a substring.
 * <p>
 * <p>
 * <p>
 * Example Input
 * Input 1:
 * <p>
 * A = "abc"
 * B = "abcbacabc"
 * Input 2:
 * <p>
 * A = "aca"
 * B = "acaa"
 * <p>
 * <p>
 * Example Output
 * Output 1:
 * <p>
 * 5
 * Output 2:
 * <p>
 * 2
 * <p>
 * <p>
 * Example Explanation
 * Explanation 1:
 * <p>
 * Permutations of A that are present in B as substring are:
 * 1. abc
 * 2. cba
 * 3. bac
 * 4. cab
 * 5. abc
 * So ans is 5.
 * Explanation 2:
 * <p>
 * Permutations of A that are present in B as substring are:
 * 1. aca
 * 2. caa
 */
public class PermutationOfAInB {

    public int solve(String A, String B) {
        int k = A.length();
        int n = B.length();
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        // add string A Characters into HashMap
        for (int i = 0; i < k; i++) {
            char ch = A.charAt(i);
            if (map1.containsKey(ch)) {
                map1.put(ch, map1.get(ch) + 1);
            } else {
                map1.put(ch, 1);
            }
        }

        int ans = 0;
        int match = 0;

        // add first k characters into new HashMap form string B
        for (int i = 0; i < k; i++) {
            char ch = B.charAt(i);
            if (map2.containsKey(ch)) {
                map2.put(ch, map2.get(ch) + 1);
            } else {
                map2.put(ch, 1);
            }

            // in each characters check if is it exist into map1 or check its frequency
            if (map1.containsKey(ch) && map2.get(ch) <= map1.get(ch)) {
                match++;
            }
        }

        if (match == k) {
            ans++;
        }

        // using sliding window techniqute to remove s-1 char and add e char into HashMap
        int s = 1, e = k;
        while (e < n) {
            // remove s-1 index char
            char ch = B.charAt(s - 1);
            map2.put(ch, map2.get(ch) - 1);

            if (map1.containsKey(ch) && map2.get(ch) < map1.get(ch)) {
                match--;
            }


            // add e index char
            ch = B.charAt(e);
            if (map2.containsKey(ch)) {
                map2.put(ch, map2.get(ch) + 1);
            } else {
                map2.put(ch, 1);
            }

            if (map1.containsKey(ch) && map2.get(ch) <= map1.get(ch)) {
                match++;
            }

            if (match == k) {
                ans++;
            }

            s++;
            e++;
        }

        return ans;

    }

}
