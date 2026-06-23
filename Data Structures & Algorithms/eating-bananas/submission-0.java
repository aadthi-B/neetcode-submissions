class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int n=piles.length;
        int maxPile=0;
        for(int i=0;i<n;i++){
            if(maxPile<piles[i]){
                maxPile=piles[i];
            }

        }
        int l=1;
        int r=maxPile;
        int k=maxPile;
        while(l<=r){
            int mid=(l+r)/2;
            int count=0;
            for(int pile:piles){
                count=count+((pile+mid-1)/mid);
            }
            if(count<=h){
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
