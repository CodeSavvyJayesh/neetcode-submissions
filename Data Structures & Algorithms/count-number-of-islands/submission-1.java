class Solution {
    public int numIslands(char[][] grid) {
        // in this problem we are supposed to find the no. of island 
        // we need the concept of nested for loop 
        // as we are not having sr or sc given in parameters 
        int m = grid.length;
        int n = grid[0].length;
        // we need one boolean 2D array which will keep track 
        boolean [][] visited = new boolean[m][n]; // this will create false array
        int count = 0; // we need counter in order to count the no. of islands 
        for(int i=0;i<m;i++)
        {
             for(int j=0;j<n;j++)
             {
                 if(!visited[i][j] && grid[i][j]=='1')
                 {
                    count++;
                    dfs(i,j,grid,visited); 
                 }
             }
        }
        return count;
    }
    public static void dfs(int row,int col,char[][]grid,boolean[][]visited )
    {
        // in this helper function we would need to do the recursion
        // mark the current element as visited  
        visited[row][col] = true;
        // now we have to do recursion on the basis of 
        // for down: 
        if(row+1<grid.length &&grid[row+1][col]=='1' && !visited[row+1][col])
        {
             dfs(row+1,col,grid,visited);
        }
        // for up: 
        if(row-1>=0 && grid[row-1][col]=='1' && !visited[row-1][col])
        {
             dfs(row-1,col,grid,visited);
        }
        // for left : 
        if(col-1>=0 && grid[row][col-1] == '1' && !visited[row][col-1])
        {
             dfs(row,col-1,grid,visited);
        }
        // for right:
        if(col+1<grid[0].length && grid[row][col+1]=='1' && !visited[row][col+1])
        {
             dfs(row,col+1,grid,visited);
        }
        
    }
}
