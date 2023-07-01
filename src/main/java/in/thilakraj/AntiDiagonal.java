package in.thilakraj;

/**
 * Problem Description
 * Give a N * N square matrix A, return an array of its anti-diagonals. Look at the example for more details.
 * <p>
 * <p>
 * Problem Constraints
 * 1<= N <= 1000
 * 1<= A[i][j] <= 1e9
 * <p>
 * <p>
 * Input Format
 * Only argument is a 2D array A of size N * N.
 * <p>
 * <p>
 * Output Format
 * Return a 2D integer array of size (2 * N-1) * N, representing the anti-diagonals of input array A.
 * The vacant spaces in the grid should be assigned to 0.
 * <p>
 * <p>
 * Example Input
 * Input 1:
 * 1 2 3
 * 4 5 6
 * 7 8 9
 * Input 2:
 * <p>
 * 1 2
 * 3 4
 * <p>
 * <p>
 * Example Output
 * Output 1:
 * 1 0 0
 * 2 4 0
 * 3 5 7
 * 6 8 0
 * 9 0 0
 * Output 2:
 * <p>
 * 1 0
 * 2 3
 * 4 0
 * <p>
 * <p>
 * Example Explanation
 * For input 1:
 * The first anti diagonal of the matrix is [1 ], the rest spaces shoud be filled with 0 making the row as [1, 0, 0].
 * The second anti diagonal of the matrix is [2, 4 ], the rest spaces shoud be filled with 0 making the row as [2, 4, 0].
 * The third anti diagonal of the matrix is [3, 5, 7 ], the rest spaces shoud be filled with 0 making the row as [3, 5, 7].
 * The fourth anti diagonal of the matrix is [6, 8 ], the rest spaces shoud be filled with 0 making the row as [6, 8, 0].
 * The fifth anti diagonal of the matrix is [9 ], the rest spaces shoud be filled with 0 making the row as [9, 0, 0].
 * For input 2:
 * <p>
 * The first anti diagonal of the matrix is [1 ], the rest spaces shoud be filled with 0 making the row as [1, 0, 0].
 * The second anti diagonal of the matrix is [2, 4 ], the rest spaces shoud be filled with 0 making the row as [2, 4, 0].
 * The third anti diagonal of the matrix is [3, 0, 0 ], the rest spaces shoud be filled with 0 making the row as [3, 0, 0].
 */
public class AntiDiagonal {

    public static void main(String[] args) {
        System.out.println("Ans : " + diagonal(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}));
        //System.out.println("Ans : "+ diagonal(new int[][]{{1,1,1,1},{2,2,2,2},{3,3,3,3},{4,4,4,4}}));
    }

    public static int[][] diagonal(int[][] A) {
        int col = A.length;
        int row = A.length + A.length - 1;
        int[][] antiDiagonalMatrix = new int[row][col];

        for (int i = 0; i < row; i++) {

            //traversing left to right till i==j
            for (int j = 0; j < col - i && i < col; j++) {
                antiDiagonalMatrix[j + i][i] = A[i][j];
            }

            //travesing top to bottom
            for (int j = i + 1; j < col; j++) {
                antiDiagonalMatrix[col + j - i - 1][i] = A[j][col - i - 1];
            }
        }
        return antiDiagonalMatrix;
    }
}
