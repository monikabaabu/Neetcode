class Solution {
    public int maxProfit(int[] prices) {
        int l=0;
        int r=0;
        int max=0;
        while(l<prices.length && r < prices.length){
            if(l<r){
                if(prices[l]< prices[r] ){
                max = Math.max(max,prices[r]-prices[l]);
                r++;
                }
                else{
                    l++;
                }
            }
            else{
                r++;
            }
        }
        return max;
    }
}
