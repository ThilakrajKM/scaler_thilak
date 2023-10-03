package in.thilakraj;

import java.util.Arrays;

public class DanceClass {

    public static void main(String[] args) {

        System.out.println(Dance_class(new int[]{1, 2, 3}, new int[]{3, 4, 5, 6}, 2));
    }

    public static int Dance_class(int[] A, int[] B, int C) {
        Arrays.sort(A);
        Arrays.sort(B);

        int result = 0, n = A.length > B.length ? A.length : B.length;

        int ai = 0, bi = 0;

        while (ai < A.length && bi < B.length) {
            int diff = A[ai] - B[bi];
            if (diff <= C && diff >= (C * -1)) {
                result++;
                ai++;
                bi++;
            } else if (diff < 0 && ai < A.length) {
                ai++;
            } else if (diff > 0 && bi < B.length) {
                bi++;
            }
        }


        return result;
    }
}
