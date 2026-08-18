class Solution {
    public int countPrimes(int n) {
        int c=0;
        boolean [] np= new boolean[n];
        for (int i=2;i<n;i++)
        {
            if(np[i]== false)
            {c++;
            for(int j=2;i*j<n;j++)
            {
                np[i*j]=true;
            }
        }
        }
        return c;
    }
}