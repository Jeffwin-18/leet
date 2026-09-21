1class Solution {
2    public int lastRemaining(int n) {
3        if(n==1)
4        {
5            return 1;
6        }
7        return 2*(n/2+1-lastRemaining(n/2));
8        
9    }
10}