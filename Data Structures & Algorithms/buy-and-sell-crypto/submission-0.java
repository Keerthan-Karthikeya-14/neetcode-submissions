class Solution {
    public int maxProfit(int[] prices) {
        int start = 0;
        int end = 1;
        int max = 0;
        while(end < prices.length){

           if(prices[end]>prices[start]){
            max = Math.max(max,prices[end] - prices[start]);
            }
            else{
                start=end;
            }
            end++;
        }
        return max;
    }
}
