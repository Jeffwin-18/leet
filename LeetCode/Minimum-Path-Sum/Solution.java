1class Solution {
2    public int minPathSum(int[][] grid) {
3        int r=grid.length;
4        int c=grid[0].length;
5        int [][]dp=new int[r][c];
6        dp[0][0]=grid[0][0];
7        for(int i=1;i<c;i++)
8        {
9            dp[0][i]=dp[0][i-1]+grid[0][i];
10        }
11        for(int i=1;i<r;i++)
12        {
13            dp[i][0]=dp[i-1][0]+grid[i][0];
14        }
15        for(int i=1;i<r;i++)
16        {
17            for(int j=1;j<c;j++)
18            {
19                dp[i][j]=grid[i][j]+Math.min(dp[i-1][j],dp[i][j-1]);
20
21            }
22        }
23        return dp[r-1][c-1];
24    }
25}