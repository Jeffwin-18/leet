class Solution {
    public int totalNumbers(int[] digits) {
        int n=digits.length;
        int ec=0;
        Set<Integer> arr=new HashSet<>();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                for(int k=0;k<n;k++)
                {
                    if(i!=j && j!=k && i!=k && digits[i]!=0 && digits[k]%2==0 )
                    {
                        arr.add((digits[i]*100)+(digits[j]*10)+(digits[k]));
                    }
                }
            }
        }
        return arr.size();
    
    }
}