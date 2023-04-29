package in.thilakraj;

import java.util.List;

/**
 * Best Time to Buy and Sell Stocks I
 * Problem Description
 * <p>
 * Say you have an array, A, for which the ith element is the price of a given stock on day i.
 * If you were only permitted to complete at most one transaction (i.e, buy one and sell one share of the stock), design an algorithm to find the maximum profit.
 * <p>
 * Return the maximum possible profit.
 */
public class BestTimeToBuyStock {

    public static void main(String[] args) {

    }

    public int maxProfit(final List<Integer> A) {

        int min = A.get(0), max = 0;
        int minIndex = 0, maxIndex = -1;

        for (int i = 1; i < A.size(); i++) {

            if (min < A.get(i) && minIndex <= maxIndex) {
                min = A.get(i);
                minIndex = i;
            } else if (max > A.get(i)) {
                max = A.get(i);
                maxIndex = i;
            }
        }

        return A.get(minIndex) - A.get(maxIndex);
    }
}
