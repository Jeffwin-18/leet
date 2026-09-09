class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int l=0;
        int r=0;
        for(int i:weights)
        {
            l=Math.max(l,i);
            r += i;
        }
        int mid=0;
        while(l<r)
        {
            mid=l+(r-l)/2;
            int dn = 1;
            int cl = 0;
            for(int i : weights){
                if(cl + i > mid){
                    dn++;
                    cl = i;
                }
                else{
                    cl += i;
                }
            }
            
            
            if(dn<=days)
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