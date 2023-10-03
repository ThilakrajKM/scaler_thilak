package in.thilakraj;

import java.util.Scanner;

public class TomAndJerry {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] distances = new int[k];
        distances[0] = sc.nextInt();
        for (int i = 1; i < k; i++) {
            distances[i] = sc.nextInt();
            distances[i] = distances[i] + distances[i - 1];
        }

        int count = k;
        for (int i = 0; i < k; i++) {
            if (n > 0 && distances[i] <= n / 2) {
                count--;
                n = n - (distances[i] / 2);
            } else {
                break;
            }
        }

        System.out.println(k - count);
    }
}
