class Solution {
    public int maxProfit(int[] prices) {
        int hold=-prices[0];
        int sell=0;
        int rest=0;

        for(int i=1;i<prices.length;i++)
        {
            int ph=hold;
            int ps=sell;
            int pr=rest;
            hold=Math.max(ph,pr-prices[i]);
            sell=ph+prices[i];
            rest=Math.max(pr,ps);
        }
        return Math.max(sell,rest);
    }
}