1class Solution {
2    public char findKthBit(int n, int k) {
3        StringBuilder s=new StringBuilder("0");
4        if(n==0) return '0';
5        for(int i=2;i<=n;i++)
6        {
7            StringBuilder in=new StringBuilder();
8            for(int j=0;j<s.length();j++)
9            {
10                in.append(s.charAt(j)== '0' ? '1':'0');
11            }
12            in.reverse();
13            s.append("1").append(in);
14        }
15        
16        
17        return s.charAt(k-1);
18    }
19}