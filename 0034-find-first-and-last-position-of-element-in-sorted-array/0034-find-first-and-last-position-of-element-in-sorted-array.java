class Solution {
    public int[] searchRange(int[] nums, int target) {
        int l=0;
        int r=nums.length-1;
        int mid=0;
        int arr[]=new int[]{-1,-1};
        if(nums==null || nums.length==0)
        return arr;

        while(l<=r)
        {
            mid=l+(r-l)/2;
            if(nums[mid]==target)
            {
                arr[0]=mid;
                r=mid-1;
            }
            else if(nums[mid]<target)
            {
                l=mid+1;
            }
            else
            {
                r=mid-1;
            }
            
        }
        l=0;
        r=nums.length-1;
        while(l<=r)
        {
             mid=l+(r-l)/2;
            if(nums[mid]==target)
            {
                arr[1]=mid;
                l=mid+1;
            }
            else if(nums[mid]<target)
            {
                l=mid+1;
            }
            else
            {
                r=mid-1;
            }

        }
        return arr;
    }
}