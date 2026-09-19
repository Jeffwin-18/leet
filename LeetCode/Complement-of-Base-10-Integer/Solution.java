1class Solution {
2    public int bitwiseComplement(int n) {
3        int ans=0;
4        int p=1;
5        if(n==0) return 1;
6        while(n>0)
7        {
8            int b=n%2;
9            if(b==0)
10            {
11                ans+=p;
12            }
13            n/=2; 
14            p=p*2;
15        }
16        return ans;
17    }
18}