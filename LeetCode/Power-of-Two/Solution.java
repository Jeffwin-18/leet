1class Solution {
2    public boolean isPowerOfTwo(int n) {
3        int r=1;
4        if(n==r)
5        {
6            return true;
7        }
8        return n>0 && (n&n-1)==0;
9    }
10}