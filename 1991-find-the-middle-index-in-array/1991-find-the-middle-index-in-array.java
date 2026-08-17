class Solution {
    public int findMiddleIndex(int[] nums) {
        int n=nums.length;
        int s1=0;
        int s2=0;
        if(n==0) return -1;

        for(int i=0;i<n;i++)
        {
            s1=s1+nums[i];
        }
        for(int i=0;i<n;i++)
        {
            s1=s1-nums[i];
        
        if(s1==s2)
            return i;
        s2+=nums[i];
        
            
        

        }return -1;
    }
}