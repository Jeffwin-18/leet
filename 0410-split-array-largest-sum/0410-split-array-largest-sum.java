class Solution {
    public int splitArray(int[] nums, int k) {
        int l=0;
        int r=0;
        for(int i:nums)
        {
            l=Math.max(l,i);
            r=r+i;
        }
        int mid=0;
        while(l<r)
        {
            mid=l+(r-l)/2;
            int a=1;
            int s=0;

            for(int i:nums)
            {
                if(s+i>mid)
                {
                    a++;
                    s=i;
                }
                else
                {
                    s=s+i;
                }
            }
            if(a<=k)
            {
                r=mid;
            }
            else
            {
                l=mid+1;
            }
            
        }
        return l;
    }
}