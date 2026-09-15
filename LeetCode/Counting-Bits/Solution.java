1class Solution {
2    public int[] countBits(int n) {
3        int c=0;
4        int id=0;
5        int []arr=new int[n+1];
6        for(int i=0;i<=n;i++)
7        {
8            int num=i;
9            while(num!=0)
10            {
11                num=num&(num-1);
12                c++;
13            }
14            arr[id++]=c;
15            c=0;
16        }
17        return arr;
18    }
19}