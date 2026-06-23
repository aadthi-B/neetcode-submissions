class Solution {
    public int largestRectangleArea(int[] heights) {
        int n=heights.length;
        Stack<int[]> stack=new Stack<>();
        int max=0;
        for(int i=0;i<n;i++){
            int start=i;
            while(!stack.isEmpty() && stack.peek()[0]>heights[i]){
                int[] t=stack.pop();
                int h=t[0];
                int w=i-t[1];
                max=Math.max(max,h*w);
                start=t[1];
            }
            stack.push(new int[]{heights[i],start});
        }
        while(!stack.isEmpty()){
             int[] t=stack.pop();
                int h=t[0];
                int w=n-t[1];
                max=Math.max(max,h*w);
        }
        return max;
    }
}
