class Solution {
    public boolean isAnagram(String s, String t) {
           if(s.length()!=t.length()){
            return false;
           }
           int n=s.length();
           HashMap <Character,Integer> map1=new HashMap<>();
           HashMap <Character,Integer> map2=new HashMap<>();
           for(int i=0;i<n;i++){
            char a=s.charAt(i);
            char b=t.charAt(i);
            if(map1.containsKey(a)){
                map1.put(a,map1.get(a)+1);
            }
            else{
                map1.put(a,1);
            }
              if(map2.containsKey(b)){
                map2.put(b,map2.get(b)+1);
            }
            else{
                map2.put(b,1);
            }
           }
           return map1.equals(map2);
    
    }
}
