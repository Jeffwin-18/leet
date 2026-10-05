1class Solution {
2    public int countHousePlacements(int n) {
3        long mod=1000000007;
4        long a=1;
5        long b=2;
6        long c=2;
7        for(int i=2;i<=n;i++)
8        {
9            c=(a+b)%mod;
10            a=b;
11            b=c;
12
13        }
14        long tot=(c*c)%mod;
15        return (int) tot;
16    }
17}