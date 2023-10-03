package in.thilakraj;

import java.util.ArrayList;

/**
 * Q1. Merge Intervals
 * Unsolved
 * feature icon
 * Using hints is now penalty free
 * Use Hint
 * Problem Description
 * Given a set of non-overlapping intervals, insert a new interval into the intervals (merge if necessary).
 * <p>
 * You may assume that the intervals were initially sorted according to their start times.
 * <p>
 * <p>
 * <p>
 * Problem Constraints
 * 0 <= |intervals| <= 105
 * <p>
 * <p>
 * <p>
 * Input Format
 * First argument is the vector of intervals
 * <p>
 * second argument is the new interval to be merged
 * <p>
 * <p>
 * <p>
 * Output Format
 * Return the vector of intervals after merging
 * <p>
 * <p>
 * <p>
 * Example Input
 * Input 1:
 * <p>
 * Given intervals [1, 3], [6, 9] insert and merge [2, 5] .
 * Input 2:
 * <p>
 * Given intervals [1, 3], [6, 9] insert and merge [2, 6] .
 * <p>
 * <p>
 * Example Output
 * Output 1:
 * <p>
 * [ [1, 5], [6, 9] ]
 * Output 2:
 * <p>
 * [ [1, 9] ]
 * <p>
 * <p>
 * Example Explanation
 * Explanation 1:
 * <p>
 * (2,5) does not completely merge the given intervals
 * Explanation 2:
 * <p>
 * (2,6) completely merges the given intervals
 * <p>
 * <p>
 * <p>
 * Expected Output
 * Enter your input as per the following guideline:
 * There are 3 lines in the input
 * <p>
 * Line 1 ( Corresponds to arg 1 ) : An array of intervals. First number represents the number of intervals to follow. Then for every interval we get a pair of integers.
 * For example, Intervals: [(1, 3), (6, 9)] will be written as "2 1 3 6 9"(without quotes).
 * <p>
 * Line 2 & Line 3 ( Corresponds to arg 2 ) : New Interval represented by a pair of integers.
 * For example, Interval: (2, 5) will be written as "2 5"(without quotes)
 */
public class MergeIntervals {

    public ArrayList<Interval> insert(ArrayList<Interval> intervals, Interval newInterval) {

        ArrayList<Interval> result = new ArrayList<>();

        for (int i = 0; i < intervals.size(); i++) {

            if (newInterval.start > intervals.get(i).end) {
                result.add(intervals.get(i));
            } else if (newInterval.end < intervals.get(i).start) {
                result.add(newInterval);
                for (int j = i; j < intervals.size(); j++) {
                    result.add(intervals.get(j));
                }
                return result;
            } else {
                newInterval.start = Math.min(newInterval.start, intervals.get(i).start);
                newInterval.end = Math.max(newInterval.end, intervals.get(i).end);
            }
        }

        result.add(newInterval);


        return result;
    }
}

class Interval {
    int start;
    int end;

    Interval() {
        start = 0;
        end = 0;
    }

    Interval(int s, int e) {
        start = s;
        end = e;
    }
}
