1class Solution {
2    public int kthGrammar(int n, int k) {
3        if(k==1)
4        {
5            return 0;
6        }
7        int p=kthGrammar(n-1,(k+1)/2);
8        if(k%2==0)
9        {
10            return 1-p;
11        }
12        else
13        {
14            return p;
15        }
16    }
17}