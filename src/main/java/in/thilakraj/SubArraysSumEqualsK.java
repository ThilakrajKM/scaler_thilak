package in.thilakraj;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * Problem Description
 * Given an array of integers A and an integer B.
 * Find the total number of subarrays having sum equals to B.
 * <p>
 * <p>
 * Problem Constraints
 * 1 <= length of the array <= 50000
 * -1000 <= A[i] <= 1000
 * <p>
 * <p>
 * Input Format
 * The first argument given is the integer array A.
 * The second argument given is integer B.
 * <p>
 * <p>
 * Output Format
 * Return the total number of subarrays having sum equals to B.
 * <p>
 * <p>
 * Example Input
 * Input 1:
 * A = [1, 0, 1]
 * B = 1
 * Input 2:
 * A = [0, 0, 0]
 * B = 0
 * <p>
 * <p>
 * Example Output
 * Output 1:
 * 4
 * Output 2:
 * 6
 * <p>
 * <p>
 * Example Explanation
 * Explanation 1:
 * [1], [1, 0], [0, 1] and [1] are four subarrays having sum 1.
 * Explanation 1:
 * All the possible subarrays having sum 0.
 */
public class SubArraysSumEqualsK {

    public static void main(String[] args) {
        System.out.println("Ans : " + solve(Arrays.asList(1, 0, 1), 1));
    }

    public static int solve(List<Integer> A, int B) {

        HashMap<Integer, Integer> prefixSumFreq = new HashMap<>();
        prefixSumFreq.put(0, 1);
        int totalSum = 0;
        int result = 0;

        for (int i = 0; i < A.size(); i++) {
            totalSum = totalSum + A.get(i);
            int diff = totalSum - B;
            if (prefixSumFreq.containsKey(diff)) {
                result = result + prefixSumFreq.get(diff);
            }

            if (prefixSumFreq.containsKey(totalSum)) {
                prefixSumFreq.put(totalSum, prefixSumFreq.get(totalSum) + 1);
            } else {
                prefixSumFreq.put(totalSum, 1);
            }

        }

        return result;
    }
}
//https://www.google.com/search?q=Subarray+Sum+Equals+K+prepcode&sxsrf=APwXEdcK9DrdBV8THg6rLLJsVbOfaQ2TnA%3A1687197811600&ei=c5iQZImjJPjfseMPxtqTsAk&ved=0ahUKEwjJqOfR9c__AhX4b2wGHUbtBJYQ4dUDCA8&uact=5&oq=Subarray+Sum+Equals+K+prepcode&gs_lcp=Cgxnd3Mtd2l6LXNlcnAQAzIFCCEQoAEyBQghEKABMgUIIRCgATIFCCEQoAEyBQghEKABOgQIABBHOgoIABCABBAUEIcCOgUIABCABDoGCAAQFhAeOggIABCKBRCGA0oECEEYAFAnWPQXYMMaaABwAngAgAG8A4gBug6SAQkwLjEuMC4yLjKYAQCgAQHAAQHIAQg&sclient=gws-wiz-serp#fpstate=ive&vld=cid:ae750272,vid:20v8zSo2v18