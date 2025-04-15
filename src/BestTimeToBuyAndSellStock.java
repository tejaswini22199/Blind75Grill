class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        int length = prices.length;
        int[] nextMax = new int[length];
        nextMax[length-1] = 0;
        int maxProfit = 0;
        for(int i = length - 2; i >= 0; i--){
            nextMax[i] = Math.max(prices[i+1], nextMax[i+1]);
        }
        for(int i = 0; i < length; i++){
            maxProfit = Math.max(maxProfit, nextMax[i] - prices[i]);
        }
        return maxProfit;
    }
}