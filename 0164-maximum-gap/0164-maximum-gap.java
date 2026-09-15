class Solution {
    public int maximumGap(int[] nums) {
        int ma=0;
        Arrays.sort(nums);
        int n=nums.length;
        for(int i=0;i<n-1;i++)
        {
            int l=(nums[i+1]-nums[i]);
            
                ma=Math.max(ma,l);
            
        }
        return ma;
    }
}