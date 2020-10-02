class Solution {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length < 2 ) return 0;
        boolean buy = true;
        int currentProfit = 0;
        int currentBuy = 0;
    
        for ( int i = 0; i<prices.length ; ++i ) {
            int previous_price = Integer.MAX_VALUE;
            int next_price = Integer.MIN_VALUE;
            
            
            int current_price = prices[i];
            if ( i + 1 < prices.length) next_price = prices[i + 1];
            if (i - 1 >= 0 ) previous_price = prices[i - 1];
            
            if (buy) {
                if (current_price <= previous_price && current_price <= next_price ) {
                    currentBuy = current_price;
                    buy = false;
                }
            } 
            if (!buy) { 
                if (current_price >= previous_price && current_price >= next_price) {
                    currentProfit += current_price - currentBuy;
                    buy = true;
                }
            }
        }
        return currentProfit;
        
     
    }
}