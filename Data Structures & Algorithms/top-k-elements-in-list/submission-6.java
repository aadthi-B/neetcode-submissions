class Solution {
    public int[] topKFrequent(int[] nums, int k) {
            int n=nums.length;
            HashMap<Integer,Integer> map=new HashMap<>();
            for(int i=0;i<n;i++){
                if(map.containsKey(nums[i])){
                   map.put(nums[i],map.get(nums[i])+1);
                }
                else{
                    map.put(nums[i],1);
                }
            }
            int[][] arr=new int[map.size()][2];
            int w=0;
            for(Map.Entry<Integer,Integer> entry:map.entrySet()){
               arr[w][0]=entry.getKey();
               arr[w][1]=entry.getValue();
               w++;
            }
            for(int i=0;i<map.size();i++){
                for(int j=0;j<map.size()-i-1;j++){
                    if(arr[j][1]<arr[j+1][1]){
                        int t1=arr[j][1];
                        arr[j][1]=arr[j+1][1];
                        arr[j+1][1]=t1;
                        int t2=arr[j][0];
                        arr[j][0]=arr[j+1][0];
                        arr[j+1][0]=t2;
                    }
                }
            }
            int[] res=new int[k];
            for(int i=0;i<k;i++){
                res[i]=arr[i][0];
            }
     return res;

    }
}
