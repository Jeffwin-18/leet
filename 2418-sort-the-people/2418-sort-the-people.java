class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        int n=names.length;
        int m=heights.length;
        String temp="";
        int te=0;

        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                if(heights[j]<heights[j+1])
                {
                    temp=names[j];
                    names[j]=names[j+1];
                    names[j+1]=temp;

                    te=heights[j];
                    heights[j]=heights[j+1];
                    heights[j+1]=te;

                }
            }
        }
        return names;
    }
}