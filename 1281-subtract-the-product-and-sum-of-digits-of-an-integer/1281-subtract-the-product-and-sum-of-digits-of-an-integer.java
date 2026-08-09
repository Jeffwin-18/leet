class Solution {
    public int subtractProductAndSum(int n) {
        int p=1;
        int s=0;
        int n1=n;
        while(n1>0)
        {
            int a=n1%10;
            p=p*a;
            n1=n1/10;
        }
        while(n>0)
        {
            int b=n%10;
            s=s+b;
            n=n/10;
        }
        return p-s;
    }
}