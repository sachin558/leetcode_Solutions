class Solution {
    public int maxProfit(int[] prices) {
       int minprice=Integer.MAX_VALUE;
        int maxpropfit=0;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<minprice){
                minprice=prices[i];
            }
            maxpropfit=Math.max(prices[i]-minprice,maxpropfit);
        }
        return maxpropfit;
    }
}