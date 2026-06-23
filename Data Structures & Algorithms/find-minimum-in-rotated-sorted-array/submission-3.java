class Solution {
    public int findMin(int[] nums) {
    int n=nums.length;
    int l=0;
    int r=n-1;
    int res=nums[0];
    while(l<=r){
        if(nums[l]<nums[r]){
            res=Math.min(res,nums[l]);
            
        }
        int mid=l+(r-l)/2;

        res=Math.min(res,nums[mid]);
        if(nums[l]<=nums[mid]){
            l=mid+1;
        }
        else{
            r=mid-1;
        }
     }  
      return res;
    }
}
