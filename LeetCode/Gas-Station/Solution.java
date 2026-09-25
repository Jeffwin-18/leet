1class Solution {
2    public int canCompleteCircuit(int[] gas, int[] cost) {
3        int net=0;
4        int ct=0;
5        int st=0;
6        for(int i=0;i<gas.length;i++)
7        {
8            net=net+(gas[i]-cost[i]);
9            ct=ct+(gas[i]-cost[i]);
10            if(ct<0)
11            {
12                ct=0;
13                st=i+1;
14                
15            }
16
17        }
18        if(net<0)
19        return -1;
20
21        return st;
22    }
23}