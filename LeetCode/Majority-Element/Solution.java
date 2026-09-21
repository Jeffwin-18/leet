1class Solution {
2    public int majorityElement(int[] nums) {
3        int n=nums.length;
4        int can=0;
5        int c=0;
6        for(int i:nums)
7        {
8            if(c==0)
9            {
10                can=i;
11                
12            }
13            if(i==can)
14            {
15                c++;
16            }
17            else
18            {
19                c--;
20            }
21        }
22        return can;
23        
24    }
25}