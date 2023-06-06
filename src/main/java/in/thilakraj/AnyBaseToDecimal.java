package in.thilakraj;

public class AnyBaseToDecimal {

    public int solve(int A, int B) {
        int result = 0;
        int mul = 1;

        while (A > 0) {
            int rem = A % 10;
            result = result + (rem * mul);
            A = A / 10;
            mul = mul * B;
        }

        return result;
    }
}
