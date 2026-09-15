class Solution {
    public int hammingDistance(int x, int y) {
        int c=0;
        int a=x^y;
        while(a!=0)
        {
            int d=a%2;
            
                if(d==1 || d==-1)
                {
                    c++;
                }
            a=a/2;
            
        }
        return c;
    }
}