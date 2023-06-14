package in.thilakraj;

/**
 * Problem Description
 * Alex and Sam are good friends. Alex is doing a lot of programming these days. He has set a target score of A for himself.
 * Initially, Alex's score was zero. Alex can double his score by doing a question, or Alex can seek help from Sam for doing questions that will contribute 1 to Alex's score. Alex wants his score to be precisely A. Also, he does not want to take much help from Sam.
 * <p>
 * Find and return the minimum number of times Alex needs to take help from Sam to achieve a score of A.
 * <p>
 * Problem Constraints
 * 0 <= A <= 10^9
 * <p>
 * <p>
 * Input Format
 * The only argument given is an integer A.
 * <p>
 * <p>
 * Output Format
 * Return the minimum number of times help taken from Sam.
 * <p>
 * <p>
 * Example Input
 * Input 1:
 * A = 5
 * Input 2:
 * <p>
 * A = 3
 * <p>
 * <p>
 * Example Output
 * Output 1:
 * 2
 * Output 2:
 * <p>
 * 2
 * <p>
 * <p>
 * ----------
 * Claim :The number of times we would require help from sam is the number of bits that are set in A.
 * <p>
 * Lets try to build an intuition for this. Instead of going from 0 to A , we will go in the reverse direction i.e. from A to 0.
 * First initialise a cnt variable to 0 which is the number of times we took help from sam.Now we would follow this approach until A becomes 0.
 * <p>
 * If A is an even number we can divide it by 2
 * otherwise if A is an odd number we can subtract 1 from it and increment the cnt.
 * <p>
 * Since every time we divide by 2 if its an even number , it is same as doing a left shift. The number of times A would become odd is the number of set bits of A.
 * <p>
 * Lets take an example to make this more clear:
 * <p>
 * A=17
 * 0) 17 ,cnt=0
 * 1) 17 -> 16 , cnt=1
 * 2) 16 -> 8 , cnt=1
 * 3) 8 -> 4 , cnt=1
 * 4) 4 -> 2 , cnt=1
 * 5) 2 -> 1 , cnt=1
 * 6) 1 -> 0 , cnt=2
 * <p>
 * binary representation of 17 = 10001 , and we can see that the number of set bits is the same as cnt that we obtained in the above approach.
 * <p>
 * Therefore it is enough to just find the number of set bits of A.
 * <p>
 * We can do this as follows:
 * <p>
 * cnt=0
 * for i from 0 to 31
 * if A&(1<<i) != 0
 * cnt++
 * return cnt
 * Time Complexity : O( log(A) )
 */
public class HelpFromSam {

    public static void main(String[] args) {

    }

    public int solve(int A) {

        int result = 0;

        while (A != 0) {

            if ((A & 1) == 1) {
                result++;
            }
            A = A >> 1;
        }

        return result;
    }
}
