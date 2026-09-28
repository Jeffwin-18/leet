class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int gl=g.length;
        int sl=s.length;
        Arrays.sort(g);
        Arrays.sort(s);
        int i=0;
        int j=0;
        while(i<gl && j<sl)
        {
            if(s[j]>=g[i])
            {
                i++;
            }
            j++;
        }
        return i;
}
}