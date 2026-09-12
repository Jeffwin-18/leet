1class Solution {
2    public String[] sortPeople(String[] names, int[] heights) {
3        int n=names.length;
4        int m=heights.length;
5        String temp="";
6        int te=0;
7
8        for(int i=0;i<n-1;i++)
9        {
10            for(int j=0;j<n-i-1;j++)
11            {
12                if(heights[j]<heights[j+1])
13                {
14                    temp=names[j];
15                    names[j]=names[j+1];
16                    names[j+1]=temp;
17
18                    te=heights[j];
19                    heights[j]=heights[j+1];
20                    heights[j+1]=te;
21
22                }
23            }
24        }
25        return names;
26    }
27}