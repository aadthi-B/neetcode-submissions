class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        int n=strs.length;
        HashMap<String,List<String> > map= new HashMap<>();
        for(int z=0;z<n;z++){
            int m=strs[z].length();
            char[] ch=new char[m];
            for(int i=0;i<m;i++){
                ch[i]=strs[z].charAt(i);
            }
            for(int k=0;k<m-1;k++){
                for(int j=0;j<m-1-k;j++){
                    if(ch[j]>ch[j+1]){
                        char temp=ch[j];
                        ch[j]=ch[j+1];
                        ch[j+1]=temp;
                    }
                }
            }
            String res="";
             for(int i=0;i<m;i++){
                res=res+ch[i];
            }
            if(map.containsKey(res)){
                map.get(res).add(strs[z]);
            }
         
                else {
                     List<String> list = new ArrayList<>();
                     list.add(strs[z]);
                     map.put(res, list);
}

            
        }
        return new ArrayList<>(map.values());
    }
}
