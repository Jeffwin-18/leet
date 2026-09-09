class Solution {
    public long countCommas(long n) {
        long a=0;
        long b=1000;
        while(b<=n)
        {
            a=a+(n-b+1);
            b=b*1000;
        }
        return a;
    }
}