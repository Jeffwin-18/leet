1class Solution {
2    public int shipWithinDays(int[] weights, int days) {
3        int l=0;
4        int r=0;
5        for(int i:weights)
6        {
7            l=Math.max(l,i);
8            r += i;
9        }
10        int mid=0;
11        while(l<r)
12        {
13            mid=l+(r-l)/2;
14            int dn = 1;
15            int cl = 0;
16            for(int i : weights){
17                if(cl + i > mid){
18                    dn++;
19                    cl = i;
20                }
21                else{
22                    cl += i;
23                }
24            }
25            
26            
27            if(dn<=days)
28            {
29                r=mid;
30            }
31            else
32            {
33                l=mid+1;
34            }
35        }
36        return l;
37    }
38}