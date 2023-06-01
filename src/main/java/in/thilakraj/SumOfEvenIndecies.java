package in.thilakraj;

import java.util.ArrayList;
import java.util.Arrays;

public class SumOfEvenIndecies {

    public static void main(String[] args) {

    }

    public ArrayList<Integer> solve(ArrayList<Integer> A, ArrayList<ArrayList<Integer>> B) {

        ArrayList<Integer> result = new ArrayList<>();
        ArrayList<Integer> prefixSum = new ArrayList<>();
        int sum = 0;

        for(int i=0; i<A.size(); i++) {
            if(i%2==0) {
                sum += A.get(i);
            }
            prefixSum.add(sum);
        }

        for(int i=0; i<B.size(); i++) {
            int startIndex = B.get(i).get(0);
            int endIndex = B.get(i).get(1);
            result.add(prefixSum.get(endIndex)- (startIndex==0?0: prefixSum.get(startIndex-1)));
        }

        return  result;
    }
}
