1class Solution {
2    public int minimumSize(int[] nums, int maxOperations) {
3        int l=1;
4        int r=0;
5        for(int i=0;i<nums.length;i++)
6        {
7            r=Math.max(r,nums[i]);
8        }
9        int ans=r;
10        while(l<=r)
11        {
12            int mid=l+(r-l)/2;
13            long op=0;
14            for(int n:nums)
15            {
16                if(n>=mid)
17                {
18                    op+=(n-1)/mid;
19                }
20            }
21            if(op<=maxOperations)
22            {
23                ans=mid;
24                r=mid-1;
25            }
26            else
27            {
28                l=mid+1;
29            }
30        }
31        return ans;
32    }
33}