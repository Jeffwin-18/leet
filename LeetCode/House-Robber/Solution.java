1class Solution {
2    public int rob(int[] nums) {
3        int sum=0;
4        int n=nums.length;
5        int max=0;
6        for(int i:nums)
7        {
8            int temp=sum;
9            sum=Math.max(sum,max+i);
10            max=temp;
11        }
12        return sum;
13    }
14}