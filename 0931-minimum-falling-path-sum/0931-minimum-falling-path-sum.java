class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int n=matrix.length;
        int []dp=matrix[0].clone();
        for( int i=1;i<n;i++)
        {
            int t[]=new int [n];
            for( int j=0;j<n;j++)
            {
                int min=dp[j];
                if(j>0)
                {
                    min=Math.min(min,dp[j-1]);
                }
                if(j<n-1)
                {
                    min=Math.min(min,dp[j+1]);
                }
                t[j]=matrix[i][j]+min;
            }
            dp=t;
        }
        int ms=Integer.MAX_VALUE;
        for(int i:dp)
        {
            ms=Math.min(ms,i);
        }
        return ms;
    }
}