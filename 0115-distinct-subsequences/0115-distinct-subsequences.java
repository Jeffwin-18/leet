class Solution {
    public int numDistinct(String s, String t) {
        int sl=s.length();
        int tl=t.length();
        int [][] dp=new int[sl+1][tl+1];
        for( int i=0;i<=sl;i++)
        {
            dp[i][0]=1;
        }
        for(int i=1;i<=sl;i++)
        {
            for(int j=1;j<=tl;j++)
            {
                char cs=s.charAt(i-1);
                char ct=t.charAt(j-1);
                if(cs==ct)
                {
                    dp[i][j]=dp[i-1][j-1]+dp[i-1][j];
                }
                else
                {
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        return dp[sl][tl];
    }
}