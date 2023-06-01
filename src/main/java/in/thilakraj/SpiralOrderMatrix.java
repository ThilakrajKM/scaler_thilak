package in.thilakraj;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Given an integer A, generate a square matrix filled with elements from 1 to A2 in spiral order and return the generated square matrix.
 * Problem Constraints
 * 1 <= A <= 1000
 * Input Format
 * First and only argument is integer A
 * Output Format
 * Return a 2-D matrix which consists of the elements added in spiral order.
 * Example Input
 * Input 1:
 *
 * 1
 * Input 2:
 *
 * 2
 * Input 3:
 *
 * 5
 * Example Output
 * Output 1:
 * [ [1] ]
 * Output 2:
 *
 * [ [1, 2],
 *   [4, 3] ]
 * Output 2:
 *
 * [ [1,   2,  3,  4, 5],
 *   [16, 17, 18, 19, 6],
 *   [15, 24, 25, 20, 7],
 *   [14, 23, 22, 21, 8],
 *   [13, 12, 11, 10, 9] ]
 *
 *   Example Explanation
 * Explanation 1:
 *
 * Only 1 is to be arranged.
 * Explanation 2:
 *
 * 1 --> 2
 *       |
 *       |
 * 4<--- 3
 */
public class SpiralOrderMatrix {

    public static void main(String[] args) {
        System.out.println("Ans = " + generateMatrix(5));
       // System.out.println("Ans = " + generateMatrix(3));

    }
    public static int[][] generateMatrix(int A) {

        int number = 1;
        int[][]  spiralMatrix = new int[A][A];


        if(A==1) {
            spiralMatrix[0][0] = number;
            return spiralMatrix;
        }

        int matrixSize = A, left=0, top= A-1;
        while(A>1) {

            //left to right
            for(int k=left; k<=top; k++) {
                spiralMatrix[left][k] = number++;
            }

            //top to bottom
            for(int k=left +1 ; k<=top; k++) {
                spiralMatrix[k][top] = number++;
            }

            //right to left
            for(int k=top -1; k>=left; k--) {
                spiralMatrix[top][k] = number++;
            }

            //bottom to top
            for(int k=top -1; k>=left+1; k--) {
                spiralMatrix[k][left] = number++;
            }

            left++;
            top--;
            A-=2;
        }


        if(matrixSize%2!=0) {
            spiralMatrix[matrixSize/2][matrixSize/2] = number;
        }

        return spiralMatrix;
    }

}
