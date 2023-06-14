package in.thilakraj;

import java.util.ArrayList;

public class CountIncreasingTriplets {

    public int solve(ArrayList<Integer> A) {
        int result = 0;

        for (int i = 0; i < A.size(); i++) {

            int num = A.get(i);

            int lhs = 0;
            for (int j = i - 1; j >= 0; j--) {
                if (num > A.get(j)) {
                    lhs++;
                }
            }

            int rhs = 0;
            for (int j = i + 1; j < A.size(); j++) {
                if (num < A.get(j)) {
                    rhs++;
                }
            }

            result += (lhs * rhs);
        }

        return result;
    }
}
