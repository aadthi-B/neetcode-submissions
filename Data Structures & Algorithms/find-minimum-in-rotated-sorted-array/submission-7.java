class Solution {
    public int findMin(int[] nums) {
        int n=nums.length;
        int l=0;
        int r=n-1;
        int min=Integer.MAX_VALUE;
        while(l<=r){
            if(nums[l]<nums[r]){
                min=Math.min(nums[l],min);
            }
            int mid=l+(r-l)/2;
            min=Math.min(min,nums[mid]);
            if(nums[mid]>=nums[l]){
             l=mid+1;
            }
            else{
                r=mid-1;
            }
        }
        return min;
    }
}
