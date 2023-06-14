package in.thilakraj;

public class UnSetIBit {

    public static void main(String[] args) {

    }

    public int solve(int A, int B) {
        int num = A & (1 << B);
        int result = A;
        if (num != 0) {
            result = result ^ (1 << B);
        }
        return result;
    }
}
