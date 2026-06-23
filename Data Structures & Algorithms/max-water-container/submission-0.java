class Solution {
    public int maxArea(int[] heights) {
        int n=heights.length;
        int l=0;
        int r=n-1;
        int max=0;
        while(l<r){
        int temp=(r-l)*Math.min(heights[l],heights[r]);
        if(temp>max){
            max=temp;
        }
        if(heights[l]>heights[r]){
            r--;
        }
        else{
            l++;
        }
        }
        return max;
    }
}
