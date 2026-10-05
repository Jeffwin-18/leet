class Solution {
    public int countHousePlacements(int n) {
        long mod=1000000007;
        long a=1;
        long b=2;
        long c=2;
        for(int i=2;i<=n;i++)
        {
            c=(a+b)%mod;
            a=b;
            b=c;

        }
        long tot=(c*c)%mod;
        return (int) tot;
    }
}