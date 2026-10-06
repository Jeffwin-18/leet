1class Solution {
2    public int numSquares(int n) {
3        int []dp=new int[n+1];
4        Arrays.fill(dp,n);
5        dp[0]=0;
6        dp[1]=1;
7        for(int i=2;i<=n;++i)
8        {
9            for(int j=1;j*j<=i;++j)
10            {
11                dp[i]=Math.min(dp[i],dp[i-j*j]+1);
12            }
13        }
14        return dp[n];
15    }
16}