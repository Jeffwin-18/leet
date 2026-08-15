class Solution {
    public int minOperations(String s) {
        int n=s.length();
        int ans =Integer.MAX_VALUE;
        for(int k=0;k<=n;k++){
            int c=k;

        for(int i=0;i<n/2;i++)
            {
                int a=s.charAt((i+k)%n)-'a';
                int b=s.charAt((n-1-i+k)%n)-'a';

                int d=Math.abs(a-b);
                
        c+=Math.min(d,26-d);
            }
        ans=Math.min(ans,c);
    }
    return ans;
}}