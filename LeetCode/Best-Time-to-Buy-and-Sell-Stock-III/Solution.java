1class Solution {
2    public int maxProfit(int[] prices) {
3        int b1=Integer.MIN_VALUE;
4        int b2=Integer.MIN_VALUE;
5        int s1=0;
6        int s2=0;
7
8        for(int i:prices)
9        {
10            b1=Math.max(b1,-i);
11            s1=Math.max(s1,(b1+i));
12            b2=Math.max(b2,(s1-i));
13            s2=Math.max(s2,(b2+i));
14        }
15        return s2;
16    }
17}