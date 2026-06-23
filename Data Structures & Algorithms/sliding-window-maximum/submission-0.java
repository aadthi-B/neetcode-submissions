class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n=nums.length;
        int N=n-k+1;
        int[] res=new int[N];
        int l=0;
        int r=k-1;
        while(r<n){
            int var=l;
            int max=Integer.MIN_VALUE;
            while(var<=r){
                if(nums[var]>max){
                    max=nums[var];
                }
                var++;
            }
            res[l]=max;
            l++;
            r++;
        }
        return res;
    }
}
