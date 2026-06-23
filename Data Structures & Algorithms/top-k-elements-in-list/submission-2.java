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
        int l=0;
           for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            arr[l][0]=entry.getKey();
            arr[l][1]=entry.getValue();
            l++;
        }
        for(int i=0;i<map.size()-1;i++){
            for(int j=0;j<map.size()-i-1;j++){
                if(arr[j][1]<arr[j+1][1]){
                    int t1=arr[j][1];
                    arr[j][1]=arr[j+1][1];
                    arr[j+1][1]=t1;
                     t1=arr[j][0];
                    arr[j][0]=arr[j+1][0];
                    arr[j+1][0]=t1;
                }
            }
        }
        int[] ar=new int[k];
        for(int i=0;i<k;i++){
            ar[i]=arr[i][0];
        }
        return ar;
    }
}
