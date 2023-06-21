package in.thilakraj;

/**
 * Problem Description
 * Given two binary strings A and B. Return their sum (also a binary string).
 * <p>
 * <p>
 * Problem Constraints
 * 1 <= length of A <= 105
 * <p>
 * 1 <= length of B <= 105
 * <p>
 * A and B are binary strings
 * <p>
 * <p>
 * <p>
 * Input Format
 * The two argument A and B are binary strings.
 * <p>
 * <p>
 * <p>
 * Output Format
 * Return a binary string denoting the sum of A and B
 * <p>
 * <p>
 * <p>
 * Example Input
 * Input 1:
 * A = "100"
 * B = "11"
 * Input 2:
 * A = "110"
 * B = "10"
 * <p>
 * <p>
 * Example Output
 * Output 1:
 * "111"
 * Output 2:
 * "1000"
 * <p>
 * <p>
 * Example Explanation
 * For Input 1:
 * The sum of 100 and 11 is 111.
 * For Input 2:
 * <p>
 * The sum of 110 and 10 is 1000.
 */
public class AddBinaryString {

    public static void main(String[] args) {
        System.out.println("Ans : " + addBinary("1010110111001101101000", "1000011011000000111100110"));
    }

    public static String addBinary(String A, String B) {

        int n = A.length() > B.length() ? A.length() : B.length();
        char[] result = new char[n + 1];
        int aIndex = A.length() - 1, bIndex = B.length() - 1;
        char carry = '0';

        while (n >= 0) {
            char aBit = aIndex < 0 ? '0' : A.charAt(aIndex);
            char bBit = bIndex < 0 ? '0' : B.charAt(bIndex);

            if (aBit == '1' && bBit == '1') {
                result[n] = carry == '1' ? '1' : '0';
                carry = '1';
            } else if (((aBit == '1' && bBit == '0') || (aBit == '0' && bBit == '1')) && carry == '1') {
                result[n] = '0';
                carry = '1';
            } else if ((aBit == '1' && bBit == '0') || (aBit == '0' && bBit == '1')) {
                result[n] = carry == '1' ? '0' : '1';
                carry = carry == 1 ? '1' : '0';
            } else {
                result[n] = carry;
                carry = '0';
            }
            aIndex--;
            bIndex--;
            n--;
        }


        if (result[0] == '0') {
            return new String(result, 1, result.length - 1);
        }

        return new String(result);
    }

}
