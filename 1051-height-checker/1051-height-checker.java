class Solution {
    public int heightChecker(int[] heights) {
int[] h2 = Arrays.stream(heights).sorted().toArray();
        int c=0;
        int n=heights.length;
        for(int i=0;i<=n-1;i++)
        {
            //for(int j=i;j<n;j++)
            //{}
                if(heights[i]!=h2[i])
                {
                    c++;
                }
            
        }
        return c;
    }
}