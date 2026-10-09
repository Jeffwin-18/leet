1class Solution {
2    public int maxCoins(int[] nums) {
3        int n=nums.length;
4        int []nn=new int[n+2];
5        nn[0]=1;
6        nn[n+1]=1;
7        for(int i=0;i<n;i++)
8        {
9            nn[i+1]=nums[i];
10        }
11        int [][] dp=new int[n+2][n+2];
12        for(int l=2;l<=n+1;l++)
13        {
14            for(int i=0;i<=n+1-l;i++)
15            {
16                int j=i+l;
17            
18            for (int k = i + 1; k < j; k++) {
19                    int coins = nn[i] * nn[k] * nn[j] + dp[i][k] + dp[k][j];
20                    dp[i][j] = Math.max(dp[i][j], coins);
21            }
22        }
23    }
24    return dp[0][n+1];
25}
26}