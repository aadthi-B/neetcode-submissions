class Solution {
    public int longestConsecutive(int[] nums) {
        int n=nums.length;
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<n;i++){
           set.add(nums[i]);
        }
        int longest=0;
        for(int num:set){
            int length=0;
            if(!set.contains(num-1)){
               length=1;
               while(set.contains(num+length)){
                length++;
               }
            }
            longest=Math.max(length,longest);
        }
        return longest;
    }
}