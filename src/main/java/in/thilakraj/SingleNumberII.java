package in.thilakraj;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 *
 */
public class SingleNumberII {

    public static void main(String[] args) {
        System.out.println(singleNumberBest(Arrays.asList(1, 1, 1, 2, 2, 2, 3, 3, 3, 4)));
    }

    public static int singleNumberBest(final List<Integer> A) {
        int ans = 0;

        for (int i = 0; i < 32; i++) {
            int count = 0;

            for (int j = 0; j < A.size(); j++) {
                if (checkBit(A.get(j), i) == 1) {
                    count++;
                }
            }

            if (count % 3 != 0) {
                ans = ans | (1 << i);
            }

        }
        return ans;
    }

    static int checkBit(int value, int shift) {
        return ((value >> shift) & 1);
    }

    //Single Number O(n) and O(n) time and space
    public int singleNumber(final List<Integer> A) {
        HashMap<Integer, Integer> valueCountMap = new HashMap<>();

        for (int i = 0; i < A.size(); i++) {
            if (valueCountMap.containsKey(A.get(i))) {
                valueCountMap.put(A.get(i), valueCountMap.get(A.get(i)) + 1);
            } else {
                valueCountMap.put(A.get(i), 1);
            }
        }

        for (int i = 0; i < A.size(); i++) {
            if (valueCountMap.get(A.get(i)) == 1) {
                return A.get(i);
            }
        }

        return 0;
    }

}
