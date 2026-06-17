class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        int col = matrix[0].length;
        // we have to think about the index all the time 
        int low = 0;
        int high = row*col-1;
        while(low<=high)
        {
             int mid = low + (high-low)/2;
             int rows = mid/col;
             int cols = mid%col;
             if(matrix[rows][cols]==target)
             {
                return true;
             }
             else if(matrix[rows][cols]<target)
             {
                 low = mid+1;
             }
             else
             {
                 high = mid-1;
             }
        }
        return false;
    }
}
