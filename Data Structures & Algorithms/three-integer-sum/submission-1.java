class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        List<List<Integer>> list=new ArrayList<>();
        for(int i=0;i<n;i++){
            int a=nums[i];
           if (i > 0 && nums[i] == nums[i - 1]) continue;
 
            int l=i+1;
            int r=n-1;
            int  target =0-a;
            while(l<r){
                int sum=nums[l]+nums[r];
                if(sum==target){
                    ArrayList<Integer> li=new ArrayList<>();
                    while (l < r && nums[l] == nums[l + 1]) l++;
                    while (l < r && nums[r] == nums[r - 1]) r--;
                    li.add(a);
                    li.add(nums[l]);
                    li.add(nums[r]);
                    list.add(li);
                    l++;
                    r--;
                    
                }
                else if(sum>target){
                    r--;
                }
                else{
                    l++;
                }

            }

        }
        return list;
        
    }
}
