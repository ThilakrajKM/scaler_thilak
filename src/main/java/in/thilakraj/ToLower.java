package in.thilakraj;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Problem Description
 * You are given a function to_lower() which takes a character array A as an argument.
 * <p>
 * Convert each character of A into lowercase characters if it exists. If the lowercase of a character does not exist, it remains unmodified.
 * The uppercase letters from A to Z are converted to lowercase letters from a to z respectively.
 * <p>
 * Return the lowercase version of the given character array.
 * <p>
 * <p>
 * <p>
 * Problem Constraints
 * 1 <= |A| <= 105
 * <p>
 * <p>
 * <p>
 * Input Format
 * The only argument is a character array A.
 * <p>
 * <p>
 * <p>
 * Output Format
 * Return the lowercase version of the given character array.
 * <p>
 * <p>
 * <p>
 * Example Input
 * Input 1:
 * <p>
 * A = ['S', 'c', 'A', 'l', 'e', 'r', 'A', 'c', 'a', 'D', 'e', 'm', 'y']
 * Input 2:
 * <p>
 * A = ['S', 'c', 'a', 'L', 'e', 'r', '#', '2', '0', '2', '0']
 * <p>
 * <p>
 * Example Output
 * Output 1:
 * <p>
 * ['s', 'c', 'a', 'l', 'e', 'r', 'a', 'c', 'a', 'd', 'e', 'm', 'y']
 * Output 2:
 * <p>
 * ['s', 'c', 'a', 'l', 'e', 'r', '#', '2', '0', '2', '0']
 * <p>
 * <p>
 * Example Explanation
 * Explanation 1:
 * <p>
 * All the characters in the returned array are in lowercase alphabets.
 * Explanation 2:
 * Since there is no lowercase version for '#', '2'and '0'.  It remains unchanged.
 * Rest of the Uppercase alphabets are converted to lowercase accordingly.
 */
public class ToLower {

    public static void main(String[] args) {
        System.out.println("Ans : " + to_lower(Arrays.asList('S', 'c', 'A', 'L', 'E', 'r', 'A', 'c', 'a', 'D', 'e', 'm', 'y')));
        System.out.println("Ans : " + to_upper(Arrays.asList('S', 'c', 'A', 'L', 'E', 'r', 'A', 'c', 'a', 'D', 'e', 'm', 'y')));
    }

    public static ArrayList<Character> to_lower(List<Character> A) {
        ArrayList<Character> result = new ArrayList<>();
        for (int i = 0; i < A.size(); i++) {
            if (A.get(i) >= 'A' && (A.get(i) <= 'Z')) {
                result.add((char) (A.get(i) + 'a' - 'A'));
            } else {
                result.add(A.get(i));
            }
        }
        return result;
    }

    public static ArrayList<Character> to_upper(List<Character> A) {
        ArrayList<Character> result = new ArrayList<>();
        for (int i = 0; i < A.size(); i++) {
            if (A.get(i) >= 'a' && (A.get(i) <= 'z')) {
                result.add((char) (A.get(i) - ('a' - 'A')));
            } else {
                result.add(A.get(i));
            }
        }
        return result;
    }

    public String solve(String A) {
        //ArrayList<Character> result = new ArrayList<>();
        char[] result = new char[A.length()];
        for (int i = 0; i < A.length(); i++) {
            if (A.charAt(i) >= 'a' && (A.charAt(i) <= 'z')) {
                result[i] = ((char) (A.charAt(i) - ('a' - 'A')));
            } else if (A.charAt(i) >= 'A' && (A.charAt(i) <= 'Z')) {
                result[i] = ((char) (A.charAt(i) + 'a' - 'A'));
            } else {
                result[i] = (A.charAt(i));
            }
        }
        String resultString = new String(result);
        return resultString;
    }

}
