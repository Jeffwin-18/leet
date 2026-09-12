1class Solution {
2    public int[] kthSmallestPrimeFraction(int[] arr, int k) {
3        double l=0.0;
4        double h=1.0;
5
6        while(l<h)
7        {
8            double mid=l+(h-l)/2.0;
9            int c=0;
10            int nu=0;
11            int de=1;
12            int j=1;
13
14            for(int i=0;i<arr.length;i++)
15            {
16                while(j<arr.length && arr[i]>mid*arr[j])
17                {
18                    j++;
19                }
20                if(j==arr.length)
21                {
22                    break;
23                }
24                c+=arr.length-j;
25                if((double) arr[i]/arr[j]> (double) nu/de)
26                {
27                    nu=arr[i];
28                    de=arr[j];
29                }
30            }
31            if(c==k)
32            {
33                return new int[] {nu,de};
34
35            }
36            if(c<k)
37            {
38                l=mid;
39            }
40            else
41            {
42                h=mid;
43            }
44        }
45        return new int[] {0,0}; 
46
47    }
48}