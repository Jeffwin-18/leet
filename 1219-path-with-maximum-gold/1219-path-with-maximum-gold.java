class Solution {
    public int getMaximumGold(int[][] grid) {
        int row=grid.length;
        int col=grid[0].length;
        int maxgold=0;
        for(int r=0;r<row;r++)
        {
            for(int c=0;c<col;c++)
            {
                if(grid[r][c]>0)
                {
                    maxgold=Math.max(maxgold,backtrack(grid,r,c));
                }
            }
        }
        return maxgold;

    }
    private int backtrack(int [][] grid,int r, int c)
    {
        if (r < 0 || r >= grid.length || c < 0 || c >= grid[0].length || grid[r][c] == 0) 
        {
            return 0;
        }
        int currGold=grid[r][c];
        grid[r][c]=0;
        int up=backtrack(grid,r-1,c);
        int down=backtrack(grid,r+1,c);
        int left=backtrack(grid,r,c-1);
        int right=backtrack(grid,r,c+1);
        grid[r][c]=currGold;
        return currGold+Math.max(Math.max(up,down),Math.max(left,right));
    }
}