class Solution {
    public boolean isPalindrome(String s) {
        int n=s.length();
        int l=0;
        int r=n-1;
        while(l<r){
            while(l<r &&!isAlpha(s.charAt(l))){
                l++;
            }
            while(l<r &&!isAlpha(s.charAt(r))){
                r--;
            }
            char ch1=s.charAt(l);
            char ch2=s.charAt(r);
            if(ch1>='A' && ch1<='Z'){
                ch1=(char)(ch1+32);
            }
            if(ch2>='A' && ch2<='Z'){
                ch2=(char)(ch2+32);
            }
            if(ch1!=ch2){
                return false;
            }
           l++;
           r--;

        }
        return true;
    }
        
        boolean isAlpha(char a){
            if((a>='a'  && a<='z') || (a>='A'  && a<='Z') || (a>='0'  && a<='9') ){
                return true;
            }
            else{
                return false;
            }
        }
}