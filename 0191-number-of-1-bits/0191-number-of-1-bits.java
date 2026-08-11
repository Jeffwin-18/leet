class Solution {
    public int hammingWeight(int n) {
        int[] bits = new int[32];

    for (int i = 0; i < 32; i++) 
    {
        bits[31 - i] = (n >> i) & 1;
    }
    int c=0;
    for(int i=0;i<bits.length;i++)
    {
        if(bits[i]==1)
        {
            c++;
        }
    }
    return c;
    }
}