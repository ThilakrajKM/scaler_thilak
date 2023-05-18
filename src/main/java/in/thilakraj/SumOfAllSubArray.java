package in.thilakraj;

import java.util.Arrays;
import java.util.List;

public class SumOfAllSubArray {

    public static void main(String[] args) {
        System.out.println("Sub Array Sum = " + subarraySum(Arrays.asList(1, 2, 3)));
    }

    //X = i, Y = N - i - 1
    public static Long subarraySum(List<Integer> A) {
        long ans = 0;
        int n = A.size();
        for (int i = 0; i < n; i++)
            ans += (long) A.get(i) * (i + 1) * (n - i);
        return ans;
    }
}
