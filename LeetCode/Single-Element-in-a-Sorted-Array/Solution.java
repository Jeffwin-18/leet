1class Solution {
2    public int singleNonDuplicate(int[] nums) {
3        int l=0;
4        int r=nums.length-1;
5        int mid=0;
6        while(l<r)
7        {
8            mid=l+(r-l)/2;
9            if(mid%2==1)
10            {
11                mid--;
12            }
13            if(nums[mid]==nums[mid+1])
14            {
15                l=mid+2;
16            }
17            else
18            r=mid;
19        }
20        return nums[l];
21    }
22}