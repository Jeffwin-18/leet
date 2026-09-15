class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        int x=0;
        Set<Integer> se=new HashSet<>();
        for(int i=0;i<nums2.length;i++)
        {
            for(int j=0;j<nums1.length;j++)
            {
                if(nums2[i]==nums1[j])
                {
                    se.add(nums2[i]);
                }
            }
        } 
        int arr[]=new int[se.size()];
        for(int i: se)
        {
            arr[x++]=i;
        }
        return arr;

    }
}