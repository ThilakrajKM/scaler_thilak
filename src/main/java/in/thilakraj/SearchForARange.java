package in.thilakraj;

public class SearchForARange {

    public static void main(String[] args) {
        int[] A = new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 8, 8, 8, 8, 8, 8, 8, 8, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10};
        System.out.println(searchRange(A, 10)[0]);

    }

    public static int[] searchRange(final int[] A, int B) {

        int[] result = new int[]{-1, -1};

        int low = 0, high = A.length - 1, mid;

        //first occurrence
        while (low <= high) {
            mid = (low + high) / 2;
            if (A[mid] == B && (mid == 0 || A[mid - 1] < B)) {
                result[0] = mid;
                break;
            } else if (A[mid] < B) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        //last occurrence
        low = 0;
        high = A.length - 1;
        while (low <= high) {
            mid = (low + high) / 2;
            if (A[mid] == B && (mid == A.length - 1 || A[mid + 1] > B)) {
                result[1] = mid;
                break;
            } else if (A[mid] > B) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }


        return result;
    }
}
