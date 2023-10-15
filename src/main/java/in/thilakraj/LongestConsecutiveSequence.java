package in.thilakraj;

import java.util.HashSet;

public class LongestConsecutiveSequence {

    public static void main(String[] args) {

    }

    public int longestConsecutive(final int[] A) {

        HashSet<Integer> eleSet = new HashSet<>();
        for (int i = 0; i < A.length; i++) {
            eleSet.add(A[i]);
        }

        int ans = 0;
        for (int i = 0; i < A.length; i++) {
            int ele = A[i];

            if (!eleSet.contains(ele - 1)) {
                int chain = 1;
                int nextElement = ele + 1;
                while (eleSet.contains(nextElement)) {
                    chain++;
                    nextElement++;
                }
                ans = Math.max(ans, chain);
            }
        }

        return ans;
    }
}
