1class Solution {
2    public int countIntersectingIntervals(int[][] intervals) {
3        int c=0;
4        int n=intervals.length;
5        for(int i=0;i<n;i++)
6        {
7            for(int j=i+1;j<n;j++)
8            {
9                if (intervals[i][0] <= intervals[j][1] &&
10                    intervals[j][0] <= intervals[i][1])
11                {
12                    c++;
13                }
14            }
15        }
16        return c;
17    }
18}