class Solution {
    public boolean isValidSudoku(char[][] board) {
        int n=board.length;
        HashMap<String,Character> map=new HashMap<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                char ch=board[i][j];
                if(ch!='.'){
                   String s1=ch+" is in row "+j;
                   String s2=ch+" is in col "+i;
                   String s3=ch+" is in block "+i/3+"-"+j/3;
                   if(map.containsKey(s1) || map.containsKey(s2) || map.containsKey(s3)){
                    return false;
                   }
                   map.put(s1,null);
                   map.put(s2,null);
                   map.put(s3,null);

                }
            }
        }
        return true;
    }
}
