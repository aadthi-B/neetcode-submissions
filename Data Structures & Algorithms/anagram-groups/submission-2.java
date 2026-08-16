class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        int n=strs.length;
        HashMap<String,List<String>> map=new HashMap<>();
        for(int i=0;i<n;i++){
           int N=strs[i].length();
           char[] ar=new char[N];
           for(int j=0;j<N;j++){
              ar[j]=strs[i].charAt(j);
           }
           Arrays.sort(ar);
           String str="";
           for(int j=0;j<N;j++){
            str=str+ar[j];
           }
           if(map.containsKey(str)){
            map.get(str).add(strs[i]);
           }
           else{
            List<String> list=new ArrayList<>();
            list.add(strs[i]);
            map.put(str,list);
           }

        }
        return new ArrayList<>(map.values());
    }
}
