package DSA.Greedy;

public class SellBuyStockPrice {

    public int findProfit(int[] dailyStockPrices) {
        int maxProfit=0;
        int min=dailyStockPrices[0];
        for (Integer current: dailyStockPrices) {
            if (current < min)
                min = current;
            if (current - min > maxProfit) {
                maxProfit = current - min;
            }

        }
        return maxProfit;
    }
    public static void main(String[] args) {
        SellBuyStockPrice trading = new SellBuyStockPrice();
        int[] dailyStockPrices={9,8,12,3,15,4};
        System.out.print(trading.findProfit(dailyStockPrices));
//        System.out.print("best buyingPrice "+bestBuyingPrice+ " best sellingPrice "+ sellingPrice + " with MaxProfit of "+maxProfit);
    }
}
