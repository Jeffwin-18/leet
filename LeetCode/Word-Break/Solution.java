1class Solution {
2    public boolean wordBreak(String s, List<String> wordDict) {
3        int n=s.length();
4        boolean [] dp=new boolean [n];
5        for(int i=0;i<n;i++)
6        {
7            for(int j=0;j<=i;j++)
8            {
9                String st=s.substring(j,i+1);
10                if(wordDict.contains(st) &&(j==0 || dp[j-1]))
11                {
12                    dp[i]=true;
13                    break;
14                }
15            }
16        }
17        return dp[n-1];
18    }
19}