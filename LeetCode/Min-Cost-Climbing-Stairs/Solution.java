1class Solution {
2    public int minCostClimbingStairs(int[] cost) {
3        int c1=0;
4        int c2=0;
5        for(int i=2;i<=cost.length;i++)
6        {
7            int mc=Math.min(c1+cost[i-1],c2+cost[i-2]);
8            c2=c1;
9            c1=mc;
10        }
11        return c1;
12    }
13}