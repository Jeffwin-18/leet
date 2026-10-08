1class Solution {
2    public int maxProfit(int[] prices) {
3        int hold=-prices[0];
4        int sell=0;
5        int rest=0;
6
7        for(int i=1;i<prices.length;i++)
8        {
9            int ph=hold;
10            int ps=sell;
11            int pr=rest;
12            hold=Math.max(ph,pr-prices[i]);
13            sell=ph+prices[i];
14            rest=Math.max(pr,ps);
15        }
16        return Math.max(sell,rest);
17    }
18}