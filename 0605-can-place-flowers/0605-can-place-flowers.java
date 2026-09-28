class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int c=0;
        int f=1;
        for(int i:flowerbed)
        {
            if(i==0)
            {
                f++;
            }
            else
            {
                c+=(f-1)/2;
                f=0;
        }
        }
        c+=f/2;
        if(c>=n)
        {
            return true;
        }
        return false;
    }
}