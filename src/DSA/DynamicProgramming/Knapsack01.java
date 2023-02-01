package DSA.DynamicProgramming;


public class Knapsack01 {
    public static void main(String[] args) {
        int knapsackSize = 23;
        int[] weights={5,7,3,8,4,3,7,5}, values = {12,10,9,16,14,7,14,10};
        System.out.println(findMaxProfit(weights,knapsackSize,values));
    }

    static int findMaxProfit(int[] weights,int knapsackSize, int[] values) {
        int[][] items=new int[weights.length+1][knapsackSize+1];
        for (int i = 1; i <= weights.length; i++) {
            for (int j = 1; j <= knapsackSize; j++) {
                if (weights[i-1] <= j)
                    items[i][j]=Math.max(values[i-1]+items[i-1][j-weights[i-1]],items[i-1][j]);
                else
                    items[i][j]=items[i-1][j];
            }
        }

        int i = weights.length;
        int j = knapsackSize;
        while(i > 0 && j > 0) {
            if (items[i][j] == items[i-1][j])
                i=i-1;
            else {
                System.out.println("Item picked is "+ weights[i-1]+","+values[i-1]);
                j=j-weights[i-1];
                i=i-1;
            }
        }
        return items[weights.length][knapsackSize];
    }


}
