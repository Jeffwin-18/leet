1class Solution {
2    public long countCommas(long n) {
3        long a=0;
4        long b=1000;
5        while(b<=n)
6        {
7            a=a+(n-b+1);
8            b=b*1000;
9        }
10        return a;
11    }
12}