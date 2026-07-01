class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int r=0;
        int rol=matrix.length-1;
        int col=matrix[0].length-1;
        int i=0;
        while(r<rol && target>matrix[i][col]){
            r++;
            i++;
        }
        if(r>rol) return false;
        int left=0;
        int right=col;
        while(left<=right){
            int mid=(left+right)/2;
            if(matrix[r][mid]>target){
                right=mid-1;
            }
            else if(matrix[r][mid]<target){
                left=mid+1;
            }
            else{
                return true;
            }
        }
        return false;
        

    }
}
