package in.thilakraj;

import java.util.ArrayList;
import java.util.HashMap;

public class CountPairSum {

    /*public int solve(ArrayList<Integer> A, int B) {

        HashMap<Integer, Integer> numFreq = new HashMap<>();

        int mod = (int)(1e9 + 7);

        for(int i=0;i<A.size(); i++) {
            if(numFreq.containsKey(A.get(i))) {
                numFreq.put(A.get(i), numFreq.get(A.get(i))+1);
            }else {
                numFreq.put(A.get(i), 1);
            }
        }

        int result = 0;
        for(int i=0;i<A.size(); i++) {
            int diff = B-A.get(i);
            if(numFreq.containsKey(diff)) {
                result =  ( (result%mod) + (numFreq.get(diff)%mod) ) % mod;
                if(diff == A.get(i)) {
                    result--;
                }
            }
        }

        return result/2;
    }*/

    public class Solution {
        public int solve(ArrayList<Integer> A, int B) {
            HashMap<Integer, Integer> numFreq = new HashMap<>();

            int mod = (int) (1e9 + 7);

            long result = 0L;
            for (int i = 0; i < A.size(); i++) {
                int diff = B - A.get(i);
                if (numFreq.containsKey(diff)) {
                    result = ((result % mod) + (numFreq.get(diff) % mod)) % mod;
                    if (numFreq.containsKey(A.get(i))) {
                        numFreq.put(A.get(i), numFreq.get(A.get(i)) + 1);
                    } else {
                        numFreq.put(A.get(i), 1);
                    }
                } else {
                    if (numFreq.containsKey(A.get(i))) {
                        numFreq.put(A.get(i), numFreq.get(A.get(i)) + 1);
                    } else {
                        numFreq.put(A.get(i), 1);
                    }
                }
            }

            return (int) result;
        }
    }

}
