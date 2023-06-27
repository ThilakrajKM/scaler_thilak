package in.thilakraj;

import java.util.Scanner;

/**
 * Construct a class called Matrix which stores a 2D Array. It should store
 * <p>
 * The number of rows
 * <p>
 * The number of columns
 * <p>
 * The 2D Array itself
 * <p>
 * Implement the following functionalities inside this class :-
 * <p>
 * input() -> Reads the input from the user. This method should read the input from the user and populate the entire array. Each row will be in a new line and all the elements in a row will be space-separated.
 * <p>
 * add(Matrix) -> Returns the sum of two matrices. Assume the matrices provided have the same dimensions.
 * <p>
 * subtract(Matrix) -> Returns the sum of two matrices. Assume the matrices provided have the same dimensions.
 * <p>
 * transpose() -> Returns a new matrix containing the transpose of the given original matrix.
 * <p>
 * print() -> prints the entire matrix row by row. Each row will be in a new line and values in each row should be separated by a single space.
 * <p>
 * You may define any properties in the class as you see appropriate.
 */
public class Matrix {

    // Define properties here
    int rows;
    int cols;
    int[][] mat;

    // Define constructor here
    Matrix(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        mat = new int[rows][cols];
    }

    void input(Scanner sc) {
        // Use the Scanner object passed as argument for taking input and not a new Scanner object
        // Complete the function
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                mat[i][j] = Integer.valueOf(sc.nextInt());
            }
        }

    }

    Matrix add(Matrix x) {
        // Complete the function
        Matrix result = new Matrix(this.rows, this.cols);

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result.mat[i][j] = mat[i][j] + x.mat[i][j];
            }
        }

        return result;

    }

    Matrix subtract(Matrix x) {
        // Complete the function
        Matrix result = new Matrix(this.rows, this.cols);

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result.mat[i][j] = mat[i][j] - x.mat[i][j];
            }
        }

        return result;
    }

    Matrix transpose() {
        // Complete the function
        Matrix transposeMatrix = new Matrix(this.cols, this.rows);

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposeMatrix.mat[j][i] = mat[i][j];
            }
        }

        return transposeMatrix;
    }

    void print() {
        // Complete the function
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
}

/*
    Matrix a = new Matrix(10, 5)  // 10 rows, 5 columns
	a.input()
	Matrix b = new Matrix(10, 5)  // 10 rows, 5 columns
	b.input()
    Matrix c1 = a.add(b)
    Matrix c2 = a.subtract(b)
    Matrix c3 = a.transpose()
    a.print()
*/

