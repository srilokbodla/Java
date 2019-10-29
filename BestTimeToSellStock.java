public class BestTimeToSellStock {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 1) return 0;
        int max = 0;
        int min = Integer.MAX_VALUE;
        for (int i =0; i<prices.length; i++) {
            if (min > prices[i] ) {
                min = prices[i];
            } else {
                max = Math.max(max, prices[i]-min);
            }
        }

        return max;
    }
    public static void main(String[] args) {
        int[] p = new int[] {7,6,4,3,1};
        System.out.println(new BestTimeToSellStock().maxProfit(p));
    }
}
