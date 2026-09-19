class Solution {
    public int findComplement(int num) {
        int ans=0;
        int p=1;
        while(num>0)
        {
            int b=num%2;
            if(b==0)
            {
                ans+=p;
            }
            num/=2; 
            p=p*2;
        }
        return ans;
    }
   
}