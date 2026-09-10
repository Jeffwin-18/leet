1class Solution {
2    public int kthSmallest(int[][] matrix, int k) {
3        int n=matrix.length;;
4        
5        int l=matrix[0][0];
6        int r=matrix[n-1][n-1];
7
8        while(l<r)
9        {
10            int mid=l+(r-l)/2;
11            int s=0;
12            int row=n-1;
13        int col=0;
14            while(row>=0 && col<matrix.length)
15            {
16                if(matrix[row][col]<=mid)
17                {
18                    s=s+row+1;
19                    col++;
20                }
21                else
22                {
23                    row--;
24                }
25            }
26            if(s<k)
27            {
28                l=mid+1;
29            }
30            else
31            {
32                r=mid;
33            }
34            
35        }
36        return l;
37    }
38}