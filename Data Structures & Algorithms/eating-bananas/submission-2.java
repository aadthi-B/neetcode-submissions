class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int n=piles.length;
        int maxPile=0;
        for(int pile:piles){
            maxPile=Math.max(maxPile,pile);
        }
        int l=1;
        int r=maxPile;
        int k=maxPile;
        while(l<=r){
            int mid=l+(r-l)/2; 
            int rateOfEating=0;
            for(int pile:piles){
            rateOfEating+=(pile+mid-1)/mid;
            }
            if(rateOfEating<=h){
                k=mid;
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        

        }
        return k;
        
    }
}
