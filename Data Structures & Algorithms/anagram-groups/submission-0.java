class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        int n=strs.length;
        HashMap<String,ArrayList<String>> map =new HashMap<>();
        for(int i=0;i<n;i++){
            int m=strs[i].length();
            char[] arr=new char[m];
            for(int j=0;j<m;j++){
                arr[j]=strs[i].charAt(j);
            }
            Arrays.sort(arr);
            String key = Arrays.toString(arr);
            if(map.containsKey(key)){
                map.get(key).add(strs[i]);
            }
            else{
                map.put(key,new ArrayList<>());
                map.get(key).add(strs[i]);
            }
        }
        return new ArrayList<>(map.values());
    }
}
