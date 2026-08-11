class Solution {
    public boolean isAnagram(String s, String t) {
            if(s.length()!=t.length()) return false;
            int n=s.length();
            char[] as=new char[n];
            for(int i=0;i<n;i++){
               as[i]=s.charAt(i);
            }
            Arrays.sort(as);
            char[] at=new char[n];
            for(int i=0;i<n;i++){
               at[i]=t.charAt(i);
            }
            Arrays.sort(at);
            for(int i=0;i<n;i++){
                if(as[i]!=at[i]) return false;
            }
            return true;
    }
}
