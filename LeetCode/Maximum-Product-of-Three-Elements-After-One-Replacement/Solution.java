1class Solution {
2    public long maxProduct(int[] nums) {
3        for(int i=0;i<nums.length;i++)
4        {
5            if(nums[i]<0)
6            {
7                nums[i]=nums[i]*-1;
8            }
9        }
10        Arrays.sort(nums);
11        nums[nums.length-3]=100000;
12        long sum=1;
13        for(int i=nums.length-3;i<nums.length;i++)
14        {
15            sum=sum*nums[i];
16        }
17        return sum;
18    }
19}