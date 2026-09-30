class Solution {
    public int rob(int[] nums) {



        int n=nums.length;
        if(n==1) return nums[0];
        return Math.max(robs(nums,0,n-2),robs(nums,1,n-1));
    }
    private int robs(int [] nums, int low, int high)
    {
        int r1=0;
        int r2=0;
        for( int i=low;i<=high;i++)
        {
            int max=Math.max(r1,r2+nums[i]);
            r2=r1;
            r1=max;
        }
        return r1;
    }
}