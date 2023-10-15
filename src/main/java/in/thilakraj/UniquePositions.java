package in.thilakraj;

import java.util.HashSet;

public class UniquePositions {

    public static void main(String[] args) {
        System.out.println("Ans : " + uniquePositions("FFFF", 1));
        System.out.println("Ans : " + uniquePositions("FBFB", 2));
    }

    public static int uniquePositions(String moves, long k) {


        HashSet<Long> positions = new HashSet<>();

        char[] movesChars = moves.toCharArray();
        long distance = 0L;
        positions.add(distance);

        for (int i = 0; i < movesChars.length; i++) {
            if (movesChars[i] == 'F') {
                distance += k;
                positions.add(distance);
            } else if (movesChars[i] == 'B') {
                distance -= k;
                positions.add(distance);
            }
        }

        return positions.size();
    }
}
