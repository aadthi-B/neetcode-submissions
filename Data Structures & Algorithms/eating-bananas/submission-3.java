class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int n=piles.length;
        int maxpile=0;
        for(int p:piles){
            maxpile=Math.max(maxpile,p);
        }
        int l=1;
        int r=maxpile;
        int bananaPerHr=0;
        while(l<=r){
            int mid=l+(r-l)/2;
            int hr=0;
            for(int p:piles){
                hr=hr+(p+mid-1)/mid;
            }
            if(hr<=h){
                bananaPerHr=mid;
                r=mid-1;
            }
            else{
                l=mid+1;
            }

          }
          return bananaPerHr;
    }
}
