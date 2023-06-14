package in.thilakraj;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IsAlphaNumeric {

    public static void main(String[] args) {
        System.out.println("Ans : " + solve(Arrays.asList('2', '0', '2', '0')));
    }

    public static int solve(List<Character> A) {


        for (int i = 0; i < A.size(); i++) {
            if (!(('A' <= A.get(i) && 'Z' >= A.get(i)) || ('a' <= A.get(i) && 'z' >= A.get(i)) ||
                    ('0' <= A.get(i) && '9' >= A.get(i)))) {
                return 0;
            }
        }
        return 1;
    }
}
