class Solution {
    public int searchInsert(int[] nums, int target) {
        int l=0,r=nums.length-1;
        boolean at=false;
        int mid=0;
        int ind=0;
        
        while(l<=r)
        {
            mid=l+(r-l)/2;
            if(nums[mid]==target)
            {
                 at=true;
                 ind=mid;
                break;
            }
            else if(target<nums[mid])
            {
                r=mid-1;
            }
            else
            {
                l=mid+1;
            }

        }
        
        if(at)
        {
            return mid;
        }
        else
        {
            return l;
        }

        
    }
}