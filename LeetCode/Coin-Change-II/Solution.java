1class Solution {
2    public int change(int amount, int[] coins) {
3        int dp[] =new int [amount+1];
4        dp[0]=1;
5        for( int c:coins)
6        {
7            for(int i=c;i<=amount;i++)
8            {
9                dp[i]+=dp[i-c];
10            }
11        }
12        return dp[amount];
13    }
14}