package in.thilakraj;

public class SimpleReverse {

    public String solve(String A) {

        char[] charArray = A.toCharArray();

        for (int i = 0; i < charArray.length / 2; i++) {
            char temp = charArray[i];
            charArray[i] = charArray[charArray.length - 1 - i];
            charArray[charArray.length - 1 - i] = temp;
        }

        return new String(charArray);
    }
}
