package in.thilakraj;

/**
 * 6. Make It
 * <p>
 * Given two integers A and B. A represents the count of mangoes and B represent the count of slices of mangoes. Mango can be cut into three slices of mangoes. A glass of mango shake can be formed by two slices of mangoes.
 * <p>
 * Find the maximum number of glasses of mango shakes you can make with A mangoes and B slices of mangoes initially.
 * <p>
 * Input Format
 * <p>
 * The First argument is an integer A.
 * The Second argument is an integer B.
 * <p>
 * Output Format
 * <p>
 * Return the maximum number of glasses of mango shakes you can make.
 * <p>
 * Constraints
 * <p>
 * 0 <= A, B <= 10^8
 * <p>
 * Input 1:
 * A = 19
 * B = 0
 * Output 1:
 * 28
 * <p>
 * Input 2:
 * A = 7
 * B = 1
 * Output 2:
 * 11
 */
public class MakeIt {

    public static void main(String[] args) {

    }

    public static int solve(int A, int B) {
        int totalNumberOfSlices = A * 3 + B;
        return totalNumberOfSlices / 2;
    }
}
