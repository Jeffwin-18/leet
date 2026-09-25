1class Solution {
2    public boolean canJump(int[] nums) {
3        int far=0;
4        for(int i=0;i<nums.length;i++)
5        {
6            if(i>far)return false;
7            far=Math.max(far,i+nums[i]);
8            
9
10            if(far>=nums.length-1)
11            {
12                return true;
13                
14            }
15        }
16        return false; 
17    }
18}