package in.thilakraj;

public class MaxSubContigousSumArray {

    public static void main(String[] args) {
        System.out.println("Ans " + maxSubArray(new int[]{1, 2, 3, 4, -10}));
    }

    public static int maxSubArray(final int[] A) {

        int ans = -1111;

        int sum = 0;
        for (int i = 0; i < A.length; i++) {
            sum += A[i];
            if (sum > ans) {
                ans = sum;
            }
            if (sum < 0) {
                sum = 0;
            }
        }

        return ans;
    }

    public static int maxSubArrayTCExceedLimit(final int[] A) {

        int ans = -1111;

        for (int i = 0; i < A.length; i++) {
            int sum = 0;
            for (int j = i; j < A.length; j++) {
                sum += A[j];
                if (ans < sum) {
                    ans = sum;
                }
            }
        }

        return ans;
    }
}
