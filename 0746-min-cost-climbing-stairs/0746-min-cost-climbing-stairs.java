class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int c1=0;
        int c2=0;
        for(int i=2;i<=cost.length;i++)
        {
            int mc=Math.min(c1+cost[i-1],c2+cost[i-2]);
            c2=c1;
            c1=mc;
        }
        return c1;
    }
}