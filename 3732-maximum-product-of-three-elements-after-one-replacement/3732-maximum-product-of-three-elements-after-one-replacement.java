class Solution {
    public long maxProduct(int[] nums) {
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]<0)
            {
                nums[i]=nums[i]*-1;
            }
        }
        Arrays.sort(nums);
        nums[nums.length-3]=100000;
        long sum=1;
        for(int i=nums.length-3;i<nums.length;i++)
        {
            sum=sum*nums[i];
        }
        return sum;
    }
}