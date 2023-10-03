package in.thilakraj;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * Q2. Merge Overlapping Intervals
 * <p>
 * Problem Description
 * Given a collection of intervals, merge all overlapping intervals.
 * <p>
 * <p>
 * <p>
 * Problem Constraints
 * 1 <= Total number of intervals <= 100000.
 * <p>
 * <p>
 * <p>
 * Input Format
 * First argument is a list of intervals.
 * <p>
 * <p>
 * <p>
 * Output Format
 * Return the sorted list of intervals after merging all the overlapping intervals.
 * <p>
 * <p>
 * <p>
 * Example Input
 * Input 1:
 * <p>
 * [1,3],[2,6],[8,10],[15,18]
 * <p>
 * <p>
 * Example Output
 * Output 1:
 * <p>
 * [1,6],[8,10],[15,18]
 * <p>
 * <p>
 * Example Explanation
 * Explanation 1:
 * <p>
 * Merge intervals [1,3] and [2,6] -> [1,6].
 * so, the required answer after merging is [1,6],[8,10],[15,18].
 * No more overlapping intervals present.
 */

public class MergeOverlappingIntervals {

    public static void main(String[] args) {

    }

    public ArrayList<Interval> merge(ArrayList<Interval> intervals) {

        intervals.sort(Comparator.comparingInt(interval -> interval.start));

        ArrayList<Interval> result = new ArrayList<>();

        Interval prevInterval = intervals.get(0);

        for (int i = 1; i < intervals.size(); i++) {

            Interval currentInterval = intervals.get(i);
            if (prevInterval.end < currentInterval.start) {
                result.add(prevInterval);
                prevInterval = currentInterval;
            } else {
                Interval interval = new Interval();
                interval.start = Math.min(prevInterval.start, currentInterval.start);
                interval.end = Math.max(prevInterval.end, currentInterval.end);
                prevInterval = interval;
            }
        }

        if (result.get(result.size() - 1) != prevInterval) {
            result.add(prevInterval);
        }

        return result;
    }
}
