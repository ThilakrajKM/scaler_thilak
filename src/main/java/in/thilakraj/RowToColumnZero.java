package in.thilakraj;

public class RowToColumnZero {

    public int[][] solve(int[][] A) {

        int[][] result = new int[A.length][A[0].length];

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                result[i][j] = -1;
            }
        }

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                if (A[i][j] == 0) {
                    for (int k = 0; k < A[0].length; k++) {
                        result[i][k] = 0;
                    }
                    for (int k = 0; k < A.length; k++) {
                        result[k][j] = 0;
                    }
                } else if (result[i][j] == -1) {
                    result[i][j] = A[i][j];
                }
            }
        }

        return result;
    }

}
