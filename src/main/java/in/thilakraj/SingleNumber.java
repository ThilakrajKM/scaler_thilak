package in.thilakraj;

import java.util.Arrays;
import java.util.List;

public class SingleNumber {

    public static void main(String[] args) {
        System.out.println("Ans = " + singleNumber(Arrays.asList(1, 5, 6, 6, 2, 1, 5)));
    }

    public static int singleNumber(final List<Integer> A) {

        int result = 0;

        for (int i=0; i<A.size(); i++) {

            result = A.get(i) ^ result;
        }

        return result;

    }

}
