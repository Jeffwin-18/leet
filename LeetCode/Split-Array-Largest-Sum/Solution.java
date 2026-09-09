1class Solution {
2    public int splitArray(int[] nums, int k) {
3        int l=0;
4        int r=0;
5        for(int i:nums)
6        {
7            l=Math.max(l,i);
8            r=r+i;
9        }
10        int mid=0;
11        while(l<r)
12        {
13            mid=l+(r-l)/2;
14            int a=1;
15            int s=0;
16
17            for(int i:nums)
18            {
19                if(s+i>mid)
20                {
21                    a++;
22                    s=i;
23                }
24                else
25                {
26                    s=s+i;
27                }
28            }
29            if(a<=k)
30            {
31                r=mid;
32            }
33            else
34            {
35                l=mid+1;
36            }
37            
38        }
39        return l;
40    }
41}