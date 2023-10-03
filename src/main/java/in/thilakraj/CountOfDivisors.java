package in.thilakraj;

public class CountOfDivisors {

    public static void main(String[] args) {
        System.out.println("Ans :" + solve(new int[]{8, 9, 10}));
    }

    public static int[] solve(int[] A) {
        int[] result = new int[A.length];

        int maxElement = A[0];

        for (int i = 1; i < A.length; i++) {
            if (maxElement < A[i]) {
                maxElement = A[i];
            }
        }

        for (int i = 1; i * i <= maxElement; i++) {
            for (int j = 0; j < A.length; j++) {
                if (i * i <= A[j] && A[j] % i == 0) {
                    result[j] = result[j] + 2;
                    if (A[j] / i == i) {
                        result[j]--;
                    }
                }
            }
        }

        return result;
    }
}
