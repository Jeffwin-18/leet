1class Solution {
2    public boolean searchMatrix(int[][] matrix, int target) {
3        int m=matrix.length;
4        int n=matrix[0].length;
5        int row=0;
6        int col=n-1;
7        while(row<m && col>=0)
8        {
9            //mid=l+(r-l)/2;
10            
11            if(matrix[row][col]==target)
12            {
13                return true;
14            }
15            else if(matrix[row][col]>target)
16            {
17                col--;
18            }
19            else
20            {
21                row++;
22            }
23        }
24        return false;
25    }
26}