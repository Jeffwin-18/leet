1class Solution {
2    public int maxSubArray(int[] nums) {
3        if(nums.length<=1)
4        {
5            return nums[0];
6        }
7        int csum=nums[0];
8        int msum=nums[0];
9        for(int i=1;i<nums.length;i++)
10        {
11            csum=Math.max(nums[i],csum+nums[i]);
12            msum=Math.max(msum,csum);
13        }
14        return msum;
15        
16    }
17}