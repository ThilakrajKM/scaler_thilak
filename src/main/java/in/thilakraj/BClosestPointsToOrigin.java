package in.thilakraj;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

/**
 * Problem Description
 * We have a list A of points (x, y) on the plane. Find the B closest points to the origin (0, 0).
 * <p>
 * Here, the distance between two points on a plane is the Euclidean distance.
 * <p>
 * You may return the answer in any order. The answer is guaranteed to be unique (except for the order that it is in.)
 * <p>
 * NOTE: Euclidean distance between two points P1(x1, y1) and P2(x2, y2) is sqrt( (x1-x2)2 + (y1-y2)2 ).
 * <p>
 * <p>
 * <p>
 * Problem Constraints
 * 1 <= B <= length of the list A <= 105
 * -105 <= A[i][0] <= 105
 * -105 <= A[i][1] <= 105
 * <p>
 * <p>
 * <p>
 * Input Format
 * The argument given is list A and an integer B.
 * <p>
 * <p>
 * <p>
 * Output Format
 * Return the B closest points to the origin (0, 0) in any order.
 * <p>
 * <p>
 * <p>
 * Example Input
 * Input 1:
 * <p>
 * A = [
 * [1, 3],
 * [-2, 2]
 * ]
 * B = 1
 * Input 2:
 * <p>
 * A = [
 * [1, -1],
 * [2, -1]
 * ]
 * B = 1
 * <p>
 * <p>
 * Example Output
 * Output 1:
 * <p>
 * [ [-2, 2] ]
 * Output 2:
 * <p>
 * [ [1, -1] ]
 * <p>
 * <p>
 * Example Explanation
 * Explanation 1:
 * <p>
 * The Euclidean distance will be sqrt(10) for point [1,3] and sqrt(8) for point [-2,2].
 * So one closest point will be [-2,2].
 * Explanation 2:
 * <p>
 * The Euclidean distance will be sqrt(2) for point [1,-1] and sqrt(5) for point [2,-1].
 * So one closest point will be [1,-1].
 */
public class BClosestPointsToOrigin {

    public static void main(String[] args) {

    }

    public ArrayList<ArrayList<Integer>> solve(ArrayList<ArrayList<Integer>> A, int B) {

        ArrayList<ArrayList<Integer>> result = new ArrayList<>();


        Collections.sort(A, (point1, point2) -> {
            double distance1 = Math.sqrt(Math.pow(point1.get(0), 2) + Math.pow(point1.get(1), 2));
            double distance2 = Math.sqrt(Math.pow(point2.get(0), 2) + Math.pow(point2.get(1), 2));
            return (int) (distance1 - distance2);
        });

        for (int i = 0; i < B; i++) {
            result.add(A.get(i));
        }

        return result;
    }

}
//

class Point {
    int x, y;
    double distance;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
        this.distance = Math.sqrt(x * x + y * y);
    }
}

class Solution1 {
    public int[][] solve(int[][] points, int K) {
        // sort A based on distance to origin
        PriorityQueue<Point> pq = new PriorityQueue<>((a, b) -> Double.compare(a.distance, b.distance));

        for (int[] point : points) {
            pq.offer(new Point(point[0], point[1]));
        }

        int[][] result = new int[K][2];
        int i = 0;

        while (K-- > 0) {
            Point p = pq.poll();
            result[i][0] = p.x;
            result[i][1] = p.y;
            i++;
        }

        return result;
    }
}



