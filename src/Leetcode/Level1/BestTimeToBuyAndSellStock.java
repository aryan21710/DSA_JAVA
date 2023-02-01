package Leetcode.Level1;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertTrue;

public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        int[][] listOfPrices={{7,1,5,3,6,4},{7,2,4,1,3,10},{7,9,3,6,2,1},{7,6,4,3,2,1}};
        int[] answer={5,9,3,-1};
        for (int i = 0; i < listOfPrices.length; i++) {
            if (maxProfit(listOfPrices[i])!=answer[i]) {
                System.out.println("failed for array:-"+i);
            }
        }
    }

    @Test
    public void checkMaxProfit() {
        int[][] listOfPrices={{7,1,5,3,6,4},{7,2,4,1,3,10},{7,9,3,6,2,1},{7,6,4,3,2,1}};
        int[] answer={5,9,3,-1};
        for (int i = 0; i < listOfPrices.length; i++) {
           assertEquals(maxProfit(listOfPrices[i]),answer[i]);
        }
    }

    public static int maxProfit(int[] prices) {
        int prev = 0;
        int diff = -1;
        int iter=1;
        while(iter < prices.length) {
            if (prices[iter] > prices[prev]) {
                if (prices[iter]-prices[prev] > diff)
                    diff=prices[iter]-prices[prev];
                iter++;
            } else {
                prev=iter;
                iter=prev+1;
            }
        }
        return diff;
    }

}
