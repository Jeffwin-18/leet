class Solution {
    public int[] singleNumber(int[] nums) {
        
        int x=0;
        for(int i=0;i<nums.length;i++)
        {
            x=x^nums[i];
        }
        int r=x&-x;
        int n1=0;
        int n2=0;
        for(int i:nums)
        {
            if(((i&r)!=0))
            {
                n1=n1^i;
            }
            else
            {
                n2=n2^i;
            }
        }
        return new int[]{n1,n2};

    }
}