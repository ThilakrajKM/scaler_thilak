package in.thilakraj;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

public class IsDictionary {

    public static void main(String[] args) {
        System.out.println("Ans : " + solve(Arrays.asList("hello", "scaler", "interviewbit"), "adhbcfegskjlponmirqtxwuvzy"));
        System.out.println("Ans : " + solve(Arrays.asList("fine", "none", "bush"), "qwertyuiopasdfghjklzxcvbnm"));
        System.out.println("Ans : " + solve(Arrays.asList("fine", "none", "no"), "qwertyuiopasdfghjklzxcvbnm"));
        //System.out.println("Ans : "+ solve(Arrays.asList("aaalo", "aaako", "interviewbit"), "adhbcfegskjlponmirqtxwuvzy"));
    }

    public static int solve(List<String> A, String B) {

        final HashMap<Character, Integer> charFrequency = new HashMap<>();

        for (int i = 0; i < B.length(); i++) {
            charFrequency.put(B.charAt(i), i);
        }

        Comparator<String> charComparator = (s1, s2) -> {
            char[] c1 = s1.toCharArray();
            char[] c2 = s2.toCharArray();
            int length1 = c1.length;
            int length2 = c2.length;

            for (int k = 0; k < (length1 < length2 ? length1 : length2); k++) {
                int freq1 = charFrequency.get(c1[k]);
                int freq2 = charFrequency.get(c2[k]);
                if (freq1 > freq2) {
                    return 1;
                } else if (freq1 < freq2) {
                    return -1;
                }
            }

            if (length1 > length2) {
                return 1;
            }

            return -1;
        };

        for (int i = 1; i < A.size(); i++) {

            if (charComparator.compare(A.get(i - 1), A.get(i)) == 1) {
                return 0;
            }
        }

        return 1;
    }

}
