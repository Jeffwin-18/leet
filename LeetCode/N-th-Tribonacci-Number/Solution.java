1class Solution {
2    public int tribonacci(int n) {
3        int a=0;
4        int b=1;
5        int c=1;
6        if(n==0) return 0;
7        if(n==1) return 1;
8        if(n==2) return 1;
9        for(int i=3;i<=n;i++)
10        {
11            int t=a+b+c;
12            a=b;
13            b=c;
14            c=t;
15        }
16        return c;
17    }
18}