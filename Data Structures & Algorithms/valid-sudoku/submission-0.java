class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> set=new HashSet<>();
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                char a=board[i][j];
                if(a!='.'){
                    String row=a+" is in row "+i;
                    String col=a+" is in col "+j;
                    String block=a+" is in block "+(i/3)+"-"+(j/3);
                    if(set.contains(row) || set.contains(col) || set.contains(block)){
                        return false;
                    }
                    set.add(row);
                    set.add(col);
                    set.add(block);
                }
            }
        }
        return true;
    }
}