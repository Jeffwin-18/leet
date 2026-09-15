1class Solution {
2    public int maximumGap(int[] nums) {
3        int ma=0;
4        Arrays.sort(nums);
5        int n=nums.length;
6        for(int i=0;i<n-1;i++)
7        {
8            int l=(nums[i+1]-nums[i]);
9            
10                ma=Math.max(ma,l);
11            
12        }
13        return ma;
14    }
15}