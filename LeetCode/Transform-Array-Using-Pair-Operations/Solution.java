1class Solution {
2    public boolean canTransform(int[] source, int[] target) {
3        long sc=0;
4        long ss=0;
5        long st=0;
6        for(int i=0;i<source.length;i++)
7        {
8            ss+=source[i];
9            st+=target[i];
10        }
11        return ss==st;
12    }
13}