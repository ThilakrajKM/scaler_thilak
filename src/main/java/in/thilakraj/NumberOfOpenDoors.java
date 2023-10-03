package in.thilakraj;

public class NumberOfOpenDoors {

    public int solve(int A) {

        int result = 0;

        for (int i = 1; i * i <= A; i++) {
            if (i * i <= A) {
                result++;
            }
        }

        return result;

    }
}
