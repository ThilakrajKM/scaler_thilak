package in.thilakraj;

/**
 * Problem Description
 * You are given a n x n 2D matrix A representing an image.
 * <p>
 * Rotate the image by 90 degrees (clockwise).
 * <p>
 * You need to do this in place.
 * <p>
 * Note: If you end up using an additional array, you will only receive partial score.
 * <p>
 * <p>
 * <p>
 * Problem Constraints
 * 1 <= n <= 1000
 * <p>
 * <p>
 * <p>
 * Input Format
 * First argument is a 2D matrix A of integers
 * <p>
 * <p>
 * <p>
 * Output Format
 * Return the 2D rotated matrix.
 * <p>
 * <p>
 * <p>
 * Example Input
 * Input 1:
 * <p>
 * [
 * [1, 2],
 * [3, 4]
 * ]
 * Input 2:
 * <p>
 * [
 * [1, 2, 3],
 * [4, 5, 6],
 * [7, 8, 9]
 * ]
 * <p>
 * <p>
 * Example Output
 * Output 1:
 * <p>
 * [
 * [3, 1],
 * [4, 2]
 * ]
 * Output 2:
 * <p>
 * [
 * [7, 4, 1],
 * [8, 5, 2],
 * [9, 6, 3]
 * ]
 * <p>
 * <p>
 * Example Explanation
 * Explanation 1:
 * <p>
 * After rotating the matrix by 90 degree:
 * 1 goes to 2, 2 goes to 4
 * 4 goes to 3, 3 goes to 1
 * Explanation 2:
 * <p>
 * After rotating the matrix by 90 degree:
 * 1 goes to 3, 3 goes to 9
 * 2 goes to 6, 6 goes to 8
 * 9 goes to 7, 7 goes to 1
 * 8 goes to 4, 4 goes to 2
 */
public class RotateMatrix {

    public static void main(String[] args) {
        //solve(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}});
        solve(new int[][]{{1, 2}, {3, 4}});
        //System.out.println("Ans : "+ diagonal(new int[][]{{1,1,1,1},{2,2,2,2},{3,3,3,3},{4,4,4,4}}));
    }

    public static void solve(int[][] A) {
        transposeMatrix(A);
        reverseMatrixColumnWise(A);
    }

    private static void transposeMatrix(int[][] A) {
        for (int i = 0; i < A.length; i++) {
            for (int j = i + 1; j < A.length; j++) {
                int temp = A[i][j];
                A[i][j] = A[j][i];
                A[j][i] = temp;
            }
        }
    }

    private static void reverseMatrixColumnWise(int[][] A) {
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A.length / 2; j++) {
                int temp = A[i][j];
                A[i][j] = A[i][A.length - 1 - j];
                A[i][A.length - 1 - j] = temp;
            }
        }
        return;
    }

}
