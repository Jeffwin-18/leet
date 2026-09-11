class Solution {
    public int[] sortArray(int[] nums) {
        int n=nums.length;
        int mid=n/2;
        int []left=new int [mid];
        int [] right=new int[n-mid];
        if(nums.length<=1)
        {
            return nums;
        }
        System.arraycopy(nums,0,left,0,mid);
        System.arraycopy(nums,mid,right,0,n-mid);

        sortArray(left);
        sortArray(right);
        merge(nums,left,right);

        return nums;
    }
    public static void merge(int []  num, int []left,int []right)
    {
        int i=0,j=0,k=0;
        while(i<left.length && j<right.length)
        {
            if(left[i]<right[j])
            {
                num[k++]=left[i++];
            }
        
            else
            {
                num[k++]=right[j++];
            }
        }
            while(i<left.length)
            {
                num[k++]=left[i++];
            }
            while(j<right.length)
            {
                num[k++]=right[j++];
            }
        
    }
}