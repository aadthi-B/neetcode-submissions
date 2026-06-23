class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int n=speed.length;
        int[][] arr=new int[n][2];
        Stack<Double> stack=new Stack<>();
        for(int i=0;i<n;i++){
            arr[i][0]=position[i];
            arr[i][1]=speed[i];
        }
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1-i;j++){
                if(arr[j][0]<arr[j+1][0]){
                    int t1=arr[j][0];
                    arr[j][0]=arr[j+1][0];
                    arr[j+1][0]=t1;
                     t1=arr[j][1];
                    arr[j][1]=arr[j+1][1];
                    arr[j+1][1]=t1;
                }
            }
        }
        double time=(double)(target-arr[0][0])/arr[0][1];
        stack.push(time);
        for(int i=1;i<n;i++){
            Double t=(double)(target-arr[i][0])/arr[i][1];
            if(t>stack.peek()){
               stack.push(t);
            }
        }
        return stack.size();


    }
}
