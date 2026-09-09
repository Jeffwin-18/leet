class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l=1;

        int r=0;
        int mid=0;
        for(int i:piles)
        {
            r=Math.max(r,i);
        }
        
        while(l<r)
        {
            int sum=0;
            mid=l+(r-l)/2;
            for(int i=0;i<piles.length;i++)
            {
                sum=sum+(piles[i]+mid-1)/mid;
            }
            
            if(sum<=h)
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