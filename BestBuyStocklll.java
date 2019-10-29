public class BestBuyStocklll {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 1)
            return 0;
        int max = 0;
//        int minIndex =0 ,maxIndex = 0;
//        int min = Integer.MAX_VALUE;
//        for (int i = 0; i < prices.length; i++) {
//            if (min > prices[i]) {
//                min = prices[i];
//            } else {
//                if (max < prices[i]-min) {
//                    max = prices[i]-min;
//                    maxIndex = i;
//                }
//            }
//        }
//        for (int i =0; i<prices.length; i++) {
//            if (prices[maxIndex]-max == prices[i]){
//                minIndex = i;
//            }
//        }
        for (int i =1; i<prices.length; i++) {
            int sum = maxP( prices, 0, i+1)+maxP( prices, i+1, prices.length);
            max = (max<sum) ? sum:max;
        }
        return max;
    }
    int maxP(int[] prices, int start, int end) {
        int max = 0;
        int min = Integer.MAX_VALUE;
        for (int i =start; i<end; i++) {
            if (min > prices[i] ) {
                min = prices[i];
            } else {
                max = Math.max(max, prices[i]-min);
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] p = new int[] {1,2,3,4,5};
        System.out.println(new BestBuyStocklll().maxProfit(p));
    }
}
