class Solution {
    public boolean canTransform(int[] source, int[] target) {
        long sc=0;
        long ss=0;
        long st=0;
        for(int i=0;i<source.length;i++)
        {
            ss+=source[i];
            st+=target[i];
        }
        return ss==st;
    }
}