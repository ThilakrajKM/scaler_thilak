package in.thilakraj;

import java.util.ArrayList;
import java.util.Stack;

/**
 * Problem Description
 * There is a football event going on in your city. In this event, you are given A passes and players having ids between 1 and 106.
 * <p>
 * Initially, some player with a given id had the ball in his possession. You have to make a program to display the id of the player who possessed the ball after exactly A passes.
 * <p>
 * There are two kinds of passes:
 * <p>
 * 1) ID
 * <p>
 * 2) 0
 * <p>
 * For the first kind of pass, the player in possession of the ball passes the ball "forward" to the player with id = ID.
 * <p>
 * For the second kind of pass, the player in possession of the ball passes the ball back to the player who had forwarded the ball to him.
 * <p>
 * In the second kind of pass "0" just means Back Pass.
 * <p>
 * Return the ID of the player who currently possesses the ball.
 * <p>
 * <p>
 * <p>
 * Problem Constraints
 * 1 <= A <= 100000
 * <p>
 * 1 <= B <= 100000
 * <p>
 * |C| = A
 * <p>
 * <p>
 * <p>
 * Input Format
 * The first argument of the input contains the number A.
 * <p>
 * The second argument of the input contains the number B ( id of the player possessing the ball in the very beginning).
 * <p>
 * The third argument is an array C of size A having (ID/0).
 * <p>
 * <p>
 * <p>
 * Output Format
 * Return the "ID" of the player who possesses the ball after A passes.
 * <p>
 * <p>
 * <p>
 * Example Input
 * Input 1:
 * <p>
 * A = 10
 * B = 23
 * C = [86, 63, 60, 0, 47, 0, 99, 9, 0, 0]
 * Input 2:
 * <p>
 * A = 1
 * B = 1
 * C = [2]
 * <p>
 * <p>
 * Example Output
 * Output 1:
 * <p>
 * 63
 * Output 2:
 * <p>
 * 2
 * <p>
 * <p>
 * Example Explanation
 * Explanation 1:
 * <p>
 * Initially, Player having  id = 23  posses ball.
 * After pass  1,  Player having  id = 86  posses ball.
 * After pass  2,  Player having  id = 63  posses ball.
 * After pass  3,  Player having  id = 60  posses ball.
 * After pass  4,  Player having  id = 63  posses ball.
 * After pass  5,  Player having  id = 47  posses ball.
 * After pass  6,  Player having  id = 63  posses ball.
 * After pass  7,  Player having  id = 99  posses ball.
 * After pass  8,  Player having  id = 9   posses ball.
 * After pass  9,  Player having  id = 99  posses ball.
 * After pass  10, Player having  id = 63   posses ball.
 * Explanation 2:
 * <p>
 * Ball is passed to 2.
 */
public class PassingGame {

    public int solve(int A, int B, ArrayList<Integer> C) {

        Stack<Integer> passingPeople = new Stack<>();
        passingPeople.push(B);

        for (int i = 0; i < A; i++) {
            Integer id = C.get(i);
            if (id == 0) {
                passingPeople.pop();
            } else {
                passingPeople.push(id);
            }
        }

        return passingPeople.peek();
    }
}
