class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int[] ar=new int[n];
        ar[0]=1;
        for(int i=1;i<n;i++){
            ar[i]=ar[i-1]*nums[i-1];
        }
         int[] ar1=new int[n];
         ar1[n-1]=1;
         for(int i=n-2;i>=0;i--){
            ar1[i]=ar1[i+1]*nums[i+1];
         }
          for(int i=0;i<n;i++){
            ar[i]=ar[i]*ar1[i];
        }
        return ar;
    }
}  
