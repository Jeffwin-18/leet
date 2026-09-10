class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
     int l=1;
     int r=0;
     for(int i=0;i<nums.length;i++)
     {
        r=Math.max(r,nums[i]);
     }
     int mid=0;
     int ans=-1;
     int sum=0;
     while(l<=r)
     {
        mid=l+(r-l)/2;
        for(int i:nums)
        {
            sum+=(i+mid-1)/mid;
        }
        if(sum<=threshold)
        {
            sum=0;
            ans=mid;
            r=mid-1;
        }
        else
        {
            l=mid+1;
            sum=0;
        }
     }   
     return ans;
    }
}