class Solution {
    public int singleNonDuplicate(int[] nums) {
        int l=0;
        int r=nums.length-1;
        int mid=0;
        while(l<r)
        {
            mid=l+(r-l)/2;
            if(mid%2==1)
            {
                mid--;
            }
            if(nums[mid]==nums[mid+1])
            {
                l=mid+2;
            }
            else
            r=mid;
        }
        return nums[l];
    }
}