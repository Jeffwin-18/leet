class Solution {
    public int maxValidSplits(int[] nums) {
        int max=0;
        int n=nums.length;
        int v=0;
        for(int i=-1;i<n;i++)
            {
                int m=(i==-1) ?n:n-1;
                int []arr=new int [m];
                int id=0;
                for(int j=0;j<n;j++) if(j!=i) arr[id++]=nums[j];
                
                
                if(m<=1) continue;
                int [] pre=new int[m];
                pre[0]=arr[0];
                for(int j=1;j<m;j++)
                    {
                        pre[j]=gcd(pre[j-1],arr[j]);
                    }
                int [] st=new int[m];
                st[m-1]=arr[m-1];
                for(int j=m-2;j>=0;j--)
                    {
                        st[j]=gcd(st[j+1],arr[j]);
                    }
                int sp=0;
                for(int j=0;j<m-1;j++)
                    {
                        if(pre[j]==st[j+1])
                        {
                            sp++;
                        }
                    }
                max=Math.max(max, sp);
            }
        return max;
    }
    private int gcd (int a,int b) {
        return b==0?a:gcd(b,a%b);
    }
}