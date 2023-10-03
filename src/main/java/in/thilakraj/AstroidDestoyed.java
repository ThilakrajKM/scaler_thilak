package in.thilakraj;

import java.util.Arrays;

public class AstroidDestoyed {

    public int solve(int A, int[] B) {

        Arrays.sort(B);
        int i = 0;
        while (i < B.length) {
            if (A >= B[i]) {
                A += B[i];
            } else {
                return 0;
            }
            i++;
        }

        return 1;
    }
}
