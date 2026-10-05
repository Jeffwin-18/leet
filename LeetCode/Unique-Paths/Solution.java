1class Solution {
2    public int uniquePaths(int m, int n) {
3
4        int [] dp=new int[n];
5        Arrays.fill(dp,1);
6        for( int i=1;i<m;i++)
7        {
8            for(int j=1;j<n;j++)
9            {
10                dp[j]+=dp[j-1];
11            }
12        }
13        return dp[n-1];
14    } 
15}
16