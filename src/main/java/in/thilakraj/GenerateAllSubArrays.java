package in.thilakraj;

import java.util.ArrayList;

public class GenerateAllSubArrays {

    public static void main(String[] args) {

    }

    public ArrayList<ArrayList<Integer>> solve(ArrayList<Integer> A) {
        ArrayList<ArrayList<Integer>> subArrays = new ArrayList<>();
        for (int i = 0; i < A.size(); i++) {
            for (int j = i; j < A.size(); j++) {
                ArrayList<Integer> subList = new ArrayList<>();
                for (int k = i; k <= j; k++) {
                    subList.add(A.get(k));
                }
                subArrays.add(subList);
            }
        }
        return subArrays;
    }
}
