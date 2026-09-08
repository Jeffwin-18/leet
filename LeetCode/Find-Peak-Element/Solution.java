1class Solution {
2    public int findPeakElement(int[] nums) {
3        int l=0;
4        int r=nums.length-1;
5        //int mid=0;
6        while(l<r)
7        {
8            int mid=l+(r-l)/2;
9            if(nums[mid]>nums[mid+1])
10            {
11                r=mid;
12            }
13            else
14            {
15                l=mid+1;
16            }
17        }
18        return l;
19    }
20}