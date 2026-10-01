1class Solution {
2    public int lengthOfLIS(int[] nums) {
3        int n=nums.length;
4        int ma=1;
5        int dp[] = new int [n+1];
6         for(int i=0;i<n;i++)
7         {
8            dp[i]=1;
9            for(int j=0;j<i;j++)
10            {
11                if(nums[j]<nums[i])
12                {
13                    dp[i]=Math.max(dp[i],dp[j]+1);
14                }
15            }
16            ma=Math.max(ma,dp[i]);
17         }
18         return ma;
19    }
20}