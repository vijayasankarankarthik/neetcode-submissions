class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        if(prices.length<=1) return 0;
        else{
        ArrayList<Integer>diff= new ArrayList<>();
        for (int i = 0 ; i<prices.length ;i++){
            for(int j=i+1 ; j<prices.length ; j++){
                diff.add(prices[j]-prices[i]);
            }
        }
        profit = Collections.max(diff);
        if(profit>=0){
            return profit;
        }
        else return 0;
        }
    }
}
