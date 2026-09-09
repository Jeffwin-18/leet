1class Solution {
2    public int countCommas(int n) {
3        if(n<1000) 
4        {
5            return 0;
6        }
7        return n-999;
8    }
9}