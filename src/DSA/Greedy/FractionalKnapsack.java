package DSA.Greedy;

import java.util.Arrays;

public class FractionalKnapsack {

    static float findMaxProfit(KnapSack[] sacks, int maxWeight) {
        int remainingWeight=0;
        int weightNeeded = 0;
        float maxProfit = 0f;
        for (int i = 0; i < sacks.length; i++) {
            remainingWeight += sacks[i].getWeight();
            if (remainingWeight < maxWeight) {
                weightNeeded = maxWeight - remainingWeight;
                maxProfit+=sacks[i].getProfit();
            } else {
                maxProfit+=((float) weightNeeded/sacks[i].getWeight())*sacks[i].getProfit();
                break;
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int maxWeight = 60;
        KnapSack sack1 = new KnapSack(10,100);
        KnapSack sack2 = new KnapSack(20,150);
        KnapSack sack3 = new KnapSack(15,60);
        KnapSack sack4 = new KnapSack(25,200);
        KnapSack sack5 = new KnapSack(10,150);
        KnapSack[] sacks = {sack1, sack2, sack3, sack4, sack5};
        Arrays.sort(sacks);
        System.out.println(findMaxProfit(sacks,maxWeight));
    }
}

class KnapSack implements Comparable<KnapSack>{
    private int weight;
    private int profit;
    private int profitToWeightRatio;
    public KnapSack(int weight, int profit) {
        this.weight = weight;
        this.profit = profit;
        profitToWeightRatio = this.profit/this.weight;
    }

    public int getWeight() {
        return this.weight;
    }

    public int getProfit() {
        return this.profit;
    }

    public int compareTo(KnapSack otherSack) {
       return  otherSack.profitToWeightRatio - this.profitToWeightRatio;
    }
}
