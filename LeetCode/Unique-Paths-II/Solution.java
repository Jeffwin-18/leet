1class Solution {
2    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
3        int n=obstacleGrid[0].length;
4        int [] dp=new int [n];
5        dp[0]=obstacleGrid[0][0]==1?0:1;
6        for(int [] ce :obstacleGrid)
7        {
8            for(int i=0;i<n;i++)
9            {
10                if(ce[i]==1)
11                dp[i]=0;
12
13                else if(i>0)
14                {
15                    dp[i]+=dp[i-1];
16                }
17            }
18            
19        }return dp[n-1];
20    }
21}