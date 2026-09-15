1class Solution {
2    public int singleNumber(int[] nums) {
3        int ans=0;
4        for(int i: nums)
5        {
6            ans=ans^i;
7        }
8        return ans;
9    }
10}