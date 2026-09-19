class Solution {
    public int bitwiseComplement(int n) {
        int ans=0;
        int p=1;
        if(n==0) return 1;
        while(n>0)
        {
            int b=n%2;
            if(b==0)
            {
                ans+=p;
            }
            n/=2; 
            p=p*2;
        }
        return ans;
    }
}