class Solution {
    public int monotoneIncreasingDigits(int n) {
        char[] digi=String.valueOf(n).toCharArray();
        int nl=digi.length;

        for(int i=nl-1;i>0;i--)
        {
            if(digi[i-1]>digi[i])
            {
                digi[i-1]--;
                nl=i;
            }
        }
        for(int j=nl;j<digi.length;j++)
        {
            digi[j]='9';
        }
        return Integer.parseInt(new String (digi));
    }
}