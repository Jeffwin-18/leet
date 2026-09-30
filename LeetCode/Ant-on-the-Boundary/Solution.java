1class Solution {
2    public int returnToBoundaryCount(int[] nums) {
3        int s=0;
4        int c=0;
5        for(int i=0;i<nums.length;i++)
6    {
7        s+=nums[i];
8    
9    if(s==0)
10c++;
11    }
12    return c;
13    }
14}