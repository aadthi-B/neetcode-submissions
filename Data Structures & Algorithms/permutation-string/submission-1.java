class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n1=s1.length();
        int n2=s2.length();
        if(n1>n2) return false;
        HashMap<Character,Integer> map1=new HashMap<>();
        for(int i=0;i<n1;i++){
            char ch=s1.charAt(i);
            if(!map1.containsKey(ch)){
                map1.put(ch,1);
            }
            else{
                map1.put(ch,map1.get(ch)+1);
            }
         }
         int l=0;
         int r=n1-1;
         while(r<n2){
            HashMap<Character,Integer> map2=new HashMap<>();
            for(int i=l;i<=r;i++){
            char ch=s2.charAt(i);
            if(!map2.containsKey(ch)){
                map2.put(ch,1);
            }
            else{
                map2.put(ch,map2.get(ch)+1);
            }
         }
         if(map1.equals(map2)) return true;
         l++;
         r++;

         }
         return false;
    }
}
