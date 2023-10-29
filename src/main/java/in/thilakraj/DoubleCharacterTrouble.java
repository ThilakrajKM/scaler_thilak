package in.thilakraj;

import java.util.Stack;

public class DoubleCharacterTrouble {

    public String solve(String A) {

        Stack<Character> characterStack = new Stack<>();

        for (int i = 0; i < A.length(); i++) {
            Character c = A.charAt(i);
            if (!characterStack.isEmpty() && characterStack.peek() == c) {
                characterStack.pop();
            } else {
                characterStack.push(c);
            }
        }

        char[] remainChars = new char[characterStack.size()];

        for (int i = remainChars.length - 1; i >= 0; i--) {
            remainChars[i] = characterStack.pop();
        }

        return new String(remainChars);

    }
}
