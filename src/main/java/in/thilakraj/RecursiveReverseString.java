package in.thilakraj;

import java.util.Scanner;

public class RecursiveReverseString {

    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        reverseAString(input, input.length() - 1);
    }

    private static void reverseAString(String input, int i) {
        if (i == 0) {
            System.out.print(input.charAt(i));
        } else {
            System.out.print(input.charAt(i));
            reverseAString(input, --i);
        }
    }
}
