package in.thilakraj;

/**
 * Problem Description
 * Given a vector A of non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it is able to trap after raining.
 * <p>
 * <p>
 * <p>
 * Problem Constraints
 * 1 <= |A| <= 100000
 * <p>
 * <p>
 * <p>
 * Input Format
 * First and only argument is the vector A
 * <p>
 * <p>
 * <p>
 * Output Format
 * Return one integer, the answer to the question
 * <p>
 * <p>
 * <p>
 * Example Input
 * Input 1:
 * <p>
 * A = [0, 1, 0, 2]
 * Input 2:
 * <p>
 * A = [1, 2]
 * <p>
 * <p>
 * Example Output
 * Output 1:
 * <p>
 * 1
 * Output 2:
 * <p>
 * 0
 * <p>
 * <p>
 * Example Explanation
 * Explanation 1:
 * <p>
 * 1 unit is trapped on top of the 3rd element.
 * Explanation 2:
 * <p>
 * No water is trapped.
 */
public class RainWaterTrapped {

    public static void main(String[] args) {
        //System.out.println("Ans : "+ trap(new int[]{0, 1, 0, 2}));
        System.out.println("Ans : " + trap(new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1}));
    }

    public static int trap(final int[] A) {

        int[] lPrefixArray = new int[A.length];
        int[] rPrefixArray = new int[A.length];

        lPrefixArray[0] = A[0];
        for (int i = 1; i < A.length; i++) {
            lPrefixArray[i] = lPrefixArray[i - 1] > A[i] ? lPrefixArray[i - 1] : A[i];
        }

        rPrefixArray[A.length - 1] = A[A.length - 1];
        for (int i = A.length - 2; i >= 0; i--) {
            rPrefixArray[i] = rPrefixArray[i + 1] > A[i] ? rPrefixArray[i + 1] : A[i];
        }
        int result = 0;
        for (int i = 1; i < A.length - 1; i++) {
            int min = lPrefixArray[i] < rPrefixArray[i] ? lPrefixArray[i] : rPrefixArray[i];
            result += (min - A[i]);
        }

        return result;
    }

    /**
     *         int n = A.length;
     *         int[] lMax = new int[n];
     *         lMax[0] = A[0];
     *         for(int i = 1; i < n; i++){
     *             lMax[i] = Math.max(lMax[i-1] , A[i]);
     *         }
     *         int[] rMax = new int[n];
     *         rMax[n-1] = A[n-1];
     *         for(int i = n-2; i >= 0; i--){
     *            rMax[i] = Math.max( A[i] , rMax[i + 1] );
     *         }
     *         int water = 0;
     *         for(int i = 0; i < n; i++){
     *             int amount = Math.min(lMax[i] , rMax[i]) - A[i];
     *             water = water + amount;
     *         }
     *         return water;
     */
}
