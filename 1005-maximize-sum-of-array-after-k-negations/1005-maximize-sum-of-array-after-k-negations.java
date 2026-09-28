class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {
        Arrays.sort(nums);
        int sum=0;
        int n=nums.length;
        int i=0;
        while(i<k)
        {
            //if(nums[0]==0) continue;
            
            nums[0]=nums[0]*-1;
            Arrays.sort(nums);
            i++;
        }
        for(int j=0;j<n;j++)
        {
            sum+=nums[j];
        }
        return sum;
    }
}