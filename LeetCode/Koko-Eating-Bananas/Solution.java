1class Solution {
2    public int minEatingSpeed(int[] piles, int h) {
3        int l=1;
4
5        int r=0;
6        int mid=0;
7        for(int i:piles)
8        {
9            r=Math.max(r,i);
10        }
11        
12        while(l<r)
13        {
14            int sum=0;
15            mid=l+(r-l)/2;
16            for(int i=0;i<piles.length;i++)
17            {
18                sum=sum+(piles[i]+mid-1)/mid;
19            }
20            
21            if(sum<=h)
22            {
23                r=mid;
24            }
25            else
26            {
27                l=mid+1;
28            }
29        }
30        return l;
31    }
32}