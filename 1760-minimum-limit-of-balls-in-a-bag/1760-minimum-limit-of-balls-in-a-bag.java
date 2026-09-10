class Solution {
    public int minimumSize(int[] nums, int maxOperations) {
        int l=1;
        int r=0;
        for(int i=0;i<nums.length;i++)
        {
            r=Math.max(r,nums[i]);
        }
        int ans=r;
        while(l<=r)
        {
            int mid=l+(r-l)/2;
            long op=0;
            for(int n:nums)
            {
                if(n>=mid)
                {
                    op+=(n-1)/mid;
                }
            }
            if(op<=maxOperations)
            {
                ans=mid;
                r=mid-1;
            }
            else
            {
                l=mid+1;
            }
        }
        return ans;
    }
}