package in.thilakraj;

import java.util.ArrayList;
import java.util.HashSet;

public class CountDistinctElements {

    public int solve(ArrayList<Integer> A) {
        HashSet<Integer> distinctElements = new HashSet<>();
        for (int i = 0; i < A.size(); i++) {
            distinctElements.add(A.get(i));
        }
        return distinctElements.size();
    }
}
