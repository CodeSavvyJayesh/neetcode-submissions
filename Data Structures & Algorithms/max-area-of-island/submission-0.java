class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        // in this problem we are going to use the dfs in order to calculate the area of a island
        int m = grid.length;
        int n = grid[0].length;
        // now again we dont have source and desti given 
        // we need to use the concept of nested loop 
        // required the boolean 2D array in order to keep the track of the eleemtns 
        boolean[][] visited = new boolean[m][n];
        // since we required the maxArea 
        // we definately need the Math.max fun
        int maxArea = 0;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                 if(!visited[i][j] && grid[i][j]==1)
                 {
                 int area = dfs(i,j,grid,visited);
                 maxArea = Math.max(area,maxArea);
                 }
            }
        }
        return maxArea;
    }
    public static int dfs(int row,int col,int[][]grid,boolean[][]visited)
    {
         // first thing which we have to do is 
         // mark the current position as visited 
         visited[row][col] = true;
         // now we have to perform dfs according to the up,down,left,right
         int area = 1; // this we have intialized because
         // when we are in this function the area is already 1 
         // for up:
         if(row-1>=0 && grid[row-1][col]==1 && !visited[row-1][col])
         {
             area+=dfs(row-1,col,grid,visited);
         }
          if(row+1<grid.length && grid[row+1][col]==1 && !visited[row+1][col])
         {
             area+=dfs(row+1,col,grid,visited);
         }
          if(col-1>=0 && grid[row][col-1]==1 && !visited[row][col-1])
         {
             area+=dfs(row,col-1,grid,visited);
         }
          if(col+1<grid[0].length && grid[row][col+1]==1 && !visited[row][col+1])
         {
             area+=dfs(row,col+1,grid,visited);
         }

         return area;
    }
}
