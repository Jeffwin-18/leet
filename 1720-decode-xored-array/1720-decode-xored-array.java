class Solution {
    public int[] decode(int[] encoded, int first) {
        int n=encoded.length;
        int rr[] =new int [n+1];
        rr[0]=first;
        for(int i=0;i<n;i++)
        {
            rr[i+1]=rr[i]^encoded[i];
        }
        return rr;

    }
}