class Solution {
    public int findKthNumber(int m, int n, int k) {
        
        int l=1;
        int r=m*n;

        while(l<r)
        {
            int mid=l+(r-l)/2;
            int s=0;
            int row=m;
            int col=1;
            while(row>=1 && col<=n)
            {
                if(row*col<=mid)
                {
                    s=s+row;
                    col++;
                }
                else
                {
                    row--;
                }
            }
            if(s<k)
            {
                l=mid+1;
            }
            else
            {
                r=mid;
            }
            
        }
        return l;
    }
}