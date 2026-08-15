class Solution {
    public boolean isThree(int n) {
        int c=0;
        for(int i=1;i<10000;i++)
        {
            if(n%i==0)
            {
                c++;
            }
        }
        if(c==3)
        {
            return true;
        }
        else
        return false;
    }
}