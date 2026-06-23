class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int l=0;
        int r=1;
        int p=0;
        while(r<n){
            if(prices[l]<prices[r]){
                p=Math.max(p,prices[r]-prices[l]);
            }
            else{
                l=r;
            }
            r++;
        }
        return p;
    }
}
