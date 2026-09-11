1class Solution {
2    public int minSpeedOnTime(int[] dist, double hour) {
3      int l=1;
4      int r=10000000;
5      int mid=0;
6      int n=dist.length;
7     
8      if(hour<=n-1)
9      return -1;
10      
11      int ans=-1;
12      while(l<=r)
13      { double sum=0.0;
14        double tot=0.0;
15        mid=l+(r-l)/2;
16        for(int i=0;i<n-1;i++)
17        {
18            tot=(dist[i]+mid-1)/mid;
19            sum+=tot;
20        }
21        double t=(double)sum+(double) dist[dist.length-1]/mid;
22        if(t<=hour)
23        {
24            r=mid-1;
25            ans=mid;
26        }
27        else
28        {
29            l=mid+1;
30        }
31        
32      } 
33      return ans; 
34    }
35}