package in.thilakraj;

import java.util.HashSet;
import java.util.List;

public class SubArrayWithSumZeroHashMap {

    public static void main(String[] args) {

    }

    public int solve(List<Integer> A) {
        HashSet<Long> prefixSum = new HashSet<>();
        long sum = A.get(0);
        prefixSum.add(sum);
        if (A.get(0) == 0) {
            return 1;
        }
        for (int i = 1; i < A.size(); i++) {
            sum += A.get(i);
            if (A.get(i) == 0 || prefixSum.contains(sum) || sum == 0) {
                return 1;
            }
            prefixSum.add(sum);
        }
        return 0;
    }
}
