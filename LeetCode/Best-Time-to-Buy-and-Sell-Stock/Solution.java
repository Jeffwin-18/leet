1class Solution {
2    public int maxProfit(int[] prices) {
3        int l=0;
4        int r=prices.length;
5        int min=Integer.MAX_VALUE;
6        int ind=0;
7        int max=0;
8        for(int i:prices)
9        {
10            if(i<min)
11            {
12                min=i;
13            }
14            else if(i-min>max)
15            {
16                max=i-min;
17            }
18        }
19        return max;
20
21    }
22}