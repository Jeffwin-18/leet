class Solution {
    public int[] countBits(int n) {
        int c=0;
        int id=0;
        int []arr=new int[n+1];
        for(int i=0;i<=n;i++)
        {
            int num=i;
            while(num!=0)
            {
                num=num&(num-1);
                c++;
            }
            arr[id++]=c;
            c=0;
        }
        return arr;
    }
}