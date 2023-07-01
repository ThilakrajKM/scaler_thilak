package in.thilakraj;

/**
 * Problem Constraints
 * 1 <= A.size() <= 1000
 * <p>
 * 1 <= A[i].size() <= 1000
 * <p>
 * 1 <= A[i][j] <= 1000
 * <p>
 * <p>
 * <p>
 * Input Format
 * First argument is a 2D matrix of integers.
 * <p>
 * <p>
 * <p>
 * Output Format
 * You have to return the Transpose of this 2D matrix.
 * <p>
 * <p>
 * <p>
 * Example Input
 * Input 1:
 * <p>
 * A = [[1, 2, 3],[4, 5, 6],[7, 8, 9]]
 * Input 2:
 * <p>
 * A = [[1, 2],[1, 2],[1, 2]]
 * <p>
 * <p>
 * Example Output
 * Output 1:
 * <p>
 * [[1, 4, 7], [2, 5, 8], [3, 6, 9]]
 * Output 2:
 * <p>
 * [[1, 1, 1], [2, 2, 2]]
 * <p>
 * <p>
 * Example Explanation
 * Explanation 1:
 * <p>
 * Clearly after converting rows to column and columns to rows of [[1, 2, 3],[4, 5, 6],[7, 8, 9]]
 * we will get [[1, 4, 7], [2, 5, 8], [3, 6, 9]].
 */
public class MatrixTranspose {

    public int[][] solve(int[][] A) {
        int row = A.length;
        int col = A[0].length;

        int[][] result = new int[col][row];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                result[j][i] = A[i][j];
            }
        }

        return result;
    }
}
