class Solution {
    public String minWindow(String s, String t) {
        int n=s.length();
        int n1=t.length();
        HashMap<Character,Integer> map1=new HashMap<>();
        HashMap<Character,Integer> map2=new HashMap<>();
        for(int i=0;i<n1;i++){
            char ch=t.charAt(i);
            if(!map1.containsKey(ch)) map1.put(ch,1);
            else map1.put(ch,map1.get(ch)+1);
        }
        int l=0;
        int have=0;
        int need=map1.size();
        int[] res={-1,-1};
        int resl=Integer.MAX_VALUE;
        for(int r=0;r<n;r++){
            char ch=s.charAt(r);
            if(!map2.containsKey(ch)) map2.put(ch,1);
            else map2.put(ch,map2.get(ch)+1);

            if(map1.containsKey(ch) && map2.get(ch)==map1.get(ch)){
                have++;
            }
            while(have==need){
                if((r-l+1)<resl){
                    resl=r-l+1;
                    res[0]=l;
                    res[1]=r;
                }
                char left=s.charAt(l);
                map2.put(left,map2.get(left)-1);
                if(map1.containsKey(left) && map1.get(left)>map2.get(left)){
                    have--;
                }
                l++;

            }
            
        }
        if(resl==Integer.MAX_VALUE){
            return "";
        }
        return s.substring(res[0],res[1]+1);
    }
}
