1class Solution {
2    public int maxProfit(int[] prices) {
3        int max=0;
4        for(int i=1;i<prices.length;i++)
5        {
6            if(prices[i]>prices[i-1])
7            {
8                max+=prices[i]-prices[i-1];
9            }
10        }
11        return max;
12    }
13}