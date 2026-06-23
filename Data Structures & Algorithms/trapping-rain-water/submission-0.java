class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int[] maxleft=new int[n];
        int[] maxright=new int[n];
        int count=0;
        maxleft[0]=0;
        int max1=maxleft[0];
        for(int i=1;i<n;i++){
          if(height[i-1]>max1){
            max1=height[i-1];
          }
           maxleft[i]=max1;
          
        }
        maxright[n-1]=0;
        int max2=maxright[n-1];
        for(int i=n-2;i>=0;i--){
          if(height[i+1]>max2){
            max2=height[i+1];
            maxright[i]=max2;
          }
           maxright[i]=max2;
          
        }
      
        for(int i=0;i<n;i++){
            int area=Math.min(maxleft[i],maxright[i])-height[i];
            if(area>0){
                count=count+area;
            }

        }
        return count;
    }
}
