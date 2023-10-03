package in.thilakraj;

import java.util.Stack;

public class LongestUnbalancedSequence {

    public static void main(String[] args) {
        //System.out.println( "Brackets : "+ solve("{{}}"));
        //System.out.println( "Brackets : "+ solve("{{{}"));
        //System.out.println( "Brackets : "+ solve("{}"));
        System.out.println("Brackets : " + solve("{}{}{}")); //Ans : 5
    }

    public static int solve(String A) {

        char[] charSeq = A.toCharArray();

        int res = 0, partialResult = 1;

        Stack<Character> bracketStack = new Stack<>();
        bracketStack.push(charSeq[0]);

        for (int i = 1; i < charSeq.length; i++) {
            char c = charSeq[i];

            partialResult++;
            if (bracketStack.empty() || c != '}' || bracketStack.peek() != '{') {
                bracketStack.push(c);
                continue;
            }

            while (bracketStack.peek() == '{' && c == '}') {
                bracketStack.pop();
                if (bracketStack.empty()) {
                    partialResult--;
                    if (res < partialResult) {
                        res = partialResult;
                    }
                    partialResult = 0;
                    break;
                } else {
                    if (bracketStack.size() > 1) {
                        c = bracketStack.pop();
                    }
                }
            }


            if (res < partialResult) {
                res = partialResult;
            }

        }

        if (res < partialResult) {
            res = partialResult;
        }

        return res;
    }
}
