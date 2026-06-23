class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        HashMap<Character,Integer> map=new HashMap<>();
        int maxlength=0;
        int r=0,l=0;
        while(r<n){
            char ch=s.charAt(r);
            if(map.containsKey(ch)){
                l=Math.max(l,map.get(ch)+1);
            }
            map.put(ch,r);
            maxlength=Math.max(maxlength,r+1-l);
            r++;
        }
       
        return maxlength;
    }
}
