class Solution {
    public double myPow(double x, long n) {
        double r=1.0;
        long a=n;
        //if(x==2.00000 && n==-2147483648)
        //return 0.00000;
        /*if(n<0)
        {
            x=1/x;
            a=-a;
        }
        while(a>0)
        {
        if(a%2==1)
        {
            r*=x;
        }
            x*=x;
            a=a/2;
        }
        return r;
        above accepted*/
        if(n==0)
        {
            return 1;
        }
        if (n<0)
        {
            n=-n;
            x=1/x;
        }
        if(n%2==0)
        {
            return myPow(x*x,n/2);
        }
        else
        {
            return x*myPow(x*x,n/2);
        }
        

    }
}

