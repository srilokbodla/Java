public class BestTimeToBuyStockWithFee {
    public int maxProfit(int[] prices, int fee) {
        int count = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] - prices[i - 1] > fee) {
                count += prices[i] - prices[i - 1];
            }
        }
        return count;
    }
}
