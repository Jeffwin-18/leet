1class Solution {
2    public int hammingDistance(int x, int y) {
3        int c=0;
4        int a=x^y;
5        while(a!=0)
6        {
7            int d=a%2;
8            
9                if(d==1 || d==-1)
10                {
11                    c++;
12                }
13            a=a/2;
14            
15        }
16        return c;
17    }
18}