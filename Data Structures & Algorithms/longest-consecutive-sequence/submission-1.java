class Solution {
    public int longestConsecutive(int[] nums) {
        int n=nums.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],null);
            }
        }
        int maxcount=0;
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            int i=entry.getKey();
            int count=1;
            if(!map.containsKey(i-1)){
               while(map.containsKey(i+count)){
                count++;
               }
            }
           if(maxcount<count){
            maxcount=count;
           }
        }
        return maxcount;
    }
}
