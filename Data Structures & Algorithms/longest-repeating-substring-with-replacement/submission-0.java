class Solution {
    public int characterReplacement(String s, int k) {
        int n=s.length();
        HashMap<Character,Integer> map=new HashMap<>();
        int l=0;
        int r=0;
        int maxf=0;
        int res=0;
        while(r<n){
            char ch=s.charAt(r);
            if(!map.containsKey(ch)){
                map.put(ch,1);
            }
            else{
                map.put(ch,map.get(ch)+1);
            }
            maxf=Math.max(maxf,map.get(ch));
            while((r-l+1)-maxf>k){
                char chh=s.charAt(l);
                map.put(chh,map.get(chh)-1);
                l++;
            }
            res=Math.max(res,(r-l+1));
            r++;
        }
        return res;
    
    }
}
