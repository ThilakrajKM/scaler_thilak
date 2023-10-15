package in.thilakraj;

import java.util.ArrayList;

/**
 * Problem Description
 * You are given a string A of size N.
 * <p>
 * Return the string A after reversing the string word by word.
 * <p>
 * NOTE:
 * <p>
 * A sequence of non-space characters constitutes a word.
 * Your reversed string should not contain leading or trailing spaces, even if it is present in the input string.
 * If there are multiple spaces between words, reduce them to a single space in the reversed string.
 * <p>
 * <p>
 * Problem Constraints
 * 1 <= N <= 3 * 10^5
 * <p>
 * <p>
 * <p>
 * Input Format
 * The only argument given is string A.
 * <p>
 * <p>
 * <p>
 * Output Format
 * Return the string A after reversing the string word by word.
 * <p>
 * <p>
 * <p>
 * Example Input
 * Input 1:
 * A = "the sky is blue"
 * Input 2:
 * A = "this is ib"
 * <p>
 * <p>
 * Example Output
 * Output 1:
 * "blue is sky the"
 * Output 2:
 * "ib is this"
 * <p>
 * <p>
 * Example Explanation
 * Explanation 1:
 * We reverse the string word by word so the string becomes "blue is sky the".
 * Explanation 2:
 * We reverse the string word by word so the string becomes "ib is this".
 */
public class ReverseAString {

    public static void main(String[] args) {
        System.out.println(" Ans : " + solve("crulgzfkif gg ombt vemmoxrgf qoddptokkz op xdq hv"));
    }

    public static String solve(String A) {

        ArrayList<String> stringArrayList = new ArrayList<>();

        char[] chars = A.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            int j = i;
            while (j < chars.length && chars[j++] != ' ') ;
            int charLength = j - i - 1;
            if (charLength > 0) {
                char[] splitChars = new char[charLength];
                System.arraycopy(chars, i, splitChars, i - i, i + charLength - i);
                i += charLength - 1;
                stringArrayList.add(new String(splitChars));
            }
        }

        String result = "";
        for (int i = 0; i < stringArrayList.size(); i++) {
            if (i == 0) {
                result = stringArrayList.get(stringArrayList.size() - 1 - i);
            } else {
                result = result + " " + stringArrayList.get(stringArrayList.size() - 1 - i);
            }
        }

        return result;
    }
}
