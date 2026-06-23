class Solution {
    public boolean isPalindrome(String s) {
        int l=0;
        int r=s.length()-1;
        if(s.length()==0){
            return true;
        }
        while(l<r){
            while( l<r && !isAlphaNum(s.charAt(l))){
                l++;
            }
            while(l<r && ! isAlphaNum(s.charAt(r))){
                r--;
            }
            char a=s.charAt(l);
            char b=s.charAt(r);
            if(a>='A' && a<='Z' ){
                a=(char)(a+32);
            }
             if(b>='A' && b<='Z' ){
                b=(char)(b+32);
            }
            if(a!=b){
                return false;
            }
            l++;
            r--;
        }
      
        return true;
    }
      boolean isAlphaNum(char c){
            return (c>='a' && c<='z' ||c>='A' && c<='Z' || c>='0' && c<='9' );
        }
}