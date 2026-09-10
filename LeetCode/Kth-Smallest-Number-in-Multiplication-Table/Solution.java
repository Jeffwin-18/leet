1class Solution {
2    public int findKthNumber(int m, int n, int k) {
3        
4        int l=1;
5        int r=m*n;
6
7        while(l<r)
8        {
9            int mid=l+(r-l)/2;
10            int s=0;
11            int row=m;
12            int col=1;
13            while(row>=1 && col<=n)
14            {
15                if(row*col<=mid)
16                {
17                    s=s+row;
18                    col++;
19                }
20                else
21                {
22                    row--;
23                }
24            }
25            if(s<k)
26            {
27                l=mid+1;
28            }
29            else
30            {
31                r=mid;
32            }
33            
34        }
35        return l;
36    }
37}