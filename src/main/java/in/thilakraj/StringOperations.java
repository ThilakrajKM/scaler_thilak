package in.thilakraj;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Problem Description
 * Akash likes playing with strings. One day he thought of applying following operations on the string in the given order:
 * <p>
 * Concatenate the string with itself.
 * Delete all the uppercase letters.
 * Replace each vowel with '#'.
 * You are given a string A of size N consisting of lowercase and uppercase alphabets. Return the resultant string after applying the above operations.
 * <p>
 * NOTE: 'a' , 'e' , 'i' , 'o' , 'u' are defined as vowels.
 * <p>
 * <p>
 * <p>
 * Problem Constraints
 * 1<=N<=100000
 * <p>
 * <p>
 * Input Format
 * First argument is a string A of size N.
 * <p>
 * <p>
 * <p>
 * Output Format
 * Return the resultant string.
 * <p>
 * <p>
 * <p>
 * Example Input
 * Input 1:
 * A="aeiOUz"
 * Input 2:
 * A="AbcaZeoB"
 * <p>
 * <p>
 * Example Output
 * Output 1:
 * "###z###z"
 * Output 2:
 * "bc###bc###"
 */
public class StringOperations {

    public String solve(String A) {

        List<Character> characterList = new ArrayList<>();
        for (int i = 0; i < A.length(); i++) {
            if (A.charAt(i) >= 'A' && A.charAt(i) <= 'Z') {
            } else if (A.charAt(i) == 'a' || A.charAt(i) == 'e' || A.charAt(i) == 'i' || A.charAt(i) == 'o' || A.charAt(i) == 'u') {
                characterList.add('#');
            } else {
                characterList.add(A.charAt(i));
            }
        }

        characterList.addAll(characterList);

        char[] result = new char[characterList.size()];
        for (int i = 0; i < characterList.size(); i++) {
            result[i] = characterList.get(i);
        }

        return new String(result);

    }
}
