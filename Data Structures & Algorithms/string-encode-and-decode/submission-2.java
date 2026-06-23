class Solution {

    public String encode(List<String> strs) {
       int n=strs.size();
       String str="";
       for(String s:strs){
           str=str+s.length()+"#"+s;
       }
       return str;
       
    }

    public List<String> decode(String str) {
     ArrayList<String> list=new ArrayList<>();
     int n=str.length();
     int i=0;
     while(i<n){
        int count=0;
        while(str.charAt(i)!='#'){
           count = count * 10 + (str.charAt(i) - '0');
           i++;

        }
        if(str.charAt(i)=='#'){
            i++;
            String s=str.substring(i,i+count);
            list.add(s);
            i=i+count;
            
        }
        

     }
     return list;
    }
}
