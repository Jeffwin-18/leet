class Solution {
    public int maxCoins(int[] nums) {
        int n=nums.length;
        int []nn=new int[n+2];
        nn[0]=1;
        nn[n+1]=1;
        for(int i=0;i<n;i++)
        {
            nn[i+1]=nums[i];
        }
        int [][] dp=new int[n+2][n+2];
        for(int l=2;l<=n+1;l++)
        {
            for(int i=0;i<=n+1-l;i++)
            {
                int j=i+l;
            
            for (int k = i + 1; k < j; k++) {
                    int coins = nn[i] * nn[k] * nn[j] + dp[i][k] + dp[k][j];
                    dp[i][j] = Math.max(dp[i][j], coins);
            }
        }
    }
    return dp[0][n+1];
}
}