1class Solution {
2    public int getMaximumGold(int[][] grid) {
3        int row=grid.length;
4        int col=grid[0].length;
5        int maxgold=0;
6        for(int r=0;r<row;r++)
7        {
8            for(int c=0;c<col;c++)
9            {
10                if(grid[r][c]>0)
11                {
12                    maxgold=Math.max(maxgold,backtrack(grid,r,c));
13                }
14            }
15        }
16        return maxgold;
17
18    }
19    private int backtrack(int [][] grid,int r, int c)
20    {
21        if (r < 0 || r >= grid.length || c < 0 || c >= grid[0].length || grid[r][c] == 0) 
22        {
23            return 0;
24        }
25        int currGold=grid[r][c];
26        grid[r][c]=0;
27        int up=backtrack(grid,r-1,c);
28        int down=backtrack(grid,r+1,c);
29        int left=backtrack(grid,r,c-1);
30        int right=backtrack(grid,r,c+1);
31        grid[r][c]=currGold;
32        return currGold+Math.max(Math.max(up,down),Math.max(left,right));
33    }
34}