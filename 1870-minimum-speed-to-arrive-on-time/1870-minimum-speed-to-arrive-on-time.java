class Solution {
    public int minSpeedOnTime(int[] dist, double hour) {
      int l=1;
      int r=10000000;
      int mid=0;
      int n=dist.length;
     
      if(hour<=n-1)
      return -1;
      
      int ans=-1;
      while(l<=r)
      { double sum=0.0;
        double tot=0.0;
        mid=l+(r-l)/2;
        for(int i=0;i<n-1;i++)
        {
            tot=(dist[i]+mid-1)/mid;
            sum+=tot;
        }
        double t=(double)sum+(double) dist[dist.length-1]/mid;
        if(t<=hour)
        {
            r=mid-1;
            ans=mid;
        }
        else
        {
            l=mid+1;
        }
        
      } 
      return ans; 
    }
}